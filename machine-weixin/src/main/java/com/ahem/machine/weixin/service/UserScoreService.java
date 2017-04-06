package com.ahem.machine.weixin.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ahem.machine.weixin.entity.TMachineBetRecord;
import com.ahem.machine.weixin.entity.TMachineBetRecordExample;
import com.ahem.machine.weixin.entity.TMachineFruit;
import com.ahem.machine.weixin.entity.TMachineIndex;
import com.ahem.machine.weixin.entity.TMachineRecord;
import com.ahem.machine.weixin.entity.TMachineUser;
import com.ahem.machine.weixin.mapper.TMachineBetRecordMapper;
import com.ahem.machine.weixin.mapper.TMachineFruitMapper;
import com.ahem.machine.weixin.mapper.TMachineIndexMapper;
import com.ahem.machine.weixin.mapper.TMachineRecordMapper;
import com.ahem.machine.weixin.mapper.TMachineUserMapper;
import com.ahem.machine.weixin.mapper.VUserBetRecordMapper;

/**
 * 用户分数Service
 * 
 * @author ahem
 *
 */
@Service
public class UserScoreService {
	private static Logger logger = LoggerFactory.getLogger(UserScoreService.class);

	@Autowired
	VUserBetRecordMapper userBetRecordMapper;

	@Autowired
	TMachineUserMapper userMapper;

	@Autowired
	TMachineBetRecordMapper betRecordMapper;

	@Autowired
	TMachineRecordMapper recordMapper;

	@Autowired
	TMachineIndexMapper indexMapper;

	@Autowired
	TMachineFruitMapper fuirtMapper;

	/**
	 * 根据期号，统计用户输赢分数
	 * 
	 * @param recordId
	 */
	public void countUsersScore(Integer recordId) {
		TMachineBetRecordExample betRecordExample = new TMachineBetRecordExample();
		betRecordExample.createCriteria().andRecordIdEqualTo(recordId);
		List<TMachineBetRecord> betRecords = betRecordMapper.selectByExample(betRecordExample);

		TMachineRecord record = recordMapper.selectByPrimaryKey(recordId);
		TMachineIndex index = indexMapper.selectByPrimaryKey(record.getOpenNumber());
		TMachineFruit fruit = fuirtMapper.selectByPrimaryKey(index.getFruitId());

		// 计算用户得分
		Integer gotScore = 0;
		for (TMachineBetRecord betRecord : betRecords) {
			if (betRecord.getBetFruitId1() == index.getFruitId()) {
				gotScore += betRecord.getBetScore1() * fruit.getFruitMultiple() * betRecord.getBetMultiple();
			} else {
				gotScore -= betRecord.getBetScore1() * betRecord.getBetMultiple();
			}
			if (betRecord.getBetFruitId2() == index.getFruitId()) {
				gotScore += betRecord.getBetScore2() * fruit.getFruitMultiple() * betRecord.getBetMultiple();
			} else {
				gotScore -= betRecord.getBetScore2() * betRecord.getBetMultiple();
			}
			if (betRecord.getBetFruitId3() == index.getFruitId()) {
				gotScore += betRecord.getBetScore3() * fruit.getFruitMultiple() * betRecord.getBetMultiple();
			} else {
				gotScore -= betRecord.getBetScore3() * betRecord.getBetMultiple();
			}
			if (betRecord.getBetFruitId4() == index.getFruitId()) {
				gotScore += betRecord.getBetScore4() * fruit.getFruitMultiple() * betRecord.getBetMultiple();
			} else {
				gotScore -= betRecord.getBetScore4() * betRecord.getBetMultiple();
			}
			if (betRecord.getBetFruitId5() == index.getFruitId()) {
				gotScore += betRecord.getBetScore5() * fruit.getFruitMultiple() * betRecord.getBetMultiple();
			} else {
				gotScore -= betRecord.getBetScore5() * betRecord.getBetMultiple();
			}
			if (betRecord.getBetFruitId6() == index.getFruitId()) {
				gotScore += betRecord.getBetScore6() * fruit.getFruitMultiple() * betRecord.getBetMultiple();
			} else {
				gotScore -= betRecord.getBetScore6() * betRecord.getBetMultiple();
			}
			if (betRecord.getBetFruitId7() == index.getFruitId()) {
				gotScore += betRecord.getBetScore7() * fruit.getFruitMultiple() * betRecord.getBetMultiple();
			} else {
				gotScore -= betRecord.getBetScore7() * betRecord.getBetMultiple();
			}
			logger.debug("下注得分统计,下注ID:" + betRecord.getId() + ",得分：" + gotScore);
			Integer isWin = null;
			if (gotScore > 0) {
				isWin = 1;// 赢
			} else if (gotScore < 0) {
				isWin = 0;// 输
			} else {
				isWin = 2;// 平
			}
			betRecord.setBetResult(isWin);
			betRecord.setGotScore(gotScore);

			// 更新下注记录
			betRecordMapper.updateByPrimaryKey(betRecord);

			// 更新用户分数
			TMachineUser user = userMapper.selectByPrimaryKey(betRecord.getUserId());
			user.setScore(user.getScore()+gotScore);
			userMapper.updateByPrimaryKey(user);
		}
	}

	/**
	 * 获取用户分数
	 * 
	 * @param userId
	 * @return
	 */
	public Integer findScoreByUserId(Integer userId) {
		TMachineUser user = userMapper.selectByPrimaryKey(userId);
		return user.getScore();
	}

}
