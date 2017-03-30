package com.ahem.machine.weixin.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.math.BigDecimal;

public class VUserBetRecordExample {
    /**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table v_user_bet_record
	 * @mbg.generated  Thu Mar 30 14:53:28 CST 2017
	 */
	protected String orderByClause;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table v_user_bet_record
	 * @mbg.generated  Thu Mar 30 14:53:28 CST 2017
	 */
	protected boolean distinct;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table v_user_bet_record
	 * @mbg.generated  Thu Mar 30 14:53:28 CST 2017
	 */
	protected List<Criteria> oredCriteria;

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table v_user_bet_record
	 * @mbg.generated  Thu Mar 30 14:53:28 CST 2017
	 */
	public VUserBetRecordExample() {
		oredCriteria = new ArrayList<Criteria>();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table v_user_bet_record
	 * @mbg.generated  Thu Mar 30 14:53:28 CST 2017
	 */
	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table v_user_bet_record
	 * @mbg.generated  Thu Mar 30 14:53:28 CST 2017
	 */
	public String getOrderByClause() {
		return orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table v_user_bet_record
	 * @mbg.generated  Thu Mar 30 14:53:28 CST 2017
	 */
	public void setDistinct(boolean distinct) {
		this.distinct = distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table v_user_bet_record
	 * @mbg.generated  Thu Mar 30 14:53:28 CST 2017
	 */
	public boolean isDistinct() {
		return distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table v_user_bet_record
	 * @mbg.generated  Thu Mar 30 14:53:28 CST 2017
	 */
	public List<Criteria> getOredCriteria() {
		return oredCriteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table v_user_bet_record
	 * @mbg.generated  Thu Mar 30 14:53:28 CST 2017
	 */
	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table v_user_bet_record
	 * @mbg.generated  Thu Mar 30 14:53:28 CST 2017
	 */
	public Criteria or() {
		Criteria criteria = createCriteriaInternal();
		oredCriteria.add(criteria);
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table v_user_bet_record
	 * @mbg.generated  Thu Mar 30 14:53:28 CST 2017
	 */
	public Criteria createCriteria() {
		Criteria criteria = createCriteriaInternal();
		if (oredCriteria.size() == 0) {
			oredCriteria.add(criteria);
		}
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table v_user_bet_record
	 * @mbg.generated  Thu Mar 30 14:53:28 CST 2017
	 */
	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table v_user_bet_record
	 * @mbg.generated  Thu Mar 30 14:53:28 CST 2017
	 */
	public void clear() {
		oredCriteria.clear();
		orderByClause = null;
		distinct = false;
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table v_user_bet_record
	 * @mbg.generated  Thu Mar 30 14:53:28 CST 2017
	 */
	protected abstract static class GeneratedCriteria {
		protected List<Criterion> criteria;

		protected GeneratedCriteria() {
			super();
			criteria = new ArrayList<Criterion>();
		}

		public boolean isValid() {
			return criteria.size() > 0;
		}

		public List<Criterion> getAllCriteria() {
			return criteria;
		}

		public List<Criterion> getCriteria() {
			return criteria;
		}

		protected void addCriterion(String condition) {
			if (condition == null) {
				throw new RuntimeException("Value for condition cannot be null");
			}
			criteria.add(new Criterion(condition));
		}

		protected void addCriterion(String condition, Object value, String property) {
			if (value == null) {
				throw new RuntimeException("Value for " + property + " cannot be null");
			}
			criteria.add(new Criterion(condition, value));
		}

		protected void addCriterion(String condition, Object value1, Object value2, String property) {
			if (value1 == null || value2 == null) {
				throw new RuntimeException("Between values for " + property + " cannot be null");
			}
			criteria.add(new Criterion(condition, value1, value2));
		}

		public Criteria andIdIsNull() {
			addCriterion("id is null");
			return (Criteria) this;
		}

		public Criteria andIdIsNotNull() {
			addCriterion("id is not null");
			return (Criteria) this;
		}

		public Criteria andIdEqualTo(Integer value) {
			addCriterion("id =", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdNotEqualTo(Integer value) {
			addCriterion("id <>", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdGreaterThan(Integer value) {
			addCriterion("id >", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdGreaterThanOrEqualTo(Integer value) {
			addCriterion("id >=", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdLessThan(Integer value) {
			addCriterion("id <", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdLessThanOrEqualTo(Integer value) {
			addCriterion("id <=", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdIn(List<Integer> values) {
			addCriterion("id in", values, "id");
			return (Criteria) this;
		}

		public Criteria andIdNotIn(List<Integer> values) {
			addCriterion("id not in", values, "id");
			return (Criteria) this;
		}

		public Criteria andIdBetween(Integer value1, Integer value2) {
			addCriterion("id between", value1, value2, "id");
			return (Criteria) this;
		}

		public Criteria andIdNotBetween(Integer value1, Integer value2) {
			addCriterion("id not between", value1, value2, "id");
			return (Criteria) this;
		}

		public Criteria andUserIdIsNull() {
			addCriterion("user_id is null");
			return (Criteria) this;
		}

		public Criteria andUserIdIsNotNull() {
			addCriterion("user_id is not null");
			return (Criteria) this;
		}

		public Criteria andUserIdEqualTo(Integer value) {
			addCriterion("user_id =", value, "userId");
			return (Criteria) this;
		}

		public Criteria andUserIdNotEqualTo(Integer value) {
			addCriterion("user_id <>", value, "userId");
			return (Criteria) this;
		}

		public Criteria andUserIdGreaterThan(Integer value) {
			addCriterion("user_id >", value, "userId");
			return (Criteria) this;
		}

		public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
			addCriterion("user_id >=", value, "userId");
			return (Criteria) this;
		}

		public Criteria andUserIdLessThan(Integer value) {
			addCriterion("user_id <", value, "userId");
			return (Criteria) this;
		}

		public Criteria andUserIdLessThanOrEqualTo(Integer value) {
			addCriterion("user_id <=", value, "userId");
			return (Criteria) this;
		}

		public Criteria andUserIdIn(List<Integer> values) {
			addCriterion("user_id in", values, "userId");
			return (Criteria) this;
		}

		public Criteria andUserIdNotIn(List<Integer> values) {
			addCriterion("user_id not in", values, "userId");
			return (Criteria) this;
		}

		public Criteria andUserIdBetween(Integer value1, Integer value2) {
			addCriterion("user_id between", value1, value2, "userId");
			return (Criteria) this;
		}

		public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
			addCriterion("user_id not between", value1, value2, "userId");
			return (Criteria) this;
		}

		public Criteria andRecordIdIsNull() {
			addCriterion("record_id is null");
			return (Criteria) this;
		}

		public Criteria andRecordIdIsNotNull() {
			addCriterion("record_id is not null");
			return (Criteria) this;
		}

		public Criteria andRecordIdEqualTo(Integer value) {
			addCriterion("record_id =", value, "recordId");
			return (Criteria) this;
		}

		public Criteria andRecordIdNotEqualTo(Integer value) {
			addCriterion("record_id <>", value, "recordId");
			return (Criteria) this;
		}

		public Criteria andRecordIdGreaterThan(Integer value) {
			addCriterion("record_id >", value, "recordId");
			return (Criteria) this;
		}

		public Criteria andRecordIdGreaterThanOrEqualTo(Integer value) {
			addCriterion("record_id >=", value, "recordId");
			return (Criteria) this;
		}

		public Criteria andRecordIdLessThan(Integer value) {
			addCriterion("record_id <", value, "recordId");
			return (Criteria) this;
		}

		public Criteria andRecordIdLessThanOrEqualTo(Integer value) {
			addCriterion("record_id <=", value, "recordId");
			return (Criteria) this;
		}

		public Criteria andRecordIdIn(List<Integer> values) {
			addCriterion("record_id in", values, "recordId");
			return (Criteria) this;
		}

		public Criteria andRecordIdNotIn(List<Integer> values) {
			addCriterion("record_id not in", values, "recordId");
			return (Criteria) this;
		}

		public Criteria andRecordIdBetween(Integer value1, Integer value2) {
			addCriterion("record_id between", value1, value2, "recordId");
			return (Criteria) this;
		}

		public Criteria andRecordIdNotBetween(Integer value1, Integer value2) {
			addCriterion("record_id not between", value1, value2, "recordId");
			return (Criteria) this;
		}

		public Criteria andBetFruitIdIsNull() {
			addCriterion("bet_fruit_id is null");
			return (Criteria) this;
		}

		public Criteria andBetFruitIdIsNotNull() {
			addCriterion("bet_fruit_id is not null");
			return (Criteria) this;
		}

		public Criteria andBetFruitIdEqualTo(Integer value) {
			addCriterion("bet_fruit_id =", value, "betFruitId");
			return (Criteria) this;
		}

		public Criteria andBetFruitIdNotEqualTo(Integer value) {
			addCriterion("bet_fruit_id <>", value, "betFruitId");
			return (Criteria) this;
		}

		public Criteria andBetFruitIdGreaterThan(Integer value) {
			addCriterion("bet_fruit_id >", value, "betFruitId");
			return (Criteria) this;
		}

		public Criteria andBetFruitIdGreaterThanOrEqualTo(Integer value) {
			addCriterion("bet_fruit_id >=", value, "betFruitId");
			return (Criteria) this;
		}

		public Criteria andBetFruitIdLessThan(Integer value) {
			addCriterion("bet_fruit_id <", value, "betFruitId");
			return (Criteria) this;
		}

		public Criteria andBetFruitIdLessThanOrEqualTo(Integer value) {
			addCriterion("bet_fruit_id <=", value, "betFruitId");
			return (Criteria) this;
		}

		public Criteria andBetFruitIdIn(List<Integer> values) {
			addCriterion("bet_fruit_id in", values, "betFruitId");
			return (Criteria) this;
		}

		public Criteria andBetFruitIdNotIn(List<Integer> values) {
			addCriterion("bet_fruit_id not in", values, "betFruitId");
			return (Criteria) this;
		}

		public Criteria andBetFruitIdBetween(Integer value1, Integer value2) {
			addCriterion("bet_fruit_id between", value1, value2, "betFruitId");
			return (Criteria) this;
		}

		public Criteria andBetFruitIdNotBetween(Integer value1, Integer value2) {
			addCriterion("bet_fruit_id not between", value1, value2, "betFruitId");
			return (Criteria) this;
		}

		public Criteria andBetScoreIsNull() {
			addCriterion("bet_score is null");
			return (Criteria) this;
		}

		public Criteria andBetScoreIsNotNull() {
			addCriterion("bet_score is not null");
			return (Criteria) this;
		}

		public Criteria andBetScoreEqualTo(Integer value) {
			addCriterion("bet_score =", value, "betScore");
			return (Criteria) this;
		}

		public Criteria andBetScoreNotEqualTo(Integer value) {
			addCriterion("bet_score <>", value, "betScore");
			return (Criteria) this;
		}

		public Criteria andBetScoreGreaterThan(Integer value) {
			addCriterion("bet_score >", value, "betScore");
			return (Criteria) this;
		}

		public Criteria andBetScoreGreaterThanOrEqualTo(Integer value) {
			addCriterion("bet_score >=", value, "betScore");
			return (Criteria) this;
		}

		public Criteria andBetScoreLessThan(Integer value) {
			addCriterion("bet_score <", value, "betScore");
			return (Criteria) this;
		}

		public Criteria andBetScoreLessThanOrEqualTo(Integer value) {
			addCriterion("bet_score <=", value, "betScore");
			return (Criteria) this;
		}

		public Criteria andBetScoreIn(List<Integer> values) {
			addCriterion("bet_score in", values, "betScore");
			return (Criteria) this;
		}

		public Criteria andBetScoreNotIn(List<Integer> values) {
			addCriterion("bet_score not in", values, "betScore");
			return (Criteria) this;
		}

		public Criteria andBetScoreBetween(Integer value1, Integer value2) {
			addCriterion("bet_score between", value1, value2, "betScore");
			return (Criteria) this;
		}

		public Criteria andBetScoreNotBetween(Integer value1, Integer value2) {
			addCriterion("bet_score not between", value1, value2, "betScore");
			return (Criteria) this;
		}

		public Criteria andBetMultipleIsNull() {
			addCriterion("bet_multiple is null");
			return (Criteria) this;
		}

		public Criteria andBetMultipleIsNotNull() {
			addCriterion("bet_multiple is not null");
			return (Criteria) this;
		}

		public Criteria andBetMultipleEqualTo(Integer value) {
			addCriterion("bet_multiple =", value, "betMultiple");
			return (Criteria) this;
		}

		public Criteria andBetMultipleNotEqualTo(Integer value) {
			addCriterion("bet_multiple <>", value, "betMultiple");
			return (Criteria) this;
		}

		public Criteria andBetMultipleGreaterThan(Integer value) {
			addCriterion("bet_multiple >", value, "betMultiple");
			return (Criteria) this;
		}

		public Criteria andBetMultipleGreaterThanOrEqualTo(Integer value) {
			addCriterion("bet_multiple >=", value, "betMultiple");
			return (Criteria) this;
		}

		public Criteria andBetMultipleLessThan(Integer value) {
			addCriterion("bet_multiple <", value, "betMultiple");
			return (Criteria) this;
		}

		public Criteria andBetMultipleLessThanOrEqualTo(Integer value) {
			addCriterion("bet_multiple <=", value, "betMultiple");
			return (Criteria) this;
		}

		public Criteria andBetMultipleIn(List<Integer> values) {
			addCriterion("bet_multiple in", values, "betMultiple");
			return (Criteria) this;
		}

		public Criteria andBetMultipleNotIn(List<Integer> values) {
			addCriterion("bet_multiple not in", values, "betMultiple");
			return (Criteria) this;
		}

		public Criteria andBetMultipleBetween(Integer value1, Integer value2) {
			addCriterion("bet_multiple between", value1, value2, "betMultiple");
			return (Criteria) this;
		}

		public Criteria andBetMultipleNotBetween(Integer value1, Integer value2) {
			addCriterion("bet_multiple not between", value1, value2, "betMultiple");
			return (Criteria) this;
		}

		public Criteria andBetTimeIsNull() {
			addCriterion("bet_time is null");
			return (Criteria) this;
		}

		public Criteria andBetTimeIsNotNull() {
			addCriterion("bet_time is not null");
			return (Criteria) this;
		}

		public Criteria andBetTimeEqualTo(Date value) {
			addCriterion("bet_time =", value, "betTime");
			return (Criteria) this;
		}

		public Criteria andBetTimeNotEqualTo(Date value) {
			addCriterion("bet_time <>", value, "betTime");
			return (Criteria) this;
		}

		public Criteria andBetTimeGreaterThan(Date value) {
			addCriterion("bet_time >", value, "betTime");
			return (Criteria) this;
		}

		public Criteria andBetTimeGreaterThanOrEqualTo(Date value) {
			addCriterion("bet_time >=", value, "betTime");
			return (Criteria) this;
		}

		public Criteria andBetTimeLessThan(Date value) {
			addCriterion("bet_time <", value, "betTime");
			return (Criteria) this;
		}

		public Criteria andBetTimeLessThanOrEqualTo(Date value) {
			addCriterion("bet_time <=", value, "betTime");
			return (Criteria) this;
		}

		public Criteria andBetTimeIn(List<Date> values) {
			addCriterion("bet_time in", values, "betTime");
			return (Criteria) this;
		}

		public Criteria andBetTimeNotIn(List<Date> values) {
			addCriterion("bet_time not in", values, "betTime");
			return (Criteria) this;
		}

		public Criteria andBetTimeBetween(Date value1, Date value2) {
			addCriterion("bet_time between", value1, value2, "betTime");
			return (Criteria) this;
		}

		public Criteria andBetTimeNotBetween(Date value1, Date value2) {
			addCriterion("bet_time not between", value1, value2, "betTime");
			return (Criteria) this;
		}

		public Criteria andOpenNumberIsNull() {
			addCriterion("open_number is null");
			return (Criteria) this;
		}

		public Criteria andOpenNumberIsNotNull() {
			addCriterion("open_number is not null");
			return (Criteria) this;
		}

		public Criteria andOpenNumberEqualTo(Integer value) {
			addCriterion("open_number =", value, "openNumber");
			return (Criteria) this;
		}

		public Criteria andOpenNumberNotEqualTo(Integer value) {
			addCriterion("open_number <>", value, "openNumber");
			return (Criteria) this;
		}

		public Criteria andOpenNumberGreaterThan(Integer value) {
			addCriterion("open_number >", value, "openNumber");
			return (Criteria) this;
		}

		public Criteria andOpenNumberGreaterThanOrEqualTo(Integer value) {
			addCriterion("open_number >=", value, "openNumber");
			return (Criteria) this;
		}

		public Criteria andOpenNumberLessThan(Integer value) {
			addCriterion("open_number <", value, "openNumber");
			return (Criteria) this;
		}

		public Criteria andOpenNumberLessThanOrEqualTo(Integer value) {
			addCriterion("open_number <=", value, "openNumber");
			return (Criteria) this;
		}

		public Criteria andOpenNumberIn(List<Integer> values) {
			addCriterion("open_number in", values, "openNumber");
			return (Criteria) this;
		}

		public Criteria andOpenNumberNotIn(List<Integer> values) {
			addCriterion("open_number not in", values, "openNumber");
			return (Criteria) this;
		}

		public Criteria andOpenNumberBetween(Integer value1, Integer value2) {
			addCriterion("open_number between", value1, value2, "openNumber");
			return (Criteria) this;
		}

		public Criteria andOpenNumberNotBetween(Integer value1, Integer value2) {
			addCriterion("open_number not between", value1, value2, "openNumber");
			return (Criteria) this;
		}

		public Criteria andOpenFruitIdIsNull() {
			addCriterion("open_fruit_id is null");
			return (Criteria) this;
		}

		public Criteria andOpenFruitIdIsNotNull() {
			addCriterion("open_fruit_id is not null");
			return (Criteria) this;
		}

		public Criteria andOpenFruitIdEqualTo(Integer value) {
			addCriterion("open_fruit_id =", value, "openFruitId");
			return (Criteria) this;
		}

		public Criteria andOpenFruitIdNotEqualTo(Integer value) {
			addCriterion("open_fruit_id <>", value, "openFruitId");
			return (Criteria) this;
		}

		public Criteria andOpenFruitIdGreaterThan(Integer value) {
			addCriterion("open_fruit_id >", value, "openFruitId");
			return (Criteria) this;
		}

		public Criteria andOpenFruitIdGreaterThanOrEqualTo(Integer value) {
			addCriterion("open_fruit_id >=", value, "openFruitId");
			return (Criteria) this;
		}

		public Criteria andOpenFruitIdLessThan(Integer value) {
			addCriterion("open_fruit_id <", value, "openFruitId");
			return (Criteria) this;
		}

		public Criteria andOpenFruitIdLessThanOrEqualTo(Integer value) {
			addCriterion("open_fruit_id <=", value, "openFruitId");
			return (Criteria) this;
		}

		public Criteria andOpenFruitIdIn(List<Integer> values) {
			addCriterion("open_fruit_id in", values, "openFruitId");
			return (Criteria) this;
		}

		public Criteria andOpenFruitIdNotIn(List<Integer> values) {
			addCriterion("open_fruit_id not in", values, "openFruitId");
			return (Criteria) this;
		}

		public Criteria andOpenFruitIdBetween(Integer value1, Integer value2) {
			addCriterion("open_fruit_id between", value1, value2, "openFruitId");
			return (Criteria) this;
		}

		public Criteria andOpenFruitIdNotBetween(Integer value1, Integer value2) {
			addCriterion("open_fruit_id not between", value1, value2, "openFruitId");
			return (Criteria) this;
		}

		public Criteria andOpenFruitEnNameIsNull() {
			addCriterion("open_fruit_en_name is null");
			return (Criteria) this;
		}

		public Criteria andOpenFruitEnNameIsNotNull() {
			addCriterion("open_fruit_en_name is not null");
			return (Criteria) this;
		}

		public Criteria andOpenFruitEnNameEqualTo(String value) {
			addCriterion("open_fruit_en_name =", value, "openFruitEnName");
			return (Criteria) this;
		}

		public Criteria andOpenFruitEnNameNotEqualTo(String value) {
			addCriterion("open_fruit_en_name <>", value, "openFruitEnName");
			return (Criteria) this;
		}

		public Criteria andOpenFruitEnNameGreaterThan(String value) {
			addCriterion("open_fruit_en_name >", value, "openFruitEnName");
			return (Criteria) this;
		}

		public Criteria andOpenFruitEnNameGreaterThanOrEqualTo(String value) {
			addCriterion("open_fruit_en_name >=", value, "openFruitEnName");
			return (Criteria) this;
		}

		public Criteria andOpenFruitEnNameLessThan(String value) {
			addCriterion("open_fruit_en_name <", value, "openFruitEnName");
			return (Criteria) this;
		}

		public Criteria andOpenFruitEnNameLessThanOrEqualTo(String value) {
			addCriterion("open_fruit_en_name <=", value, "openFruitEnName");
			return (Criteria) this;
		}

		public Criteria andOpenFruitEnNameLike(String value) {
			addCriterion("open_fruit_en_name like", value, "openFruitEnName");
			return (Criteria) this;
		}

		public Criteria andOpenFruitEnNameNotLike(String value) {
			addCriterion("open_fruit_en_name not like", value, "openFruitEnName");
			return (Criteria) this;
		}

		public Criteria andOpenFruitEnNameIn(List<String> values) {
			addCriterion("open_fruit_en_name in", values, "openFruitEnName");
			return (Criteria) this;
		}

		public Criteria andOpenFruitEnNameNotIn(List<String> values) {
			addCriterion("open_fruit_en_name not in", values, "openFruitEnName");
			return (Criteria) this;
		}

		public Criteria andOpenFruitEnNameBetween(String value1, String value2) {
			addCriterion("open_fruit_en_name between", value1, value2, "openFruitEnName");
			return (Criteria) this;
		}

		public Criteria andOpenFruitEnNameNotBetween(String value1, String value2) {
			addCriterion("open_fruit_en_name not between", value1, value2, "openFruitEnName");
			return (Criteria) this;
		}

		public Criteria andOpenFruitCnNameIsNull() {
			addCriterion("open_fruit_cn_name is null");
			return (Criteria) this;
		}

		public Criteria andOpenFruitCnNameIsNotNull() {
			addCriterion("open_fruit_cn_name is not null");
			return (Criteria) this;
		}

		public Criteria andOpenFruitCnNameEqualTo(String value) {
			addCriterion("open_fruit_cn_name =", value, "openFruitCnName");
			return (Criteria) this;
		}

		public Criteria andOpenFruitCnNameNotEqualTo(String value) {
			addCriterion("open_fruit_cn_name <>", value, "openFruitCnName");
			return (Criteria) this;
		}

		public Criteria andOpenFruitCnNameGreaterThan(String value) {
			addCriterion("open_fruit_cn_name >", value, "openFruitCnName");
			return (Criteria) this;
		}

		public Criteria andOpenFruitCnNameGreaterThanOrEqualTo(String value) {
			addCriterion("open_fruit_cn_name >=", value, "openFruitCnName");
			return (Criteria) this;
		}

		public Criteria andOpenFruitCnNameLessThan(String value) {
			addCriterion("open_fruit_cn_name <", value, "openFruitCnName");
			return (Criteria) this;
		}

		public Criteria andOpenFruitCnNameLessThanOrEqualTo(String value) {
			addCriterion("open_fruit_cn_name <=", value, "openFruitCnName");
			return (Criteria) this;
		}

		public Criteria andOpenFruitCnNameLike(String value) {
			addCriterion("open_fruit_cn_name like", value, "openFruitCnName");
			return (Criteria) this;
		}

		public Criteria andOpenFruitCnNameNotLike(String value) {
			addCriterion("open_fruit_cn_name not like", value, "openFruitCnName");
			return (Criteria) this;
		}

		public Criteria andOpenFruitCnNameIn(List<String> values) {
			addCriterion("open_fruit_cn_name in", values, "openFruitCnName");
			return (Criteria) this;
		}

		public Criteria andOpenFruitCnNameNotIn(List<String> values) {
			addCriterion("open_fruit_cn_name not in", values, "openFruitCnName");
			return (Criteria) this;
		}

		public Criteria andOpenFruitCnNameBetween(String value1, String value2) {
			addCriterion("open_fruit_cn_name between", value1, value2, "openFruitCnName");
			return (Criteria) this;
		}

		public Criteria andOpenFruitCnNameNotBetween(String value1, String value2) {
			addCriterion("open_fruit_cn_name not between", value1, value2, "openFruitCnName");
			return (Criteria) this;
		}

		public Criteria andOpenFruitMultipleIsNull() {
			addCriterion("open_fruit_multiple is null");
			return (Criteria) this;
		}

		public Criteria andOpenFruitMultipleIsNotNull() {
			addCriterion("open_fruit_multiple is not null");
			return (Criteria) this;
		}

		public Criteria andOpenFruitMultipleEqualTo(Integer value) {
			addCriterion("open_fruit_multiple =", value, "openFruitMultiple");
			return (Criteria) this;
		}

		public Criteria andOpenFruitMultipleNotEqualTo(Integer value) {
			addCriterion("open_fruit_multiple <>", value, "openFruitMultiple");
			return (Criteria) this;
		}

		public Criteria andOpenFruitMultipleGreaterThan(Integer value) {
			addCriterion("open_fruit_multiple >", value, "openFruitMultiple");
			return (Criteria) this;
		}

		public Criteria andOpenFruitMultipleGreaterThanOrEqualTo(Integer value) {
			addCriterion("open_fruit_multiple >=", value, "openFruitMultiple");
			return (Criteria) this;
		}

		public Criteria andOpenFruitMultipleLessThan(Integer value) {
			addCriterion("open_fruit_multiple <", value, "openFruitMultiple");
			return (Criteria) this;
		}

		public Criteria andOpenFruitMultipleLessThanOrEqualTo(Integer value) {
			addCriterion("open_fruit_multiple <=", value, "openFruitMultiple");
			return (Criteria) this;
		}

		public Criteria andOpenFruitMultipleIn(List<Integer> values) {
			addCriterion("open_fruit_multiple in", values, "openFruitMultiple");
			return (Criteria) this;
		}

		public Criteria andOpenFruitMultipleNotIn(List<Integer> values) {
			addCriterion("open_fruit_multiple not in", values, "openFruitMultiple");
			return (Criteria) this;
		}

		public Criteria andOpenFruitMultipleBetween(Integer value1, Integer value2) {
			addCriterion("open_fruit_multiple between", value1, value2, "openFruitMultiple");
			return (Criteria) this;
		}

		public Criteria andOpenFruitMultipleNotBetween(Integer value1, Integer value2) {
			addCriterion("open_fruit_multiple not between", value1, value2, "openFruitMultiple");
			return (Criteria) this;
		}

		public Criteria andOpenTimeIsNull() {
			addCriterion("open_time is null");
			return (Criteria) this;
		}

		public Criteria andOpenTimeIsNotNull() {
			addCriterion("open_time is not null");
			return (Criteria) this;
		}

		public Criteria andOpenTimeEqualTo(Date value) {
			addCriterion("open_time =", value, "openTime");
			return (Criteria) this;
		}

		public Criteria andOpenTimeNotEqualTo(Date value) {
			addCriterion("open_time <>", value, "openTime");
			return (Criteria) this;
		}

		public Criteria andOpenTimeGreaterThan(Date value) {
			addCriterion("open_time >", value, "openTime");
			return (Criteria) this;
		}

		public Criteria andOpenTimeGreaterThanOrEqualTo(Date value) {
			addCriterion("open_time >=", value, "openTime");
			return (Criteria) this;
		}

		public Criteria andOpenTimeLessThan(Date value) {
			addCriterion("open_time <", value, "openTime");
			return (Criteria) this;
		}

		public Criteria andOpenTimeLessThanOrEqualTo(Date value) {
			addCriterion("open_time <=", value, "openTime");
			return (Criteria) this;
		}

		public Criteria andOpenTimeIn(List<Date> values) {
			addCriterion("open_time in", values, "openTime");
			return (Criteria) this;
		}

		public Criteria andOpenTimeNotIn(List<Date> values) {
			addCriterion("open_time not in", values, "openTime");
			return (Criteria) this;
		}

		public Criteria andOpenTimeBetween(Date value1, Date value2) {
			addCriterion("open_time between", value1, value2, "openTime");
			return (Criteria) this;
		}

		public Criteria andOpenTimeNotBetween(Date value1, Date value2) {
			addCriterion("open_time not between", value1, value2, "openTime");
			return (Criteria) this;
		}

		public Criteria andBetResultIsNull() {
			addCriterion("bet_result is null");
			return (Criteria) this;
		}

		public Criteria andBetResultIsNotNull() {
			addCriterion("bet_result is not null");
			return (Criteria) this;
		}

		public Criteria andBetResultEqualTo(String value) {
			addCriterion("bet_result =", value, "betResult");
			return (Criteria) this;
		}

		public Criteria andBetResultNotEqualTo(String value) {
			addCriterion("bet_result <>", value, "betResult");
			return (Criteria) this;
		}

		public Criteria andBetResultGreaterThan(String value) {
			addCriterion("bet_result >", value, "betResult");
			return (Criteria) this;
		}

		public Criteria andBetResultGreaterThanOrEqualTo(String value) {
			addCriterion("bet_result >=", value, "betResult");
			return (Criteria) this;
		}

		public Criteria andBetResultLessThan(String value) {
			addCriterion("bet_result <", value, "betResult");
			return (Criteria) this;
		}

		public Criteria andBetResultLessThanOrEqualTo(String value) {
			addCriterion("bet_result <=", value, "betResult");
			return (Criteria) this;
		}

		public Criteria andBetResultLike(String value) {
			addCriterion("bet_result like", value, "betResult");
			return (Criteria) this;
		}

		public Criteria andBetResultNotLike(String value) {
			addCriterion("bet_result not like", value, "betResult");
			return (Criteria) this;
		}

		public Criteria andBetResultIn(List<String> values) {
			addCriterion("bet_result in", values, "betResult");
			return (Criteria) this;
		}

		public Criteria andBetResultNotIn(List<String> values) {
			addCriterion("bet_result not in", values, "betResult");
			return (Criteria) this;
		}

		public Criteria andBetResultBetween(String value1, String value2) {
			addCriterion("bet_result between", value1, value2, "betResult");
			return (Criteria) this;
		}

		public Criteria andBetResultNotBetween(String value1, String value2) {
			addCriterion("bet_result not between", value1, value2, "betResult");
			return (Criteria) this;
		}

		public Criteria andGotScoreIsNull() {
			addCriterion("got_score is null");
			return (Criteria) this;
		}

		public Criteria andGotScoreIsNotNull() {
			addCriterion("got_score is not null");
			return (Criteria) this;
		}

		public Criteria andGotScoreEqualTo(BigDecimal value) {
			addCriterion("got_score =", value, "gotScore");
			return (Criteria) this;
		}

		public Criteria andGotScoreNotEqualTo(BigDecimal value) {
			addCriterion("got_score <>", value, "gotScore");
			return (Criteria) this;
		}

		public Criteria andGotScoreGreaterThan(BigDecimal value) {
			addCriterion("got_score >", value, "gotScore");
			return (Criteria) this;
		}

		public Criteria andGotScoreGreaterThanOrEqualTo(BigDecimal value) {
			addCriterion("got_score >=", value, "gotScore");
			return (Criteria) this;
		}

		public Criteria andGotScoreLessThan(BigDecimal value) {
			addCriterion("got_score <", value, "gotScore");
			return (Criteria) this;
		}

		public Criteria andGotScoreLessThanOrEqualTo(BigDecimal value) {
			addCriterion("got_score <=", value, "gotScore");
			return (Criteria) this;
		}

		public Criteria andGotScoreIn(List<BigDecimal> values) {
			addCriterion("got_score in", values, "gotScore");
			return (Criteria) this;
		}

		public Criteria andGotScoreNotIn(List<BigDecimal> values) {
			addCriterion("got_score not in", values, "gotScore");
			return (Criteria) this;
		}

		public Criteria andGotScoreBetween(BigDecimal value1, BigDecimal value2) {
			addCriterion("got_score between", value1, value2, "gotScore");
			return (Criteria) this;
		}

		public Criteria andGotScoreNotBetween(BigDecimal value1, BigDecimal value2) {
			addCriterion("got_score not between", value1, value2, "gotScore");
			return (Criteria) this;
		}
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table v_user_bet_record
	 * @mbg.generated  Thu Mar 30 14:53:28 CST 2017
	 */
	public static class Criterion {
		private String condition;
		private Object value;
		private Object secondValue;
		private boolean noValue;
		private boolean singleValue;
		private boolean betweenValue;
		private boolean listValue;
		private String typeHandler;

		public String getCondition() {
			return condition;
		}

		public Object getValue() {
			return value;
		}

		public Object getSecondValue() {
			return secondValue;
		}

		public boolean isNoValue() {
			return noValue;
		}

		public boolean isSingleValue() {
			return singleValue;
		}

		public boolean isBetweenValue() {
			return betweenValue;
		}

		public boolean isListValue() {
			return listValue;
		}

		public String getTypeHandler() {
			return typeHandler;
		}

		protected Criterion(String condition) {
			super();
			this.condition = condition;
			this.typeHandler = null;
			this.noValue = true;
		}

		protected Criterion(String condition, Object value, String typeHandler) {
			super();
			this.condition = condition;
			this.value = value;
			this.typeHandler = typeHandler;
			if (value instanceof List<?>) {
				this.listValue = true;
			} else {
				this.singleValue = true;
			}
		}

		protected Criterion(String condition, Object value) {
			this(condition, value, null);
		}

		protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
			super();
			this.condition = condition;
			this.value = value;
			this.secondValue = secondValue;
			this.typeHandler = typeHandler;
			this.betweenValue = true;
		}

		protected Criterion(String condition, Object value, Object secondValue) {
			this(condition, value, secondValue, null);
		}
	}

	/**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table v_user_bet_record
     *
     * @mbg.generated do_not_delete_during_merge Thu Mar 30 10:34:57 CST 2017
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }
}