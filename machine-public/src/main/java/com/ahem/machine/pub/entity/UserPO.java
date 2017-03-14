package com.ahem.machine.pub.entity;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

/**
 * 实现UserDetails接口，这样我们的用户实体即为Spring Security所使用的用户
 * 
 * @author fangzx
 *
 */
public class UserPO implements UserDetails {
	/**
	 * 
	 */
	private static final long serialVersionUID = -816934361057076671L;

	private long id;

	private String userName;

	private String password;

	private String sex;

	private List<RolePO> roles;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public List<RolePO> getRoles() {
		return roles;
	}

	public void setRoles(List<RolePO> roles) {
		this.roles = roles;
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		// 将用户的角色和权限关联起来
		List<GrantedAuthority> auths = new ArrayList<>();
		List<RolePO> roles = this.getRoles();
		for (RolePO role : roles) {
			auths.add(new SimpleGrantedAuthority(role.getName()));
		}
		return auths;
	}

	@Override
	public boolean isAccountNonExpired() {
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		return true;
	}

	@Override
	public boolean isEnabled() {
		return true;
	}

	@Override
	public String getUsername() {
		return userName;
	}

	@Override
	public String getPassword() {
		return password;
	}

}
