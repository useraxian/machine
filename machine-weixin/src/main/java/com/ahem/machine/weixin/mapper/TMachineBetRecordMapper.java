package com.ahem.machine.weixin.mapper;

import com.ahem.machine.weixin.entity.TMachineBetRecord;
import com.ahem.machine.weixin.entity.TMachineBetRecordExample;
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

@Mapper
public interface TMachineBetRecordMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_machine_bet_record
     *
     * @mbg.generated Sun Mar 26 16:59:34 CST 2017
     */
    @SelectProvider(type=TMachineBetRecordSqlProvider.class, method="countByExample")
    long countByExample(TMachineBetRecordExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_machine_bet_record
     *
     * @mbg.generated Sun Mar 26 16:59:34 CST 2017
     */
    @DeleteProvider(type=TMachineBetRecordSqlProvider.class, method="deleteByExample")
    int deleteByExample(TMachineBetRecordExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_machine_bet_record
     *
     * @mbg.generated Sun Mar 26 16:59:34 CST 2017
     */
    @Delete({
        "delete from t_machine_bet_record",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_machine_bet_record
     *
     * @mbg.generated Sun Mar 26 16:59:34 CST 2017
     */
    @Insert({
        "insert into t_machine_bet_record (id, user_id, ",
        "record_id, bet_fruit_id, ",
        "bet_score, bet_multiple, ",
        "bet_time)",
        "values (#{id,jdbcType=INTEGER}, #{userId,jdbcType=VARCHAR}, ",
        "#{recordId,jdbcType=INTEGER}, #{betFruitId,jdbcType=INTEGER}, ",
        "#{betScore,jdbcType=INTEGER}, #{betMultiple,jdbcType=INTEGER}, ",
        "#{betTime,jdbcType=TIMESTAMP})"
    })
    int insert(TMachineBetRecord record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_machine_bet_record
     *
     * @mbg.generated Sun Mar 26 16:59:34 CST 2017
     */
    @InsertProvider(type=TMachineBetRecordSqlProvider.class, method="insertSelective")
    int insertSelective(TMachineBetRecord record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_machine_bet_record
     *
     * @mbg.generated Sun Mar 26 16:59:34 CST 2017
     */
    @SelectProvider(type=TMachineBetRecordSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="user_id", property="userId", jdbcType=JdbcType.VARCHAR),
        @Result(column="record_id", property="recordId", jdbcType=JdbcType.INTEGER),
        @Result(column="bet_fruit_id", property="betFruitId", jdbcType=JdbcType.INTEGER),
        @Result(column="bet_score", property="betScore", jdbcType=JdbcType.INTEGER),
        @Result(column="bet_multiple", property="betMultiple", jdbcType=JdbcType.INTEGER),
        @Result(column="bet_time", property="betTime", jdbcType=JdbcType.TIMESTAMP)
    })
    List<TMachineBetRecord> selectByExample(TMachineBetRecordExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_machine_bet_record
     *
     * @mbg.generated Sun Mar 26 16:59:34 CST 2017
     */
    @Select({
        "select",
        "id, user_id, record_id, bet_fruit_id, bet_score, bet_multiple, bet_time",
        "from t_machine_bet_record",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="user_id", property="userId", jdbcType=JdbcType.VARCHAR),
        @Result(column="record_id", property="recordId", jdbcType=JdbcType.INTEGER),
        @Result(column="bet_fruit_id", property="betFruitId", jdbcType=JdbcType.INTEGER),
        @Result(column="bet_score", property="betScore", jdbcType=JdbcType.INTEGER),
        @Result(column="bet_multiple", property="betMultiple", jdbcType=JdbcType.INTEGER),
        @Result(column="bet_time", property="betTime", jdbcType=JdbcType.TIMESTAMP)
    })
    TMachineBetRecord selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_machine_bet_record
     *
     * @mbg.generated Sun Mar 26 16:59:34 CST 2017
     */
    @UpdateProvider(type=TMachineBetRecordSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") TMachineBetRecord record, @Param("example") TMachineBetRecordExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_machine_bet_record
     *
     * @mbg.generated Sun Mar 26 16:59:34 CST 2017
     */
    @UpdateProvider(type=TMachineBetRecordSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") TMachineBetRecord record, @Param("example") TMachineBetRecordExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_machine_bet_record
     *
     * @mbg.generated Sun Mar 26 16:59:34 CST 2017
     */
    @UpdateProvider(type=TMachineBetRecordSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(TMachineBetRecord record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_machine_bet_record
     *
     * @mbg.generated Sun Mar 26 16:59:34 CST 2017
     */
    @Update({
        "update t_machine_bet_record",
        "set user_id = #{userId,jdbcType=VARCHAR},",
          "record_id = #{recordId,jdbcType=INTEGER},",
          "bet_fruit_id = #{betFruitId,jdbcType=INTEGER},",
          "bet_score = #{betScore,jdbcType=INTEGER},",
          "bet_multiple = #{betMultiple,jdbcType=INTEGER},",
          "bet_time = #{betTime,jdbcType=TIMESTAMP}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(TMachineBetRecord record);
}