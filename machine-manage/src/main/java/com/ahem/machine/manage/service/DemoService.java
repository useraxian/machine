package com.ahem.machine.manage.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ahem.machine.pub.mapper.TMachineUserMapper;
import com.ahem.machine.pub.po.TMachineUser;
import com.ahem.machine.pub.po.TMachineUserExample;


@Service
public class DemoService {

	@Autowired
	TMachineUserMapper machineUserMapper;

	public List<TMachineUser> findAllUsers() {
		TMachineUserExample example = new TMachineUserExample();
		return machineUserMapper.selectByExample(example);
	}

}
