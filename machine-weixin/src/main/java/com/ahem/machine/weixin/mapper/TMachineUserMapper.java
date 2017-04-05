package com.ahem.machine.weixin.mapper;

import com.ahem.machine.weixin.entity.TMachineUser;
import com.ahem.machine.weixin.entity.TMachineUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.session.RowBounds;

public interface TMachineUserMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_machine_user
	 * @mbg.generated  Wed Apr 05 14:47:31 CST 2017
	 */
	@SelectProvider(type = TMachineUserSqlProvider.class, method = "countByExample")
	long countByExample(TMachineUserExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_machine_user
	 * @mbg.generated  Wed Apr 05 14:47:31 CST 2017
	 */
	@DeleteProvider(type = TMachineUserSqlProvider.class, method = "deleteByExample")
	int deleteByExample(TMachineUserExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_machine_user
	 * @mbg.generated  Wed Apr 05 14:47:31 CST 2017
	 */
	@Delete({ "delete from t_machine_user", "where id = #{id,jdbcType=INTEGER}" })
	int deleteByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_machine_user
	 * @mbg.generated  Wed Apr 05 14:47:31 CST 2017
	 */
	@Insert({ "insert into t_machine_user (id, user_name, ", "password, mobile_num, ", "weixin_open_id, create_time, ",
			"login_time, score, ", "nickname)", "values (#{id,jdbcType=INTEGER}, #{userName,jdbcType=VARCHAR}, ",
			"#{password,jdbcType=VARCHAR}, #{mobileNum,jdbcType=INTEGER}, ",
			"#{weixinOpenId,jdbcType=VARCHAR}, #{createTime,jdbcType=TIMESTAMP}, ",
			"#{loginTime,jdbcType=TIMESTAMP}, #{score,jdbcType=INTEGER}, ", "#{nickname,jdbcType=VARCHAR})" })
	int insert(TMachineUser record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_machine_user
	 * @mbg.generated  Wed Apr 05 14:47:31 CST 2017
	 */
	@InsertProvider(type = TMachineUserSqlProvider.class, method = "insertSelective")
	int insertSelective(TMachineUser record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_machine_user
	 * @mbg.generated  Wed Apr 05 14:47:31 CST 2017
	 */
	@SelectProvider(type = TMachineUserSqlProvider.class, method = "selectByExample")
	@Results({ @Result(column = "id", property = "id", jdbcType = JdbcType.INTEGER, id = true),
			@Result(column = "user_name", property = "userName", jdbcType = JdbcType.VARCHAR),
			@Result(column = "password", property = "password", jdbcType = JdbcType.VARCHAR),
			@Result(column = "mobile_num", property = "mobileNum", jdbcType = JdbcType.INTEGER),
			@Result(column = "weixin_open_id", property = "weixinOpenId", jdbcType = JdbcType.VARCHAR),
			@Result(column = "create_time", property = "createTime", jdbcType = JdbcType.TIMESTAMP),
			@Result(column = "login_time", property = "loginTime", jdbcType = JdbcType.TIMESTAMP),
			@Result(column = "score", property = "score", jdbcType = JdbcType.INTEGER),
			@Result(column = "nickname", property = "nickname", jdbcType = JdbcType.VARCHAR) })
	List<TMachineUser> selectByExampleWithRowbounds(TMachineUserExample example, RowBounds rowBounds);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_machine_user
	 * @mbg.generated  Wed Apr 05 14:47:31 CST 2017
	 */
	@SelectProvider(type = TMachineUserSqlProvider.class, method = "selectByExample")
	@Results({ @Result(column = "id", property = "id", jdbcType = JdbcType.INTEGER, id = true),
			@Result(column = "user_name", property = "userName", jdbcType = JdbcType.VARCHAR),
			@Result(column = "password", property = "password", jdbcType = JdbcType.VARCHAR),
			@Result(column = "mobile_num", property = "mobileNum", jdbcType = JdbcType.INTEGER),
			@Result(column = "weixin_open_id", property = "weixinOpenId", jdbcType = JdbcType.VARCHAR),
			@Result(column = "create_time", property = "createTime", jdbcType = JdbcType.TIMESTAMP),
			@Result(column = "login_time", property = "loginTime", jdbcType = JdbcType.TIMESTAMP),
			@Result(column = "score", property = "score", jdbcType = JdbcType.INTEGER),
			@Result(column = "nickname", property = "nickname", jdbcType = JdbcType.VARCHAR) })
	List<TMachineUser> selectByExample(TMachineUserExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_machine_user
	 * @mbg.generated  Wed Apr 05 14:47:31 CST 2017
	 */
	@Select({ "select", "id, user_name, password, mobile_num, weixin_open_id, create_time, login_time, ",
			"score, nickname", "from t_machine_user", "where id = #{id,jdbcType=INTEGER}" })
	@Results({ @Result(column = "id", property = "id", jdbcType = JdbcType.INTEGER, id = true),
			@Result(column = "user_name", property = "userName", jdbcType = JdbcType.VARCHAR),
			@Result(column = "password", property = "password", jdbcType = JdbcType.VARCHAR),
			@Result(column = "mobile_num", property = "mobileNum", jdbcType = JdbcType.INTEGER),
			@Result(column = "weixin_open_id", property = "weixinOpenId", jdbcType = JdbcType.VARCHAR),
			@Result(column = "create_time", property = "createTime", jdbcType = JdbcType.TIMESTAMP),
			@Result(column = "login_time", property = "loginTime", jdbcType = JdbcType.TIMESTAMP),
			@Result(column = "score", property = "score", jdbcType = JdbcType.INTEGER),
			@Result(column = "nickname", property = "nickname", jdbcType = JdbcType.VARCHAR) })
	TMachineUser selectByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_machine_user
	 * @mbg.generated  Wed Apr 05 14:47:31 CST 2017
	 */
	@UpdateProvider(type = TMachineUserSqlProvider.class, method = "updateByExampleSelective")
	int updateByExampleSelective(@Param("record") TMachineUser record, @Param("example") TMachineUserExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_machine_user
	 * @mbg.generated  Wed Apr 05 14:47:31 CST 2017
	 */
	@UpdateProvider(type = TMachineUserSqlProvider.class, method = "updateByExample")
	int updateByExample(@Param("record") TMachineUser record, @Param("example") TMachineUserExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_machine_user
	 * @mbg.generated  Wed Apr 05 14:47:31 CST 2017
	 */
	@UpdateProvider(type = TMachineUserSqlProvider.class, method = "updateByPrimaryKeySelective")
	int updateByPrimaryKeySelective(TMachineUser record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_machine_user
	 * @mbg.generated  Wed Apr 05 14:47:31 CST 2017
	 */
	@Update({ "update t_machine_user", "set user_name = #{userName,jdbcType=VARCHAR},",
			"password = #{password,jdbcType=VARCHAR},", "mobile_num = #{mobileNum,jdbcType=INTEGER},",
			"weixin_open_id = #{weixinOpenId,jdbcType=VARCHAR},", "create_time = #{createTime,jdbcType=TIMESTAMP},",
			"login_time = #{loginTime,jdbcType=TIMESTAMP},", "score = #{score,jdbcType=INTEGER},",
			"nickname = #{nickname,jdbcType=VARCHAR}", "where id = #{id,jdbcType=INTEGER}" })
	int updateByPrimaryKey(TMachineUser record);
}