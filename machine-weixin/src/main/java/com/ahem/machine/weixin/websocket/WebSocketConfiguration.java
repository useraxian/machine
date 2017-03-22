package com.ahem.machine.weixin.websocket;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.socket.config.annotation.EnableWebSocket;
import org.springframework.web.socket.config.annotation.WebSocketConfigurer;
import org.springframework.web.socket.config.annotation.WebSocketHandlerRegistry;

@Configuration
@EnableWebSocket  // 声明支持websocket
public class WebSocketConfiguration implements WebSocketConfigurer {
	@Override
	public void registerWebSocketHandlers(WebSocketHandlerRegistry registry) {

		// 注册websocket实现类，指定参数访问地址;allowed-origins="*" 允许跨域
		registry.addHandler(syshandler(), "/websocket").setAllowedOrigins("*");
		// 允许客户端使用SockJS
		registry.addHandler(syshandler(), "/sockjs/websocket").withSockJS();
	}


	@Bean
	public SysWebSocketHandler syshandler(){
		return new SysWebSocketHandler();
	}
}
