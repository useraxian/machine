package com.ahem.machine.manage.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ahem.machine.manage.model.JqGridPagination;
import com.ahem.machine.pub.RestResponse;
import com.alibaba.fastjson.JSONObject;

@Controller
@RequestMapping("/desktop")
public class DesktopController {

	@ResponseBody
	@RequestMapping("/betSum")
	public String betSum() {
			return "";
	}
}
