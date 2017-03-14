package com.ahem.machine.pub.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.ahem.machine.pub.entity.UserPO;
import com.ahem.machine.pub.mapper.UserMapper;

@Service(value = "userService")
public class UserService {

	@Resource
	private UserMapper userMapper;

	public boolean addUser(String username, String password, String sex) {
		return userMapper.insertUser(username, password, sex) == 1 ? true : false;
	}

	public List<UserPO> findAllUser() {
		return userMapper.findAllUser();
	}

	public UserPO findByUserName(String userName) {
		return userMapper.findByUserName(userName);
	}

}
