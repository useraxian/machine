package com.ahem.machine.manage.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
public class WebMvcStaticResourceConfiguration extends WebMvcConfigurerAdapter {
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		// Spring Boot
		// 默认配置的/**映射到/static（或/public，/resources，/META-INF/resources），
		// /webjars/**会映射到classpath:/META-INF/resources/webjars/。
		// registry.addResourceHandler("/**").addResourceLocations("classpath:/pages/");
		registry.addResourceHandler("/**").addResourceLocations("classpath:/templates/");
		registry.addResourceHandler("/css/**").addResourceLocations("classpath:/static/css/");
		registry.addResourceHandler("/js/**").addResourceLocations("classpath:/static/js/");
		registry.addResourceHandler("/assets/**").addResourceLocations("classpath:/static/assets/");
		registry.addResourceHandler("/images/**").addResourceLocations("classpath:/static/images/");
	}

	// @Override
	// public void addViewControllers(ViewControllerRegistry registry) {
	// registry.addViewController("/login").setViewName("/login");
	// }

	
//	<bean name="content-part" class="org.thymeleaf.spring4.view.ThymeleafView">
//	  <property name="templateName" value="index" />
//	  <property name="fragmentSpec">
//	    <bean class="org.thymeleaf.standard.fragment.StandardDOMSelectorFragmentSpec"
//	          c:selectorExpression="content" />
//	  </property>
//	</bean>
	
//	public ThymeleafView fragment(){
//		
//	}
}
