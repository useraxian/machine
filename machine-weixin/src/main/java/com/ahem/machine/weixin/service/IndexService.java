package com.ahem.machine.weixin.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ahem.machine.pub.mapper.TMachineIndexMapper;
import com.ahem.machine.pub.po.TMachineIndex;
import com.ahem.machine.pub.po.TMachineIndexExample;


@Service
public class IndexService {

	@Autowired
	private TMachineIndexMapper indexMapper;

	public List<TMachineIndex> findIndexByFruit(Integer fruitId) {
		TMachineIndexExample example = new TMachineIndexExample();
		example.createCriteria().andFruitIdEqualTo(fruitId);
		return indexMapper.selectByExample(example);
	}

}
