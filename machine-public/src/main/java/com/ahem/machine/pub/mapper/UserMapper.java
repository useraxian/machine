package com.ahem.machine.pub.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Many;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.ahem.machine.pub.entity.UserPO;

@Mapper
public interface UserMapper {

	@Insert("INSERT INTO t_sys_user(user_name, password,sex) VALUES(#{username},#{password},#{sex})")
	public int insertUser(@Param("username") String username, @Param("password") String password,
			@Param("sex") String sex);

	@Select("select * from t_sys_user")
	@Results(value = { @Result(id = true, column = "id", property = "id"),
			@Result(column = "user_name", property = "userName"), @Result(column = "password", property = "password"),
			@Result(column = "sex", property = "sex") })
	public List<UserPO> findAllUser();

	@Select("select * from t_sys_user u where u.user_name = #{userName}")
	@Results(value = { @Result(id = true, column = "id", property = "id"),
			@Result(column = "user_name", property = "userName"), @Result(column = "password", property = "password"),
			@Result(column = "sex", property = "sex"), @Result(column = "id", property = "roles", javaType = List.class,
					many = @Many(select = "com.shoot.mapper.RoleMapper.findByUserId")) })
	public UserPO findByUserName(String userName);
}
