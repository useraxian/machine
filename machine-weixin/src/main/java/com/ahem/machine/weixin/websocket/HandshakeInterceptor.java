package com.ahem.machine.weixin.websocket;

import java.util.Map;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.http.server.ServletServerHttpRequest;
import org.springframework.web.socket.WebSocketHandler;
import org.springframework.web.socket.server.support.HttpSessionHandshakeInterceptor;

import com.ahem.machine.weixin.core.Global;
import com.ahem.machine.weixin.entity.TMachineUser;

public class HandshakeInterceptor extends HttpSessionHandshakeInterceptor {
	private final static Logger logger = LoggerFactory.getLogger(HandshakeInterceptor.class);

	@Override
	public boolean beforeHandshake(ServerHttpRequest request, ServerHttpResponse response, WebSocketHandler wsHandler,
			Map<String, Object> attributes) throws Exception {
		logger.debug("beforeHandshake start.....");
		logger.debug(request.getClass().getName());
		if (request instanceof ServletServerHttpRequest) {
			ServletServerHttpRequest servletRequest = (ServletServerHttpRequest) request;
			HttpSession session = servletRequest.getServletRequest().getSession(false);
			if (session != null) {
				// 使用userName区分WebSocketHandler，以便定向发送消息
				TMachineUser user = (TMachineUser) session.getAttribute(Global.SEESION_USER_KEY);
				System.out.println("user="+user);
//				attributes.put(Global.SEESION_USER_KEY, user);
			} else {
				return false;
			}
		}
		return true;
	}

	@Override
	public void afterHandshake(ServerHttpRequest request, ServerHttpResponse response, WebSocketHandler wsHandler,
			Exception ex) {
		System.out.println("After Handshake");
		super.afterHandshake(request, response, wsHandler, ex);
	}

}
