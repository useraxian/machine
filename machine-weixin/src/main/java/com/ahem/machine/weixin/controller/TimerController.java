package com.ahem.machine.weixin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ahem.machine.weixin.core.TimeCounter;
import com.ahem.machine.weixin.service.TimeService;

@Controller
public class TimerController {
	@Autowired
	TimeService timeService;

	@ResponseBody
	@RequestMapping("/time")
	public TimeCounter time() {
		return timeService.timeCounter();
	}
}
