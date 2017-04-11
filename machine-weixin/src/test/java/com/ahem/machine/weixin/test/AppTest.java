package com.ahem.machine.weixin.test;

import java.util.HashMap;

import org.json.JSONObject;
import org.junit.Test;

import com.ahem.machine.weixin.core.TimeCounter;
import com.ahem.machine.weixin.websocket.MessageType;
import com.ahem.machine.weixin.websocket.WebMessage;
import com.alibaba.fastjson.JSON;

public class AppTest {
	@Test
	public void testJson() {
		Integer result = 1;
		Integer gotScore = 100;
		HashMap<String, Integer> hashMap = new HashMap<>();
		hashMap.put("betResult", result);
		hashMap.put("gotScore", gotScore);
		WebMessage message = new WebMessage(MessageType.betResult, hashMap);
		System.out.println(message.toJsonString());
	}
}
