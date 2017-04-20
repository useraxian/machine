package com.ahem.machine.weixin.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.ibatis.session.RowBounds;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ahem.common.utils.DateUtils;
import com.ahem.machine.pub.mapper.TMachineFruitMapper;
import com.ahem.machine.pub.mapper.TMachineIndexMapper;
import com.ahem.machine.pub.mapper.TMachineRecordMapper;
import com.ahem.machine.pub.po.TMachineFruit;
import com.ahem.machine.pub.po.TMachineIndex;
import com.ahem.machine.pub.po.TMachineRecord;
import com.ahem.machine.pub.po.TMachineRecordExample;
import com.ahem.machine.weixin.core.MaxGenerator;
import com.ahem.machine.weixin.model.MRecord;

/**
 * 开奖记录service
 * 
 * @author ahem
 *
 */
@Service
public class RecordService {
	private static Logger logger = LoggerFactory.getLogger(RecordService.class);

	@Autowired
	TMachineRecordMapper recordMapper;

	@Autowired
	TMachineIndexMapper indexMapper;

	@Autowired
	TMachineFruitMapper fruitMapper;

	@Autowired
	MaxGenerator maxGenerator;

	/**
	 * 开奖，并返回下期开奖ID： 1.本期开奖号码设置 ;2.生成下一期号
	 * 
	 * @return 返回下期开奖ID
	 */
	@Transactional
	public TMachineRecord generateRecord(Integer recordId) {
		// 生成开奖号码
		Integer openNumber = generateOpenNumber(recordId);

		// 1.本期开奖号码设置
		TMachineRecord openRecord = new TMachineRecord();
		openRecord.setId(recordId);
		openRecord.setOpenNumber(openNumber);
		openRecord.setOpenTime(new Date());
		recordMapper.updateByPrimaryKey(openRecord);
		return openRecord;
	}

	private Integer generateOpenNumber(Integer recordId) {
		// TODO 判断使用那种策略
		// IGenerator generator = maxGenerator;
		// return generator.generate(recordId);
		return 0;
	}

	/**
	 * 准备下期开奖ID
	 * 
	 * @return 返回下期开奖ID
	 */
	public Integer readyNext() {
		TMachineRecord nextRecord = new TMachineRecord();
		nextRecord.setOpenTime(null);
		nextRecord.setOpenNumber(null);
		recordMapper.insert(nextRecord);
		return nextRecord.getId();
	}

	/**
	 * 获取即将开奖的ID
	 * 
	 * @return 返回下期开奖ID
	 */
	public Integer findOpeningId() {
		TMachineRecordExample example = new TMachineRecordExample();
		example.createCriteria().andOpenNumberIsNull().andOpenTimeIsNull();
		example.setOrderByClause("id desc");
		List<TMachineRecord> ls = recordMapper.selectByExample(example);
		if (ls.size() > 0) {
			// 已经存在准开奖记录
			TMachineRecord record = ls.get(0);
			return record.getId();
		} else {
			// 重新生成准开奖记录
			return readyNext();
		}
	}

	/**
	 * 根据ID获取记录
	 * 
	 * @param recordId
	 * @return
	 */
	public TMachineRecord findById(Integer recordId) {
		return recordMapper.selectByPrimaryKey(recordId);
	}

	public List<MRecord> findByPage(int offset, int limit) {
		List<MRecord> ls = new ArrayList<>();
		TMachineRecordExample example = new TMachineRecordExample();
		example.createCriteria().andOpenNumberIsNotNull();
		example.setOrderByClause("id desc");
		RowBounds rowBounds = new RowBounds(offset, limit);
		List<TMachineRecord> records = recordMapper.selectByExampleWithRowbounds(example, rowBounds);
		for (TMachineRecord record : records) {
			TMachineIndex index = indexMapper.selectByPrimaryKey(record.getOpenNumber());
			TMachineFruit fruit = fruitMapper.selectByPrimaryKey(index.getFruitId());
			String openTime = DateUtils.fomat("yyyy-MM-dd HH:mm:ss", record.getOpenTime());
			MRecord mRecord = new MRecord(record.getId(), "/images/"+fruit.getImageName(),openTime);
			ls.add(mRecord);
		}
		return ls;
	}
}
