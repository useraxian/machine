package com.ahem.machine.weixin.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ahem.machine.pub.po.TMachineBetRecord;
import com.ahem.machine.weixin.core.RestResponse;
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
	public RestResponse bet(@RequestParam Integer userId, @RequestParam Integer score1, @RequestParam Integer score2,
			@RequestParam Integer score3, @RequestParam Integer score4, @RequestParam Integer score5,
			@RequestParam Integer score6, @RequestParam Integer score7, @RequestParam Integer multiple,
			@RequestParam Integer recordId) {
		logger.debug("下注[userid=" + userId + ",score1=" + score1 + ",multiple=" + multiple + "]");
		String result = "下注失败！";

		// TODO 判断客户端的期号是否和服务端一致
		// if(){
		//
		// }
		RestResponse resp = new RestResponse();
		TMachineBetRecord betRecord = new TMachineBetRecord();
		try {
			betRecord.setUserId(userId);
			betRecord.setRecordId(recordId);
			betRecord.setBetMultiple(multiple);
			betRecord.setBetFruitId1(1);
			betRecord.setBetFruitId2(2);
			betRecord.setBetFruitId3(3);
			betRecord.setBetFruitId4(4);
			betRecord.setBetFruitId5(5);
			betRecord.setBetFruitId7(6);
			betRecord.setBetFruitId6(7);
			betRecord.setBetScore1(score1);
			betRecord.setBetScore2(score2);
			betRecord.setBetScore3(score3);
			betRecord.setBetScore4(score4);
			betRecord.setBetScore5(score5);
			betRecord.setBetScore6(score6);
			betRecord.setBetScore7(score7);

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
