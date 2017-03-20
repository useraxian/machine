package com.ahem.machine.weixin.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ahem.machine.weixin.core.TimeCounter;

@Service
public class TimeService {
	@Autowired
	TimeCounter timeCounter;

	public TimeCounter timeCounter() {
		return timeCounter;
	}
}
