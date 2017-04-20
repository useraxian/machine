package com.ahem.machine.weixin.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ahem.machine.weixin.entity.TMachineBigSmallRecord;
import com.ahem.machine.weixin.mapper.TMachineBigSmallRecordMapper;

@Service
public class BigSmallRecoreService {
	@Autowired
	TMachineBigSmallRecordMapper bigSmallRecordMapper;

	/**
	 * 添加下注记录
	 * 
	 * @param betRecord
	 */
	public void add(TMachineBigSmallRecord record) {
		bigSmallRecordMapper.insertSelective(record);
	}

}
