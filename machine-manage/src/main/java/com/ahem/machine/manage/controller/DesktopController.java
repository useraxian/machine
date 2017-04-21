package com.ahem.machine.manage.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ahem.machine.manage.model.MScoreInfo;
import com.ahem.machine.manage.service.DesktopService;

@Controller
@RequestMapping("/desktop")
public class DesktopController {

	@Autowired
	DesktopService desktopService;

	@ResponseBody
	@RequestMapping("/betSum")
	public String betSum() {
		return "";
	}

	@RequestMapping("/scoreInfo")
	public String scoreInfo(Model model) {
		//TODO 获取当前期号
		List<MScoreInfo> infos = desktopService.findScoreInfo(964);
		model.addAttribute("infos", infos);
		return "fragment/scoreInfo :: scoreInfoTable";
	}
}
