package com.ahem.machine.weixin.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ahem.machine.weixin.entity.TMachineBetRecord;
import com.ahem.machine.weixin.entity.TMachineRecord;
import com.ahem.machine.weixin.mapper.TMachineRecordMapper;

@Service
public class RecordService {
	private static Logger logger = LoggerFactory.getLogger(RecordService.class);

	@Autowired
	TMachineRecordMapper recordMapper;

	/**
	 * 开奖：1.
	 * 
	 * @param betRecord
	 */
	public void generateRecord() {
		// 生成开奖号码
		Integer openNumber = generateOpenNumber();
		//TODO 1.本期开奖号码设置
		
		//TODO 2.生成下一期号
		TMachineRecord machineRecord = new TMachineRecord();
		machineRecord.setOpenTime(null);
		machineRecord.setOpenNumber(null);
		 recordMapper.insert(machineRecord);
		logger.debug("下一期号：" + machineRecord.getId());
	}

	private Integer generateOpenNumber() {
		// TODO 根据当前下注结果，计算出所要开始的号码
		return 0;
	}

}
