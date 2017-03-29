package com.ahem.machine.weixin.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.ahem.machine.weixin.core.TimeCounter;
import com.ahem.machine.weixin.service.RecordService;

@Configuration
public class TimeCounterConfiguration {
	@Autowired
	RecordService recordService;

	@Bean
	TimeCounter timeCounter(RecordService recordService) {
		return new TimeCounter(recordService);
	};

}
