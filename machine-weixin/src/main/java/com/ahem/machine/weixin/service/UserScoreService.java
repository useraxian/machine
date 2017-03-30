package com.ahem.machine.weixin.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ahem.machine.weixin.entity.TMachineUser;
import com.ahem.machine.weixin.entity.VUserBetRecord;
import com.ahem.machine.weixin.entity.VUserBetRecordExample;
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

	/**
	 * 根据期号，统计用户输赢分数
	 * 
	 * @param recordId
	 */
	public void countUsersScore(Integer recordId) {
		VUserBetRecordExample example = new VUserBetRecordExample();
		example.createCriteria().andRecordIdEqualTo(recordId);
		List<VUserBetRecord> list = userBetRecordMapper.selectByExample(example);
		TMachineUser machineUser = null;
		for (VUserBetRecord record : list) {
			try {
				machineUser = userMapper.selectByPrimaryKey(record.getUserId());
				Integer newScore = machineUser.getScore() + record.getGotScore().intValue();
				machineUser.setScore(newScore);
				userMapper.updateByPrimaryKeySelective(machineUser);
			} catch (Exception e) {
				logger.error("更新用户分数异常！machineUser=" + record.toString() + ",machineUser=" + machineUser.toString());
			}

		}
	}

}
