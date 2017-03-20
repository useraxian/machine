package com.ahem.machine.weixin.websocket;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketHandler;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.TextWebSocketHandler;

import com.ahem.machine.weixin.core.TimeCounter;

/**
 * Echo messages by implementing a Spring {@link WebSocketHandler} abstraction.
 */
public class TimeWebSocketHandler extends TextWebSocketHandler {

	@Autowired
	TimeCounter timeCounter;

//	@Autowired
//	public TimeWebSocketHandler(EchoService echoService) {
//		this.echoService = echoService;
//	}

	@Override
	public void handleTextMessage(WebSocketSession session, TextMessage message) throws Exception {
		String time = this.timeCounter.getTime();
		session.sendMessage(new TextMessage(time));
	}

}