package com.ahem.machine.weixin;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@ServletComponentScan// 使用@WebServlet 、@WebListener、@WebFilter
@ComponentScans(value = { @ComponentScan("com.ahem") })
@EnableScheduling
@EnableWebMvc
public class WeiXinAppStater {
	private static Logger log = LoggerFactory.getLogger(WeiXinAppStater.class);

	public static void main(String[] args) {
		log.info("machine weixin 正在启动!");
		SpringApplication.run(WeiXinAppStater.class, args);
		log.info("machine weixin 成功启动!");
	}
}
