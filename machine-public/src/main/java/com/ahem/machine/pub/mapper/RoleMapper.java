package com.ahem.machine.pub.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import com.ahem.machine.pub.entity.RolePO;


@Mapper
public interface RoleMapper {

	@Select("select r.id,r.role_name roleName from t_sys_user_roles ur LEFT JOIN t_sys_role r on ur.role_id=r.id where ur.user_id = #{userId}")
	@Results(value = { @Result(column = "id", property = "id"), @Result(column = "roleName", property = "name") })
	public RolePO findByUserId(Long userId);
}
