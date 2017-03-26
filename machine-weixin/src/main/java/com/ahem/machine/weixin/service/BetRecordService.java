package com.ahem.machine.weixin.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ahem.machine.weixin.entity.TMachineBetRecord;
import com.ahem.machine.weixin.entity.TMachineBetRecordExample;
import com.ahem.machine.weixin.mapper.TMachineBetRecordMapper;

@Service
public class BetRecordService {
	@Autowired
	TMachineBetRecordMapper betRecordMapper;

	public List<TMachineBetRecord> findByUserId(String userid) {
		TMachineBetRecordExample example = new TMachineBetRecordExample();
		example.createCriteria().andUserIdEqualTo(userid);
		return betRecordMapper.selectByExample(example);

	}

}
