package com.ahem.machine.weixin.mapper;

import com.ahem.machine.weixin.entity.TWeixinUser;
import com.ahem.machine.weixin.entity.TWeixinUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.session.RowBounds;

//@Mapper
public interface TWeixinUserMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_weixin_user
	 * @mbg.generated  Sat Apr 15 20:14:12 CST 2017
	 */
	@SelectProvider(type = TWeixinUserSqlProvider.class, method = "countByExample")
	long countByExample(TWeixinUserExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_weixin_user
	 * @mbg.generated  Sat Apr 15 20:14:12 CST 2017
	 */
	@DeleteProvider(type = TWeixinUserSqlProvider.class, method = "deleteByExample")
	int deleteByExample(TWeixinUserExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_weixin_user
	 * @mbg.generated  Sat Apr 15 20:14:12 CST 2017
	 */
	@Delete({ "delete from t_weixin_user", "where open_id = #{openId,jdbcType=VARCHAR}" })
	int deleteByPrimaryKey(String openId);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_weixin_user
	 * @mbg.generated  Sat Apr 15 20:14:12 CST 2017
	 */
	@Insert({ "insert into t_weixin_user (open_id, nickname, ", "login_time, sex, ", "province, city, ",
			"country, headimgurl, ", "privilege)", "values (#{openId,jdbcType=VARCHAR}, #{nickname,jdbcType=VARCHAR}, ",
			"#{loginTime,jdbcType=TIMESTAMP}, #{sex,jdbcType=INTEGER}, ",
			"#{province,jdbcType=VARCHAR}, #{city,jdbcType=VARCHAR}, ",
			"#{country,jdbcType=VARCHAR}, #{headimgurl,jdbcType=VARCHAR}, ", "#{privilege,jdbcType=VARCHAR})" })
	int insert(TWeixinUser record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_weixin_user
	 * @mbg.generated  Sat Apr 15 20:14:12 CST 2017
	 */
	@InsertProvider(type = TWeixinUserSqlProvider.class, method = "insertSelective")
	int insertSelective(TWeixinUser record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_weixin_user
	 * @mbg.generated  Sat Apr 15 20:14:12 CST 2017
	 */
	@SelectProvider(type = TWeixinUserSqlProvider.class, method = "selectByExample")
	@Results({ @Result(column = "open_id", property = "openId", jdbcType = JdbcType.VARCHAR, id = true),
			@Result(column = "nickname", property = "nickname", jdbcType = JdbcType.VARCHAR),
			@Result(column = "login_time", property = "loginTime", jdbcType = JdbcType.TIMESTAMP),
			@Result(column = "sex", property = "sex", jdbcType = JdbcType.INTEGER),
			@Result(column = "province", property = "province", jdbcType = JdbcType.VARCHAR),
			@Result(column = "city", property = "city", jdbcType = JdbcType.VARCHAR),
			@Result(column = "country", property = "country", jdbcType = JdbcType.VARCHAR),
			@Result(column = "headimgurl", property = "headimgurl", jdbcType = JdbcType.VARCHAR),
			@Result(column = "privilege", property = "privilege", jdbcType = JdbcType.VARCHAR) })
	List<TWeixinUser> selectByExampleWithRowbounds(TWeixinUserExample example, RowBounds rowBounds);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_weixin_user
	 * @mbg.generated  Sat Apr 15 20:14:12 CST 2017
	 */
	@SelectProvider(type = TWeixinUserSqlProvider.class, method = "selectByExample")
	@Results({ @Result(column = "open_id", property = "openId", jdbcType = JdbcType.VARCHAR, id = true),
			@Result(column = "nickname", property = "nickname", jdbcType = JdbcType.VARCHAR),
			@Result(column = "login_time", property = "loginTime", jdbcType = JdbcType.TIMESTAMP),
			@Result(column = "sex", property = "sex", jdbcType = JdbcType.INTEGER),
			@Result(column = "province", property = "province", jdbcType = JdbcType.VARCHAR),
			@Result(column = "city", property = "city", jdbcType = JdbcType.VARCHAR),
			@Result(column = "country", property = "country", jdbcType = JdbcType.VARCHAR),
			@Result(column = "headimgurl", property = "headimgurl", jdbcType = JdbcType.VARCHAR),
			@Result(column = "privilege", property = "privilege", jdbcType = JdbcType.VARCHAR) })
	List<TWeixinUser> selectByExample(TWeixinUserExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_weixin_user
	 * @mbg.generated  Sat Apr 15 20:14:12 CST 2017
	 */
	@Select({ "select", "open_id, nickname, login_time, sex, province, city, country, headimgurl, privilege",
			"from t_weixin_user", "where open_id = #{openId,jdbcType=VARCHAR}" })
	@Results({ @Result(column = "open_id", property = "openId", jdbcType = JdbcType.VARCHAR, id = true),
			@Result(column = "nickname", property = "nickname", jdbcType = JdbcType.VARCHAR),
			@Result(column = "login_time", property = "loginTime", jdbcType = JdbcType.TIMESTAMP),
			@Result(column = "sex", property = "sex", jdbcType = JdbcType.INTEGER),
			@Result(column = "province", property = "province", jdbcType = JdbcType.VARCHAR),
			@Result(column = "city", property = "city", jdbcType = JdbcType.VARCHAR),
			@Result(column = "country", property = "country", jdbcType = JdbcType.VARCHAR),
			@Result(column = "headimgurl", property = "headimgurl", jdbcType = JdbcType.VARCHAR),
			@Result(column = "privilege", property = "privilege", jdbcType = JdbcType.VARCHAR) })
	TWeixinUser selectByPrimaryKey(String openId);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_weixin_user
	 * @mbg.generated  Sat Apr 15 20:14:12 CST 2017
	 */
	@UpdateProvider(type = TWeixinUserSqlProvider.class, method = "updateByExampleSelective")
	int updateByExampleSelective(@Param("record") TWeixinUser record, @Param("example") TWeixinUserExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_weixin_user
	 * @mbg.generated  Sat Apr 15 20:14:12 CST 2017
	 */
	@UpdateProvider(type = TWeixinUserSqlProvider.class, method = "updateByExample")
	int updateByExample(@Param("record") TWeixinUser record, @Param("example") TWeixinUserExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_weixin_user
	 * @mbg.generated  Sat Apr 15 20:14:12 CST 2017
	 */
	@UpdateProvider(type = TWeixinUserSqlProvider.class, method = "updateByPrimaryKeySelective")
	int updateByPrimaryKeySelective(TWeixinUser record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_weixin_user
	 * @mbg.generated  Sat Apr 15 20:14:12 CST 2017
	 */
	@Update({ "update t_weixin_user", "set nickname = #{nickname,jdbcType=VARCHAR},",
			"login_time = #{loginTime,jdbcType=TIMESTAMP},", "sex = #{sex,jdbcType=INTEGER},",
			"province = #{province,jdbcType=VARCHAR},", "city = #{city,jdbcType=VARCHAR},",
			"country = #{country,jdbcType=VARCHAR},", "headimgurl = #{headimgurl,jdbcType=VARCHAR},",
			"privilege = #{privilege,jdbcType=VARCHAR}", "where open_id = #{openId,jdbcType=VARCHAR}" })
	int updateByPrimaryKey(TWeixinUser record);
}