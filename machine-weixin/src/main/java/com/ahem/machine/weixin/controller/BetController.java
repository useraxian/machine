package com.ahem.machine.weixin.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ahem.machine.pub.RestResponse;
import com.ahem.machine.pub.po.TMachineBetRecord;
import com.ahem.machine.weixin.core.RandomUtil;
import com.ahem.machine.weixin.entity.TMachineBigSmallRecord;
import com.ahem.machine.weixin.service.BetRecordService;
import com.ahem.machine.weixin.service.BigSmallRecoreService;

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

	@Autowired
	BigSmallRecoreService bigSmallRecordService;

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
			resp.success(result);
		} catch (Exception e) {
			logger.error("下注异常！" + betRecord.toString(), e);
			result = "下注异常！";
			resp.failure(result);
		}

		return resp;
	}

	@RequestMapping(value = "/bigOrSmall", method = RequestMethod.POST)
	public RestResponse bigOrSmall(Integer bigOrSmall, Integer recordId, Integer userId, Integer score) {
		logger.debug("下注[userid=" + userId + ",score=" + score + ",bigOrSmall=" + bigOrSmall + "]");
		Integer result = -1;
		RestResponse resp = new RestResponse();

		// TODO 确认用户是否有分数
		try {
			int random = RandomUtil.random(0, 14);
			TMachineBigSmallRecord record = new TMachineBigSmallRecord();
			record.setRecordId(recordId);
			record.setUserId(userId);
			record.setBetScore(score);
			record.setBigSmallNum(random);
			record.setBetNum(bigOrSmall);
			if (random >= 1 && random <= 8 && bigOrSmall == 0) {
				record.setGotScore(score);
			} else if (random >= 9 && random <= 13 && bigOrSmall == 1) {
				record.setGotScore(score);
			} else {
				record.setGotScore(0);
			}
			bigSmallRecordService.add(record);
			result = random;
			resp.success(result);
		} catch (Exception e) {
			logger.error("压大小异常！[userid=" + userId + ",score=" + score + ",bigOrSmall=" + bigOrSmall + "]", e);
			resp.failure();
		}
		return resp;
	}

}
