package com.ahem.machine.weixin.entity;

import java.util.Date;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table t_machine_bet_record
 *
 * @mbg.generated do_not_delete_during_merge Sun Mar 26 16:59:34 CST 2017
 */
public class TMachineBetRecord {

	/**
	 * Database Column Remarks: 下注id This field was generated by MyBatis Generator. This field corresponds to the database column t_machine_bet_record.id
	 * @mbg.generated  Tue Mar 28 22:59:34 CST 2017
	 */
	private Integer id;
	/**
	 * Database Column Remarks: 用户编号 This field was generated by MyBatis Generator. This field corresponds to the database column t_machine_bet_record.user_id
	 * @mbg.generated  Tue Mar 28 22:59:34 CST 2017
	 */
	private Integer userId;
	/**
	 * Database Column Remarks: 开奖期号 This field was generated by MyBatis Generator. This field corresponds to the database column t_machine_bet_record.record_id
	 * @mbg.generated  Tue Mar 28 22:59:34 CST 2017
	 */
	private Integer recordId;
	/**
	 * Database Column Remarks: 下注水果编号 This field was generated by MyBatis Generator. This field corresponds to the database column t_machine_bet_record.bet_fruit_id
	 * @mbg.generated  Tue Mar 28 22:59:34 CST 2017
	 */
	private Integer betFruitId;
	/**
	 * Database Column Remarks: 下注分数 This field was generated by MyBatis Generator. This field corresponds to the database column t_machine_bet_record.bet_score
	 * @mbg.generated  Tue Mar 28 22:59:34 CST 2017
	 */
	private Integer betScore;
	/**
	 * Database Column Remarks: 下注倍数 This field was generated by MyBatis Generator. This field corresponds to the database column t_machine_bet_record.bet_multiple
	 * @mbg.generated  Tue Mar 28 22:59:34 CST 2017
	 */
	private Integer betMultiple;
	/**
	 * Database Column Remarks: 下注时间 This field was generated by MyBatis Generator. This field corresponds to the database column t_machine_bet_record.bet_time
	 * @mbg.generated  Tue Mar 28 22:59:34 CST 2017
	 */
	private Date betTime;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column t_machine_bet_record.id
	 * @return  the value of t_machine_bet_record.id
	 * @mbg.generated  Tue Mar 28 22:59:34 CST 2017
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column t_machine_bet_record.id
	 * @param id  the value for t_machine_bet_record.id
	 * @mbg.generated  Tue Mar 28 22:59:34 CST 2017
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column t_machine_bet_record.user_id
	 * @return  the value of t_machine_bet_record.user_id
	 * @mbg.generated  Tue Mar 28 22:59:34 CST 2017
	 */
	public Integer getUserId() {
		return userId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column t_machine_bet_record.user_id
	 * @param userId  the value for t_machine_bet_record.user_id
	 * @mbg.generated  Tue Mar 28 22:59:34 CST 2017
	 */
	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column t_machine_bet_record.record_id
	 * @return  the value of t_machine_bet_record.record_id
	 * @mbg.generated  Tue Mar 28 22:59:34 CST 2017
	 */
	public Integer getRecordId() {
		return recordId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column t_machine_bet_record.record_id
	 * @param recordId  the value for t_machine_bet_record.record_id
	 * @mbg.generated  Tue Mar 28 22:59:34 CST 2017
	 */
	public void setRecordId(Integer recordId) {
		this.recordId = recordId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column t_machine_bet_record.bet_fruit_id
	 * @return  the value of t_machine_bet_record.bet_fruit_id
	 * @mbg.generated  Tue Mar 28 22:59:34 CST 2017
	 */
	public Integer getBetFruitId() {
		return betFruitId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column t_machine_bet_record.bet_fruit_id
	 * @param betFruitId  the value for t_machine_bet_record.bet_fruit_id
	 * @mbg.generated  Tue Mar 28 22:59:34 CST 2017
	 */
	public void setBetFruitId(Integer betFruitId) {
		this.betFruitId = betFruitId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column t_machine_bet_record.bet_score
	 * @return  the value of t_machine_bet_record.bet_score
	 * @mbg.generated  Tue Mar 28 22:59:34 CST 2017
	 */
	public Integer getBetScore() {
		return betScore;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column t_machine_bet_record.bet_score
	 * @param betScore  the value for t_machine_bet_record.bet_score
	 * @mbg.generated  Tue Mar 28 22:59:34 CST 2017
	 */
	public void setBetScore(Integer betScore) {
		this.betScore = betScore;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column t_machine_bet_record.bet_multiple
	 * @return  the value of t_machine_bet_record.bet_multiple
	 * @mbg.generated  Tue Mar 28 22:59:34 CST 2017
	 */
	public Integer getBetMultiple() {
		return betMultiple;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column t_machine_bet_record.bet_multiple
	 * @param betMultiple  the value for t_machine_bet_record.bet_multiple
	 * @mbg.generated  Tue Mar 28 22:59:34 CST 2017
	 */
	public void setBetMultiple(Integer betMultiple) {
		this.betMultiple = betMultiple;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column t_machine_bet_record.bet_time
	 * @return  the value of t_machine_bet_record.bet_time
	 * @mbg.generated  Tue Mar 28 22:59:34 CST 2017
	 */
	public Date getBetTime() {
		return betTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column t_machine_bet_record.bet_time
	 * @param betTime  the value for t_machine_bet_record.bet_time
	 * @mbg.generated  Tue Mar 28 22:59:34 CST 2017
	 */
	public void setBetTime(Date betTime) {
		this.betTime = betTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_machine_bet_record
	 * @mbg.generated  Tue Mar 28 22:59:34 CST 2017
	 */
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(getClass().getSimpleName());
		sb.append(" [");
		sb.append("Hash = ").append(hashCode());
		sb.append(", id=").append(id);
		sb.append(", userId=").append(userId);
		sb.append(", recordId=").append(recordId);
		sb.append(", betFruitId=").append(betFruitId);
		sb.append(", betScore=").append(betScore);
		sb.append(", betMultiple=").append(betMultiple);
		sb.append(", betTime=").append(betTime);
		sb.append("]");
		return sb.toString();
	}
}