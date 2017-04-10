package com.ahem.machine.weixin.core;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

//@WebFilter(urlPatterns = "/*", filterName = "weixinFilter", initParams = {
//		@WebInitParam(name = "excludedPages", value = "/wxlogin,/callback") })
public class WeixinFilter implements Filter {
	/**
	 * 需要排除的页面
	 */
	private String excludedPages;

	private String[] excludedPageArray;

	public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain) throws IOException,
			ServletException {
		HttpServletRequest httpReq = (HttpServletRequest) req;
		HttpServletResponse httpRes = (HttpServletResponse) res;

		boolean isExcludedPage = false;
		for (String page : excludedPageArray) {// 判断是否在过滤url之外
			if ((httpReq).getServletPath().equals(page)) {
				isExcludedPage = true;
				break;
			}
		}
		if (isExcludedPage) {// 在过滤url之外
			chain.doFilter(req, res);
		} else {// 不在过滤url之外，判断session是否存在
			HttpSession session = httpReq.getSession();
			if (session == null || session.getAttribute(Global.SEESION_USER_KEY) == null) {
				httpRes.sendError(501, "你还没有登录呢！");
			} else {
				chain.doFilter(req, res);
			}
		}

	}

	/**
	 * 初始化函数，获取需要排除在外的url
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		excludedPages = fConfig.getInitParameter("excludedPages");
		if (excludedPages != null || !"".equals(excludedPages.trim())) {
			excludedPageArray = excludedPages.split(",");
		}
		return;

	}

	public void destroy() {
	}

}
