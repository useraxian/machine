package com.ahem.machine.weixin.websocket;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.socket.WebSocketHandler;
import org.springframework.web.socket.config.annotation.EnableWebSocket;
import org.springframework.web.socket.config.annotation.WebSocketConfigurer;
import org.springframework.web.socket.config.annotation.WebSocketHandlerRegistry;

@Configuration  
@EnableWebMvc  
@EnableWebSocket//开启websocket  
public class WebSocketConfiguration extends WebMvcConfigurerAdapter implements WebSocketConfigurer {  
  
    @Override  
    public void registerWebSocketHandlers(WebSocketHandlerRegistry registry) {  
  
        registry.addHandler(echoWebSocketHandler(), "/time").addInterceptors(handshakeInterceptor()); //提供符合W3C标准的Websocket数据  
        registry.addHandler(echoWebSocketHandler(), "/websocket"); 
  
        registry.addHandler(echoWebSocketHandler(), "/sockjs/time").addInterceptors(handshakeInterceptor()).withSockJS();//提供符合SockJS的数据  
        registry.addHandler(echoWebSocketHandler(), "/sockjs/websocket").withSockJS();//提供符合SockJS的数据  
    }  
  
    @Bean  
    public WebSocketHandler echoWebSocketHandler() {  
        return new TimeWebSocketHandler();  
    } 
    
    @Bean  
    public WebSocketHandler systemWebSocketHandler() {  
    	return new SystemWebSocketHandler();  
    } 
    
    @Bean  
    public HandshakeInterceptor handshakeInterceptor() {  
        return new HandshakeInterceptor();  
    }  
  
  
    // Allow serving HTML files through the default Servlet  
  
    @Override  
    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {  
        configurer.enable();  
    }  
  
}  