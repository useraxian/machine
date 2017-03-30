package com.ahem.machine.weixin.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.ahem.machine.weixin.core.TimeCounter;
import com.ahem.machine.weixin.service.RecordService;
import com.ahem.machine.weixin.service.UserScoreService;

@Configuration
public class TimeCounterConfiguration {
	@Autowired
	RecordService recordService;
	@Autowired
	UserScoreService userScoreService;

	@Bean
	TimeCounter timeCounter(RecordService recordService, UserScoreService userScoreService) {
		return new TimeCounter(recordService, userScoreService);
	};

}
