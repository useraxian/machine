package com.ahem.machine.manage.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ahem.machine.manage.model.MScoreInfo;
import com.ahem.machine.pub.mapper.VBetStatisticMapper;
import com.ahem.machine.pub.po.VBetStatistic;
import com.ahem.machine.pub.po.VBetStatisticExample;

@Service
public class DesktopService {

	@Autowired
	private VBetStatisticMapper betStatisticMapper;

	/**
	 * 获取某期的得分情况
	 * 
	 * @param recordId
	 * @return
	 */
	public List<MScoreInfo> findScoreInfo(Integer recordId) {
		VBetStatisticExample example = new VBetStatisticExample();
		example.createCriteria().andRecordIdEqualTo(recordId);
		List<VBetStatistic> bets = betStatisticMapper.selectByExample(example);
		List<MScoreInfo> infos = new ArrayList<>();
		for (VBetStatistic bet : bets) {
			MScoreInfo info = new MScoreInfo(bet.getFruitName(), bet.getAllSum().intValue());
			infos.add(info);
		}
		return infos;
	}

}
