package com.ahem.machine.weixin.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.ahem.machine.weixin.core.TimeCounter;

@Configuration
public class TimeCounterConfiguration {

	@Bean
	TimeCounter timeCounter() {
		return new TimeCounter();
	};
	
}
