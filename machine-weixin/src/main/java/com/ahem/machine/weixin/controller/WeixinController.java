package com.ahem.machine.weixin.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.github.sd4324530.fastweixin.handle.EventHandle;
import com.github.sd4324530.fastweixin.handle.MessageHandle;
import com.github.sd4324530.fastweixin.message.BaseMsg;
import com.github.sd4324530.fastweixin.message.TextMsg;
import com.github.sd4324530.fastweixin.message.req.TextReqMsg;
import com.github.sd4324530.fastweixin.servlet.WeixinSupport;

@RestController
@RequestMapping("/weixin")
public class WeixinController extends WeixinSupport {
	private static Logger log = LoggerFactory.getLogger(WeixinController.class);
	private static final String TOKEN = "test";
	private static final String APPID = "wxcf0a5c29b58566fe";
	private static final String APPSECRET = "8134e7caf02aecd7657dcb8d72ac2fbf";

	// 设置TOKEN，用于绑定微信服务器
	@Override
	protected String getToken() {
		return TOKEN;
	}

	// 使用安全模式时设置：APPID
	@Override
	protected String getAppId() {
		return APPID;
	}

	// 使用安全模式时设置：密钥
	@Override
	protected String getAESKey() {
		return null;
	}

	/**
	 * 绑定微信服务器
	 *
	 * @param request
	 *            请求
	 * @return 响应内容
	 */
	@RequestMapping(method = RequestMethod.GET)
	@ResponseBody
	protected final void bind(HttpServletRequest request, HttpServletResponse response) {
		bindServer(request, response);
	}

	/**
	 * 微信消息交互处理
	 *
	 * @param request
	 *            http 请求对象
	 * @param response
	 *            http 响应对象
	 * @throws ServletException
	 *             异常
	 * @throws IOException
	 *             IO异常
	 */
	@RequestMapping(method = RequestMethod.POST)
	protected final void process(HttpServletRequest request, HttpServletResponse response) throws ServletException,
			IOException {
		if (isLegal(request)) {
			String result = processRequest(request);
			// 设置正确的 content-type 以防止中文乱码
			response.setContentType("text/xml;charset=UTF-8");
			PrintWriter writer = response.getWriter();
			writer.write(result);
			writer.close();
		}
	}

	// 重写父类方法，处理对应的微信消息
	@Override
	protected BaseMsg handleTextMsg(TextReqMsg msg) {
		String content = msg.getContent();
		log.debug("用户发送到服务器的内容:{}", content);
		return new TextMsg("服务器回复用户消息!");
	}

	/*
	 * 1.1版本新增，重写父类方法，加入自定义微信消息处理器 不是必须的，上面的方法是统一处理所有的文本消息，如果业务觉复杂，上面的会显得比较乱
	 * 这个机制就是为了应对这种情况，每个MessageHandle就是一个业务，只处理指定的那部分消息
	 */
	@SuppressWarnings("rawtypes")
	@Override
	protected List<MessageHandle> initMessageHandles() {
		List<MessageHandle> handles = new ArrayList<MessageHandle>();
		 handles.add(new MyMessageHandle());
		return handles;
	}

	// 1.1版本新增，重写父类方法，加入自定义微信事件处理器，同上
	@SuppressWarnings("rawtypes")
	@Override
	protected List<EventHandle> initEventHandles() {
		List<EventHandle> handles = new ArrayList<EventHandle>();
		// handles.add(new MyEventHandle());
		return handles;
	}

	class MyMessageHandle implements MessageHandle<TextReqMsg> {

		@Override
		public BaseMsg handle(TextReqMsg message) {
			message.toString();
			return null;
		}

		@Override
		public boolean beforeHandle(TextReqMsg message) {
			// TODO Auto-generated method stub
			return false;
		}

	

	}

}
