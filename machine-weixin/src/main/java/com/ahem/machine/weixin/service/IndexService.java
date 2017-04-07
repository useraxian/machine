package com.ahem.machine.weixin.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ahem.machine.weixin.entity.TMachineIndex;
import com.ahem.machine.weixin.entity.TMachineIndexExample;
import com.ahem.machine.weixin.mapper.TMachineIndexMapper;

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
