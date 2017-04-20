package com.ahem.machine.weixin.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ahem.machine.pub.mapper.TMachineBetRecordMapper;
import com.ahem.machine.pub.po.TMachineBetRecord;

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
