package com.ahem.machine.weixin.job;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.ahem.machine.weixin.core.TimeCounter;

/**
 * 时间倒计时任务
 * TODO 后期计时器放在数据库实现，解决多系统问题时间同步问题。实现：数据库定时任务调用存储过程执行
 * 
 * @author Administrator
 *
 */
@Component
public class TimeCounterScheduler {
	private final Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	TimeCounter timeCounter;

	@Scheduled(fixedRate = 1000)
	public void runJob() {
		timeCounter.count();
	}
}
