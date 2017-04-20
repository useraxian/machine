package com.ahem.machine.manage.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ahem.machine.pub.mapper.VBetStatisticMapper;
import com.ahem.machine.pub.po.VBetStatistic;
import com.ahem.machine.pub.po.VBetStatisticExample;


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
