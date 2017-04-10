package com.ahem.machine.weixin.websocket;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.socket.CloseStatus;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketHandler;
import org.springframework.web.socket.WebSocketMessage;
import org.springframework.web.socket.WebSocketSession;

import com.ahem.machine.weixin.core.Global;
import com.ahem.machine.weixin.core.TimeCounter;
import com.ahem.machine.weixin.entity.TMachineUser;

public class SysWebSocketHandler implements WebSocketHandler {
	private final static Logger logger = LoggerFactory.getLogger(SysWebSocketHandler.class);
	private static ConcurrentMap<Integer, WebSocketSession> userMap = new ConcurrentHashMap<>();
	@Autowired
	TimeCounter timeCounter;

	@Override
	public void afterConnectionClosed(WebSocketSession session, CloseStatus status) throws Exception {
		System.out.println("Connection closed..." + session.getRemoteAddress().toString());
		logger.debug("连接已经关闭，用户：" + session.getRemoteAddress().toString());

		Map<String, Object> attributes = session.getAttributes();
		TMachineUser user = (TMachineUser) attributes.get(Global.SEESION_USER_KEY);
		Integer userId = user.getId();
		userMap.remove(userId, session);// 移除用户
	}

	@Override
	public void afterConnectionEstablished(WebSocketSession session) throws Exception {
		logger.debug("连接成功，用户：" + session.getRemoteAddress().toString());

		Map<String, Object> attributes = session.getAttributes();
		TMachineUser user = (TMachineUser) attributes.get(Global.SEESION_USER_KEY);
		Integer userId = user.getId();
		userMap.put(userId, session); // 加入set中
	}

	@Override
	public void handleMessage(WebSocketSession session, WebSocketMessage<?> msg) throws Exception {
		try {
			logger.debug("收到客户端消息：" + msg.getPayload());
			TextMessage returnMessage = new TextMessage(msg.getPayload() + " received at server");
			session.sendMessage(returnMessage);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void handleTransportError(WebSocketSession session, Throwable arg1) throws Exception {
		if (session.isOpen()) {
			session.close();
		}
		System.out.println(arg1.toString());
		System.out.println("WS connection error,close...");
	}

	@Override
	public boolean supportsPartialMessages() {
		return false;
	}

	/**
	 * 给所有在线用户发送消息
	 *
	 * @param message
	 */
	public static void broadcast(TextMessage message) {
		logger.error("准备群发给" + userMap.size() + "名用户");
		Collection<WebSocketSession> usersSession = userMap.values();
		for (WebSocketSession session : usersSession) {
			try {
				if (session.isOpen()) {
					session.sendMessage(message);
				}
			} catch (IOException e) {
				logger.error("群发发送消息失败：" + message.getPayload(), e);
			}
		}
	}

	/**
	 * 发送消息给指定用户
	 *
	 * @param message
	 */
	public static void sendMsgToUser(Integer userId, TextMessage message) {
		logger.error("发送消息给用户：" + userId + ",消息：" + message);
		try {
			WebSocketSession session = userMap.get(userId);
			if (session.isOpen()) {
				session.sendMessage(message);
			}
		} catch (IOException e) {
			logger.error("发送消息失败！用户：" + userId + ",消息：" + message);
		}
	}

}
