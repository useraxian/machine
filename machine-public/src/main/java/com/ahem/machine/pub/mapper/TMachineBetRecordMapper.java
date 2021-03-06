package com.ahem.machine.pub.mapper;

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
import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.type.JdbcType;

import com.ahem.machine.pub.po.TMachineBetRecord;
import com.ahem.machine.pub.po.TMachineBetRecordExample;

public interface TMachineBetRecordMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_machine_bet_record
     *
     * @mbg.generated Wed Apr 19 09:59:47 CST 2017
     */
    @SelectProvider(type=TMachineBetRecordSqlProvider.class, method="countByExample")
    long countByExample(TMachineBetRecordExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_machine_bet_record
     *
     * @mbg.generated Wed Apr 19 09:59:47 CST 2017
     */
    @DeleteProvider(type=TMachineBetRecordSqlProvider.class, method="deleteByExample")
    int deleteByExample(TMachineBetRecordExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_machine_bet_record
     *
     * @mbg.generated Wed Apr 19 09:59:47 CST 2017
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
     * @mbg.generated Wed Apr 19 09:59:47 CST 2017
     */
    @Insert({
        "insert into t_machine_bet_record (id, user_id, ",
        "record_id, bet_multiple, ",
        "bet_time, bet_fruit_id_1, ",
        "bet_score_1, bet_fruit_id_2, ",
        "bet_score_2, bet_fruit_id_3, ",
        "bet_score_3, bet_fruit_id_4, ",
        "bet_score_4, bet_fruit_id_5, ",
        "bet_score_5, bet_fruit_id_6, ",
        "bet_score_6, bet_fruit_id_7, ",
        "bet_score_7, bet_result, ",
        "got_score)",
        "values (#{id,jdbcType=INTEGER}, #{userId,jdbcType=INTEGER}, ",
        "#{recordId,jdbcType=INTEGER}, #{betMultiple,jdbcType=INTEGER}, ",
        "#{betTime,jdbcType=TIMESTAMP}, #{betFruitId1,jdbcType=INTEGER}, ",
        "#{betScore1,jdbcType=INTEGER}, #{betFruitId2,jdbcType=INTEGER}, ",
        "#{betScore2,jdbcType=INTEGER}, #{betFruitId3,jdbcType=INTEGER}, ",
        "#{betScore3,jdbcType=INTEGER}, #{betFruitId4,jdbcType=INTEGER}, ",
        "#{betScore4,jdbcType=INTEGER}, #{betFruitId5,jdbcType=INTEGER}, ",
        "#{betScore5,jdbcType=INTEGER}, #{betFruitId6,jdbcType=INTEGER}, ",
        "#{betScore6,jdbcType=INTEGER}, #{betFruitId7,jdbcType=INTEGER}, ",
        "#{betScore7,jdbcType=INTEGER}, #{betResult,jdbcType=INTEGER}, ",
        "#{gotScore,jdbcType=INTEGER})"
    })
    int insert(TMachineBetRecord record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_machine_bet_record
     *
     * @mbg.generated Wed Apr 19 09:59:47 CST 2017
     */
    @InsertProvider(type=TMachineBetRecordSqlProvider.class, method="insertSelective")
    int insertSelective(TMachineBetRecord record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_machine_bet_record
     *
     * @mbg.generated Wed Apr 19 09:59:47 CST 2017
     */
    @SelectProvider(type=TMachineBetRecordSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="user_id", property="userId", jdbcType=JdbcType.INTEGER),
        @Result(column="record_id", property="recordId", jdbcType=JdbcType.INTEGER),
        @Result(column="bet_multiple", property="betMultiple", jdbcType=JdbcType.INTEGER),
        @Result(column="bet_time", property="betTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="bet_fruit_id_1", property="betFruitId1", jdbcType=JdbcType.INTEGER),
        @Result(column="bet_score_1", property="betScore1", jdbcType=JdbcType.INTEGER),
        @Result(column="bet_fruit_id_2", property="betFruitId2", jdbcType=JdbcType.INTEGER),
        @Result(column="bet_score_2", property="betScore2", jdbcType=JdbcType.INTEGER),
        @Result(column="bet_fruit_id_3", property="betFruitId3", jdbcType=JdbcType.INTEGER),
        @Result(column="bet_score_3", property="betScore3", jdbcType=JdbcType.INTEGER),
        @Result(column="bet_fruit_id_4", property="betFruitId4", jdbcType=JdbcType.INTEGER),
        @Result(column="bet_score_4", property="betScore4", jdbcType=JdbcType.INTEGER),
        @Result(column="bet_fruit_id_5", property="betFruitId5", jdbcType=JdbcType.INTEGER),
        @Result(column="bet_score_5", property="betScore5", jdbcType=JdbcType.INTEGER),
        @Result(column="bet_fruit_id_6", property="betFruitId6", jdbcType=JdbcType.INTEGER),
        @Result(column="bet_score_6", property="betScore6", jdbcType=JdbcType.INTEGER),
        @Result(column="bet_fruit_id_7", property="betFruitId7", jdbcType=JdbcType.INTEGER),
        @Result(column="bet_score_7", property="betScore7", jdbcType=JdbcType.INTEGER),
        @Result(column="bet_result", property="betResult", jdbcType=JdbcType.INTEGER),
        @Result(column="got_score", property="gotScore", jdbcType=JdbcType.INTEGER)
    })
    List<TMachineBetRecord> selectByExampleWithRowbounds(TMachineBetRecordExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_machine_bet_record
     *
     * @mbg.generated Wed Apr 19 09:59:47 CST 2017
     */
    @SelectProvider(type=TMachineBetRecordSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="user_id", property="userId", jdbcType=JdbcType.INTEGER),
        @Result(column="record_id", property="recordId", jdbcType=JdbcType.INTEGER),
        @Result(column="bet_multiple", property="betMultiple", jdbcType=JdbcType.INTEGER),
        @Result(column="bet_time", property="betTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="bet_fruit_id_1", property="betFruitId1", jdbcType=JdbcType.INTEGER),
        @Result(column="bet_score_1", property="betScore1", jdbcType=JdbcType.INTEGER),
        @Result(column="bet_fruit_id_2", property="betFruitId2", jdbcType=JdbcType.INTEGER),
        @Result(column="bet_score_2", property="betScore2", jdbcType=JdbcType.INTEGER),
        @Result(column="bet_fruit_id_3", property="betFruitId3", jdbcType=JdbcType.INTEGER),
        @Result(column="bet_score_3", property="betScore3", jdbcType=JdbcType.INTEGER),
        @Result(column="bet_fruit_id_4", property="betFruitId4", jdbcType=JdbcType.INTEGER),
        @Result(column="bet_score_4", property="betScore4", jdbcType=JdbcType.INTEGER),
        @Result(column="bet_fruit_id_5", property="betFruitId5", jdbcType=JdbcType.INTEGER),
        @Result(column="bet_score_5", property="betScore5", jdbcType=JdbcType.INTEGER),
        @Result(column="bet_fruit_id_6", property="betFruitId6", jdbcType=JdbcType.INTEGER),
        @Result(column="bet_score_6", property="betScore6", jdbcType=JdbcType.INTEGER),
        @Result(column="bet_fruit_id_7", property="betFruitId7", jdbcType=JdbcType.INTEGER),
        @Result(column="bet_score_7", property="betScore7", jdbcType=JdbcType.INTEGER),
        @Result(column="bet_result", property="betResult", jdbcType=JdbcType.INTEGER),
        @Result(column="got_score", property="gotScore", jdbcType=JdbcType.INTEGER)
    })
    List<TMachineBetRecord> selectByExample(TMachineBetRecordExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_machine_bet_record
     *
     * @mbg.generated Wed Apr 19 09:59:47 CST 2017
     */
    @Select({
        "select",
        "id, user_id, record_id, bet_multiple, bet_time, bet_fruit_id_1, bet_score_1, ",
        "bet_fruit_id_2, bet_score_2, bet_fruit_id_3, bet_score_3, bet_fruit_id_4, bet_score_4, ",
        "bet_fruit_id_5, bet_score_5, bet_fruit_id_6, bet_score_6, bet_fruit_id_7, bet_score_7, ",
        "bet_result, got_score",
        "from t_machine_bet_record",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="user_id", property="userId", jdbcType=JdbcType.INTEGER),
        @Result(column="record_id", property="recordId", jdbcType=JdbcType.INTEGER),
        @Result(column="bet_multiple", property="betMultiple", jdbcType=JdbcType.INTEGER),
        @Result(column="bet_time", property="betTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="bet_fruit_id_1", property="betFruitId1", jdbcType=JdbcType.INTEGER),
        @Result(column="bet_score_1", property="betScore1", jdbcType=JdbcType.INTEGER),
        @Result(column="bet_fruit_id_2", property="betFruitId2", jdbcType=JdbcType.INTEGER),
        @Result(column="bet_score_2", property="betScore2", jdbcType=JdbcType.INTEGER),
        @Result(column="bet_fruit_id_3", property="betFruitId3", jdbcType=JdbcType.INTEGER),
        @Result(column="bet_score_3", property="betScore3", jdbcType=JdbcType.INTEGER),
        @Result(column="bet_fruit_id_4", property="betFruitId4", jdbcType=JdbcType.INTEGER),
        @Result(column="bet_score_4", property="betScore4", jdbcType=JdbcType.INTEGER),
        @Result(column="bet_fruit_id_5", property="betFruitId5", jdbcType=JdbcType.INTEGER),
        @Result(column="bet_score_5", property="betScore5", jdbcType=JdbcType.INTEGER),
        @Result(column="bet_fruit_id_6", property="betFruitId6", jdbcType=JdbcType.INTEGER),
        @Result(column="bet_score_6", property="betScore6", jdbcType=JdbcType.INTEGER),
        @Result(column="bet_fruit_id_7", property="betFruitId7", jdbcType=JdbcType.INTEGER),
        @Result(column="bet_score_7", property="betScore7", jdbcType=JdbcType.INTEGER),
        @Result(column="bet_result", property="betResult", jdbcType=JdbcType.INTEGER),
        @Result(column="got_score", property="gotScore", jdbcType=JdbcType.INTEGER)
    })
    TMachineBetRecord selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_machine_bet_record
     *
     * @mbg.generated Wed Apr 19 09:59:47 CST 2017
     */
    @UpdateProvider(type=TMachineBetRecordSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") TMachineBetRecord record, @Param("example") TMachineBetRecordExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_machine_bet_record
     *
     * @mbg.generated Wed Apr 19 09:59:47 CST 2017
     */
    @UpdateProvider(type=TMachineBetRecordSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") TMachineBetRecord record, @Param("example") TMachineBetRecordExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_machine_bet_record
     *
     * @mbg.generated Wed Apr 19 09:59:47 CST 2017
     */
    @UpdateProvider(type=TMachineBetRecordSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(TMachineBetRecord record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_machine_bet_record
     *
     * @mbg.generated Wed Apr 19 09:59:47 CST 2017
     */
    @Update({
        "update t_machine_bet_record",
        "set user_id = #{userId,jdbcType=INTEGER},",
          "record_id = #{recordId,jdbcType=INTEGER},",
          "bet_multiple = #{betMultiple,jdbcType=INTEGER},",
          "bet_time = #{betTime,jdbcType=TIMESTAMP},",
          "bet_fruit_id_1 = #{betFruitId1,jdbcType=INTEGER},",
          "bet_score_1 = #{betScore1,jdbcType=INTEGER},",
          "bet_fruit_id_2 = #{betFruitId2,jdbcType=INTEGER},",
          "bet_score_2 = #{betScore2,jdbcType=INTEGER},",
          "bet_fruit_id_3 = #{betFruitId3,jdbcType=INTEGER},",
          "bet_score_3 = #{betScore3,jdbcType=INTEGER},",
          "bet_fruit_id_4 = #{betFruitId4,jdbcType=INTEGER},",
          "bet_score_4 = #{betScore4,jdbcType=INTEGER},",
          "bet_fruit_id_5 = #{betFruitId5,jdbcType=INTEGER},",
          "bet_score_5 = #{betScore5,jdbcType=INTEGER},",
          "bet_fruit_id_6 = #{betFruitId6,jdbcType=INTEGER},",
          "bet_score_6 = #{betScore6,jdbcType=INTEGER},",
          "bet_fruit_id_7 = #{betFruitId7,jdbcType=INTEGER},",
          "bet_score_7 = #{betScore7,jdbcType=INTEGER},",
          "bet_result = #{betResult,jdbcType=INTEGER},",
          "got_score = #{gotScore,jdbcType=INTEGER}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(TMachineBetRecord record);
}