package com.ahem.machine.weixin.configuration;

import java.util.List;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.support.config.FastJsonConfig;
import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter;

@Configuration
@EnableWebMvc
public class WebMvcStaticResourceConfiguration extends WebMvcConfigurerAdapter {
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		// Spring Boot
		// 默认配置的/**映射到/static（或/public，/resources，/META-INF/resources），
		// /webjars/**会映射到classpath:/META-INF/resources/webjars/。
		// registry.addResourceHandler("/**").addResourceLocations("classpath:/pages/");
		registry.addResourceHandler("/**").addResourceLocations("classpath:/templates/");
		registry.addResourceHandler("/css/**").addResourceLocations("classpath:/static/css/");
		registry.addResourceHandler("/images/**").addResourceLocations("classpath:/static/images/");
		registry.addResourceHandler("/fonts/**").addResourceLocations("classpath:/static/fonts/");
		registry.addResourceHandler("/js/**").addResourceLocations("classpath:/static/js/");
	}

	// @Override
	// public void addViewControllers(ViewControllerRegistry registry) {
	// registry.addViewController("/login").setViewName("/login");
	// }

	@Override
	public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
		super.configureMessageConverters(converters);

		FastJsonHttpMessageConverter fastConverter = new FastJsonHttpMessageConverter();

		FastJsonConfig fastJsonConfig = new FastJsonConfig();
		fastJsonConfig.setSerializerFeatures(SerializerFeature.PrettyFormat);
		fastConverter.setFastJsonConfig(fastJsonConfig);

		converters.add(fastConverter);
	}
}
