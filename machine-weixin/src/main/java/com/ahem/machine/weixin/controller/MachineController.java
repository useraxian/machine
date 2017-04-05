package com.ahem.machine.weixin.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.ahem.machine.weixin.core.RestResponse;
import com.ahem.machine.weixin.entity.TMachineRecord;
import com.ahem.machine.weixin.mapper.TMachineUserMapper;
import com.ahem.machine.weixin.service.BetRecordService;
import com.ahem.machine.weixin.service.RecordService;
import com.ahem.machine.weixin.service.UserScoreService;

/**
 * <p>
 * Title: MachineController.java
 * </p>
 * <p>
 * Description:机器控制器
 * </p>
 * 
 * @author ahem
 * @date 2017年3月24日
 * @version
 */
@RestController
@RequestMapping("/machine")
public class MachineController {
	private static Logger logger = LoggerFactory.getLogger(MachineController.class);

	@Autowired
	BetRecordService betRecordService;

	@Autowired
	RecordService recordService;

	@Autowired
	UserScoreService userScoreService;

	@ResponseBody
	@RequestMapping("/myscore/{userId}")
	public RestResponse time(@PathVariable Integer userId) {
		RestResponse resp = new RestResponse();
		Integer score = 0;
		try {
			score = userScoreService.findScoreByUserId(userId);
			resp.success(score);
		} catch (Exception e) {
			logger.error("用户获取分数异常！userid=" + userId, e);
			resp.failure("获取失败！");
		}
		return resp;

	}

	/**
	 * 根据期号获取对应开奖记录
	 * 
	 * @param recordId
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value = "/record/{recordId}", method = RequestMethod.GET)
	public RestResponse record(@PathVariable Integer recordId) {
		TMachineRecord record = recordService.findById(recordId);
		RestResponse resp = new RestResponse();
		resp.success(record);
		return resp;

	}

}
