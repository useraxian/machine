package com.ahem.machine.weixin.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.ahem.machine.weixin.core.RestResponse;
import com.ahem.machine.weixin.entity.TMachineBetRecord;
import com.ahem.machine.weixin.service.BetRecordService;

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

	@ResponseBody
	@RequestMapping("/myscore")
	public RestResponse time() {
		// TODO 根据用户获取分数
		RestResponse resp = new RestResponse();
		resp.success(100);
		return resp;

	}

	@RequestMapping("/bet/{openid}/{index}/{score}")
	public RestResponse bet(@PathVariable String openid, @PathVariable String index, @PathVariable String score) {
		// TODO 下注之后写入数据库
		logger.debug("下注[openid=" + openid + ",index=" + index + ",score=" + score + "]");
		RestResponse resp = new RestResponse();
		resp.success(100);
		return resp;

	}

	@RequestMapping(value = "/bet/{userid}", method = RequestMethod.GET)
	public RestResponse bet(@PathVariable String userid) {
		// TODO 下注之后写入数据库
		logger.debug("获取下注记录，userid=" + userid);
		List<TMachineBetRecord> findByOpenId = betRecordService.findByUserId(userid);
		RestResponse resp = new RestResponse();
		resp.success(findByOpenId);
		return resp;

	}
}
