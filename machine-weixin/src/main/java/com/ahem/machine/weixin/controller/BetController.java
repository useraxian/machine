package com.ahem.machine.weixin.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
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
public class BetController {
	private static Logger logger = LoggerFactory.getLogger(BetController.class);

	@Autowired
	BetRecordService betRecordService;

	@RequestMapping(value = "/bet", method = RequestMethod.POST)
	public RestResponse bet(@RequestParam Integer userId, @RequestParam Integer fruitId, @RequestParam Integer score,
			@RequestParam Integer multiple, @RequestParam Integer recordId) {
		logger.debug("下注[userid=" + userId + ",fruitId=" + fruitId + ",score=" + score + ",multiple=" + multiple + "]");
		String result = "下注失败！";

		// TODO 判断客户端的期号是否和服务端一致
		// if(){
		//
		// }
		RestResponse resp = new RestResponse();
		TMachineBetRecord betRecord = new TMachineBetRecord();
		try {
			betRecord.setUserId(userId);
			betRecord.setBetFruitId(fruitId);
			betRecord.setRecordId(recordId);
			betRecord.setBetScore(score);
			betRecord.setBetMultiple(multiple);
			betRecordService.add(betRecord);
			result = "下注成功！";
		} catch (Exception e) {
			logger.error("下注异常！" + betRecord.toString(), e);
			result = "下注异常！";
		}
		resp.success(result);
		return resp;
	}

}
