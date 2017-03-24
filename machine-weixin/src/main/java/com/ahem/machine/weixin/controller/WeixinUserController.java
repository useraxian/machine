package com.ahem.machine.weixin.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.github.sd4324530.fastweixin.api.OauthAPI;
import com.github.sd4324530.fastweixin.api.config.ApiConfig;
import com.github.sd4324530.fastweixin.api.enums.OauthScope;
import com.github.sd4324530.fastweixin.api.response.GetUserInfoResponse;
import com.github.sd4324530.fastweixin.api.response.OauthGetTokenResponse;

@Controller
public class WeixinUserController {
	private static final String APPID = "wxac3471806544b684";
	private static final String APPSECRET = "fc8607790326bf7a1186ccc1fe3bf9e7";
	private static final String CALL_BACK_URL = "http://blbl.ittun.com/callback";
	// private static final String APPID = "wxcf0a5c29b58566fe";
	// private static final String APPSECRET =
	// "8134e7caf02aecd7657dcb8d72ac2fbf";
	private static final String TOKEN = "test";
	ApiConfig apiConfig = new ApiConfig(APPID, APPSECRET);
	OauthAPI oauthAPI = new OauthAPI(apiConfig);

	@RequestMapping("/wxlogin")
	public void wxlogin(HttpServletResponse response) throws IOException {

		String oauthPageUrl = oauthAPI.getOauthPageUrl(CALL_BACK_URL, OauthScope.SNSAPI_USERINFO, "STATE");
		response.sendRedirect(oauthPageUrl);
	}

	@RequestMapping("/callback")
	public String callback(HttpServletRequest req, Model model) throws IOException {
		String code = req.getParameter("code");
		
		OauthGetTokenResponse token = oauthAPI.getToken(code);
		GetUserInfoResponse userInfo = oauthAPI.getUserInfo(token.getAccessToken(), token.getOpenid());
		model.addAttribute("openid", userInfo.getOpenid());
		model.addAttribute("nickname", userInfo.getNickname());
		model.addAttribute("city", userInfo.getCity());
		model.addAttribute("headimgurl", userInfo.getHeadimgurl());
		model.addAttribute("province", userInfo.getProvince());
		model.addAttribute("country", userInfo.getCountry());

		return "myindex";

	}

}
