package com.ahem.machine.manage.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ahem.machine.manage.service.DemoService;
import com.ahem.machine.pub.po.TMachineUser;

@Controller
@RequestMapping("/demo")
public class DemoController {
	@Autowired
	DemoService demoService;

	@RequestMapping("/allUsers")
	public String allUsers(Model model) {
		List<TMachineUser> users = demoService.findAllUsers();
		model.addAttribute("users", users);
//		model.addAttribute("error", "error");
////		model.addAttribute("timestamp", System.currentTimeMillis());
//		return "error";
		return "demo/fragment :: resultsList";
//		 :: resultsList
	}
}
