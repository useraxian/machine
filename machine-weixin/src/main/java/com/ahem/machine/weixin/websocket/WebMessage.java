package com.ahem.machine.weixin.websocket;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;

/**
 * websocket 消息类
 * 
 * @author ahem
 *
 */
public class WebMessage {

	private MessageType type;
	private Object content;

	public WebMessage(MessageType type, Object content) {
		if (type == null) {
			throw new RuntimeException("MessageType is null!");
		}
		this.type = type;
		this.content = content;
	}

	public MessageType getType() {
		return type;
	}

	public void setType(MessageType type) {
		this.type = type;
	}

	public Object getContent() {
		return content;
	}

	public void setContent(Object content) {
		this.content = content;
	}

	public String toJsonString() {
		return JSON.toJSONString(this, SerializerFeature.PrettyFormat, SerializerFeature.WriteDateUseDateFormat);
	}

}
