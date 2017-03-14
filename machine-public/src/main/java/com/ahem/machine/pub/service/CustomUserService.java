package com.ahem.machine.pub.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.ahem.machine.pub.entity.RolePO;
import com.ahem.machine.pub.entity.UserPO;
import com.ahem.machine.pub.mapper.UserMapper;

/**
 * 
 * 重写UserDetailsService接口，然后实现该接口中的loadUserByUsername方法，通过该方法查询到对应的用户，这里之所以要实现UserDetailsService接口，是因为在Spring
 * Security中我们配置相关参数需要UserDetailsService类型的数据。
 * 
 * @author Administrator
 *
 */
public class CustomUserService implements UserDetailsService {
	@Autowired
	UserMapper userMapper;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		UserPO user = userMapper.findByUserName(username);
		if (user == null) {
			throw new UsernameNotFoundException("用户名不存在");
		}
		// 根据用户获取用户角色
		List<RolePO> roles = user.getRoles();
		// 定义权限集合
		List<SimpleGrantedAuthority> grantedAuthorities = new ArrayList<SimpleGrantedAuthority>();
		// 添加权限到集合中
		for (RolePO role : roles) {
			grantedAuthorities.add(new SimpleGrantedAuthority(role.getName()));
		}

		// 加密密码
		// BCryptPasswordEncoder bCryptPasswordEncoder = new
		// BCryptPasswordEncoder(16);
		// User user = new User(userInfo.getUserName(),
		// bCryptPasswordEncoder.encode(userInfo.getPassword()),
		// booleanStatus, true, true, true, grantedAuthorities);
		System.out.println("username:" + user.getUsername() + ";password:" + user.getPassword());
		return user;
	}

}
