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
public class UserController {

	@ResponseBody
	@RequestMapping("/users")
	public JqGridPagination users() {
		
		JqGridPagination pagination = new JqGridPagination();
		pagination.setPage(2);
		pagination.setTotal(2);
		pagination.setRecords(20);
	
		List<Object> arrayList = new ArrayList<Object>();
		for (int i = 0; i < 20; i++) {
			HashMap jsonObject = new HashMap<>();
			jsonObject.put("id", "1");
			jsonObject.put("name", "Desktop Computer");
			jsonObject.put("note", "note");
			jsonObject.put("stock", "Yes");
			jsonObject.put("ship", "FedEx");
			jsonObject.put("sdate", "2007-12-03");
			arrayList.add(jsonObject);
			
		}
		
	
		pagination.setRows(arrayList);
		return pagination;
	}
}
