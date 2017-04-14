package com.ahem.machine.weixin.service;

import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ahem.machine.weixin.entity.TMachineBetRecord;
import com.ahem.machine.weixin.entity.TMachineBetRecordExample;
import com.ahem.machine.weixin.mapper.TMachineBetRecordMapper;

@Service
public class BetRecordService {
	@Autowired
	TMachineBetRecordMapper betRecordMapper;

	/**
	 * 添加下注记录
	 * 
	 * @param betRecord
	 */
	public void add(TMachineBetRecord betRecord) {
		betRecordMapper.insertSelective(betRecord);
	}


}
