package com.ahem.machine.manage;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;

@SpringBootApplication
@ServletComponentScan// 使用@WebServlet 、@WebListener、@WebFilter
@ComponentScans(value = { @ComponentScan("com.ahem") })
public class ManageAppStater {
	private static Logger log = LoggerFactory.getLogger(ManageAppStater.class);

	public static void main(String[] args) {
		log.info("machine manage 正在启动!");
		SpringApplication.run(ManageAppStater.class, args);
		log.info("machine manage 成功启动!");
	}
}
