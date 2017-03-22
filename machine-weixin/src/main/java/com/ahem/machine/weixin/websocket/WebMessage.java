package com.ahem.machine.weixin.websocket;

import com.alibaba.fastjson.JSON;

/**
 * websocket 消息类
 * 
 * @author ahem
 *
 */
public class WebMessage {

	private MessageType type;
	private String content;

	public WebMessage(MessageType type, String content) {
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

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String toJsonString() {
		return JSON.toJSONString(this);
	}

	/**
	 * 消息类型
	 * 
	 * @author ahem
	 *
	 */
	enum MessageType {
		// 时间计时
		time_count
	}

}
