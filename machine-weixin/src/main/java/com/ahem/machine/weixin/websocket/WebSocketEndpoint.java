package com.ahem.machine.weixin.websocket;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;

import javax.servlet.http.HttpSession;
import javax.websocket.EndpointConfig;
import javax.websocket.OnClose;
import javax.websocket.OnError;
import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.Session;
import javax.websocket.server.ServerEndpoint;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;
import org.springframework.web.context.ContextLoader;

import com.ahem.machine.weixin.core.TimeCounter;
import com.ahem.machine.weixin.service.TimeService;
import com.alibaba.fastjson.JSONObject;

@ServerEndpoint(value = "/websocket", configurator = HttpSessionConfigurator.class)
@Component
public class WebSocketEndpoint {
	private Logger logger = LoggerFactory.getLogger(WebSocketEndpoint.class);

	// 静态变量，用来记录当前在线连接数。应该把它设计成线程安全的。
	private static volatile int onlineCount = 0;

	// concurrent包的线程安全Set，用来存放每个客户端对应的MyWebSocket对象。
	private static CopyOnWriteArraySet<WebSocketEndpoint> webSocketSet = new CopyOnWriteArraySet<WebSocketEndpoint>();

	// 与某个客户端的连接会话，需要通过它来给客户端发送数据
	private Session socketSession;

	private HttpSession httpSession;

	// 用户详情
	private UserDetails userDetails;

	TimeCounter timeCounter;

	public WebSocketEndpoint(@Autowired TimeCounter timeCounter) {
		this.timeCounter = timeCounter;
	}

	/**
	 * 连接建立成功调用的方法
	 */
	@OnOpen
	public void onOpen(Session session, EndpointConfig config) {
		logger.debug("一个客户端连接成功！");
		// 设置httpSession
		this.httpSession = (HttpSession) config.getUserProperties().get(HttpSession.class.getName());
		this.socketSession = session;
		webSocketSet.add(this); // 加入set中
		addOnlineCount(); // 在线数加1
		try {

			// 发送开奖时间
			sendMessage(timeCounter.getTime());
		} catch (IOException e) {
			logger.error("发送消息失败!", e);
		}

	}

	/**
	 * 连接关闭调用的方法
	 */
	@OnClose
	public void onClose() {
		webSocketSet.remove(this); // 从set中删除
		subOnlineCount(); // 在线数减1
		System.out.println("有一连接关闭！当前在线人数为" + getOnlineCount());
	}

	/**
	 * 收到客户端消息后调用的方法
	 *
	 * @param message
	 *            客户端发送过来的消息
	 * @throws IOException
	 */
	@OnMessage
	public void onMessage(String message, Session session) throws IOException {
		System.out.println("来自客户端的消息:" + message);

		Map<String, Object> map = new HashMap<String, Object>();
		map.put("username", userDetails.getUsername());
		String msg = getMessage(message, "chat", map);
		// 群发消息
		broadcast(msg);
	}

	/**
	 * 发生错误时调用
	 */
	@OnError
	public void onError(Session session, Throwable error) {
		System.out.println("发生错误");
		error.printStackTrace();
	}

	public void sendMessage(String message) throws IOException {
		this.socketSession.getBasicRemote().sendText(message);
		// this.session.getAsyncRemote().sendText(message);
	}

	/**
	 * 群发自定义消息
	 */
	public static void broadcast(String message) {
		for (WebSocketEndpoint item : webSocketSet) {
			try {
				item.sendMessage(message);
			} catch (IOException e) {
				e.printStackTrace();
				continue;
			}
		}
	}

	/**
	 * 组装返回给前台的消息
	 * 
	 * @param message
	 *            交互信息
	 * @param type
	 *            信息类型
	 * @param list
	 *            在线列表
	 * @return
	 */
	public String getMessage(String message, String type, Map<String, Object> map) {
		JSONObject member = new JSONObject();
		member.put("message", message);
		member.put("type", type);
		member.put("datas", map);
		return member.toString();
	}

	public static synchronized int getOnlineCount() {
		return onlineCount;
	}

	public static synchronized void addOnlineCount() {
		WebSocketEndpoint.onlineCount++;
	}

	public static synchronized void subOnlineCount() {
		WebSocketEndpoint.onlineCount--;
	}
}
