package com.ahem.machine.weixin.websocket;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.socket.CloseStatus;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketHandler;
import org.springframework.web.socket.WebSocketMessage;
import org.springframework.web.socket.WebSocketSession;

import com.ahem.machine.weixin.core.TimeCounter;

public class SysWebSocketHandler implements WebSocketHandler {
	private final static Logger logger = LoggerFactory.getLogger(SysWebSocketHandler.class);
	private static List<WebSocketSession> users = Collections.synchronizedList(new ArrayList<WebSocketSession>());

	@Autowired
	TimeCounter timeCounter;

	@Override
	public void afterConnectionClosed(WebSocketSession session, CloseStatus status) throws Exception {
		System.out.println("Connection closed..." + session.getRemoteAddress().toString());
		logger.debug("连接已经关闭，用户：" + session.getRemoteAddress().toString());
		users.remove(session); //移除用户
	}

	@Override
	public void afterConnectionEstablished(WebSocketSession session) throws Exception {
		logger.debug("连接成功，用户：" + session.getRemoteAddress().toString());
		users.add(session); // 加入set中
		// 连接成功后发送定时器时间
		// WebMessage webMessage = new
		// WebMessage(WebMessage.MessageType.time_count, "00:10:11");
		// session.sendMessage(new TextMessage(webMessage.toJsonString()));
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
	public static void sendMessageToUsers(TextMessage message) {
		logger.error("准备群发给" + users.size() + "名用户");
		for (WebSocketSession user : users) {
			try {
				if (user.isOpen()) {
					user.sendMessage(message);
				}
			} catch (IOException e) {
				logger.error("群发发送消息失败：" + message.getPayload(), e);
			}
		}
	}

}
