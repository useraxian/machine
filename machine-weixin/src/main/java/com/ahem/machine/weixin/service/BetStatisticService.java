package com.ahem.machine.weixin.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ahem.machine.weixin.entity.VBetStatistic;
import com.ahem.machine.weixin.entity.VBetStatisticExample;
import com.ahem.machine.weixin.mapper.VBetStatisticMapper;

@Service
public class BetStatisticService {

	@Autowired
	private VBetStatisticMapper betStatisticMapper;

	public List<VBetStatistic> findBetStatistics(Integer recordId) {
		VBetStatisticExample example = new VBetStatisticExample();
		example.createCriteria().andRecordIdEqualTo(recordId);
		return betStatisticMapper.selectByExample(example);
	}

}
