package com.ahem.machine.weixin.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class VBetStatisticExample {
    /**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table v_bet_statistic
	 * @mbg.generated  Sat Apr 15 20:14:12 CST 2017
	 */
	protected String orderByClause;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table v_bet_statistic
	 * @mbg.generated  Sat Apr 15 20:14:12 CST 2017
	 */
	protected boolean distinct;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table v_bet_statistic
	 * @mbg.generated  Sat Apr 15 20:14:12 CST 2017
	 */
	protected List<Criteria> oredCriteria;

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table v_bet_statistic
	 * @mbg.generated  Sat Apr 15 20:14:12 CST 2017
	 */
	public VBetStatisticExample() {
		oredCriteria = new ArrayList<Criteria>();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table v_bet_statistic
	 * @mbg.generated  Sat Apr 15 20:14:12 CST 2017
	 */
	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table v_bet_statistic
	 * @mbg.generated  Sat Apr 15 20:14:12 CST 2017
	 */
	public String getOrderByClause() {
		return orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table v_bet_statistic
	 * @mbg.generated  Sat Apr 15 20:14:12 CST 2017
	 */
	public void setDistinct(boolean distinct) {
		this.distinct = distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table v_bet_statistic
	 * @mbg.generated  Sat Apr 15 20:14:12 CST 2017
	 */
	public boolean isDistinct() {
		return distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table v_bet_statistic
	 * @mbg.generated  Sat Apr 15 20:14:12 CST 2017
	 */
	public List<Criteria> getOredCriteria() {
		return oredCriteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table v_bet_statistic
	 * @mbg.generated  Sat Apr 15 20:14:12 CST 2017
	 */
	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table v_bet_statistic
	 * @mbg.generated  Sat Apr 15 20:14:12 CST 2017
	 */
	public Criteria or() {
		Criteria criteria = createCriteriaInternal();
		oredCriteria.add(criteria);
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table v_bet_statistic
	 * @mbg.generated  Sat Apr 15 20:14:12 CST 2017
	 */
	public Criteria createCriteria() {
		Criteria criteria = createCriteriaInternal();
		if (oredCriteria.size() == 0) {
			oredCriteria.add(criteria);
		}
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table v_bet_statistic
	 * @mbg.generated  Sat Apr 15 20:14:12 CST 2017
	 */
	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table v_bet_statistic
	 * @mbg.generated  Sat Apr 15 20:14:12 CST 2017
	 */
	public void clear() {
		oredCriteria.clear();
		orderByClause = null;
		distinct = false;
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table v_bet_statistic
	 * @mbg.generated  Sat Apr 15 20:14:12 CST 2017
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

		public Criteria andFruitIdIsNull() {
			addCriterion("fruit_id is null");
			return (Criteria) this;
		}

		public Criteria andFruitIdIsNotNull() {
			addCriterion("fruit_id is not null");
			return (Criteria) this;
		}

		public Criteria andFruitIdEqualTo(Integer value) {
			addCriterion("fruit_id =", value, "fruitId");
			return (Criteria) this;
		}

		public Criteria andFruitIdNotEqualTo(Integer value) {
			addCriterion("fruit_id <>", value, "fruitId");
			return (Criteria) this;
		}

		public Criteria andFruitIdGreaterThan(Integer value) {
			addCriterion("fruit_id >", value, "fruitId");
			return (Criteria) this;
		}

		public Criteria andFruitIdGreaterThanOrEqualTo(Integer value) {
			addCriterion("fruit_id >=", value, "fruitId");
			return (Criteria) this;
		}

		public Criteria andFruitIdLessThan(Integer value) {
			addCriterion("fruit_id <", value, "fruitId");
			return (Criteria) this;
		}

		public Criteria andFruitIdLessThanOrEqualTo(Integer value) {
			addCriterion("fruit_id <=", value, "fruitId");
			return (Criteria) this;
		}

		public Criteria andFruitIdIn(List<Integer> values) {
			addCriterion("fruit_id in", values, "fruitId");
			return (Criteria) this;
		}

		public Criteria andFruitIdNotIn(List<Integer> values) {
			addCriterion("fruit_id not in", values, "fruitId");
			return (Criteria) this;
		}

		public Criteria andFruitIdBetween(Integer value1, Integer value2) {
			addCriterion("fruit_id between", value1, value2, "fruitId");
			return (Criteria) this;
		}

		public Criteria andFruitIdNotBetween(Integer value1, Integer value2) {
			addCriterion("fruit_id not between", value1, value2, "fruitId");
			return (Criteria) this;
		}

		public Criteria andFruitNameIsNull() {
			addCriterion("fruit_name is null");
			return (Criteria) this;
		}

		public Criteria andFruitNameIsNotNull() {
			addCriterion("fruit_name is not null");
			return (Criteria) this;
		}

		public Criteria andFruitNameEqualTo(String value) {
			addCriterion("fruit_name =", value, "fruitName");
			return (Criteria) this;
		}

		public Criteria andFruitNameNotEqualTo(String value) {
			addCriterion("fruit_name <>", value, "fruitName");
			return (Criteria) this;
		}

		public Criteria andFruitNameGreaterThan(String value) {
			addCriterion("fruit_name >", value, "fruitName");
			return (Criteria) this;
		}

		public Criteria andFruitNameGreaterThanOrEqualTo(String value) {
			addCriterion("fruit_name >=", value, "fruitName");
			return (Criteria) this;
		}

		public Criteria andFruitNameLessThan(String value) {
			addCriterion("fruit_name <", value, "fruitName");
			return (Criteria) this;
		}

		public Criteria andFruitNameLessThanOrEqualTo(String value) {
			addCriterion("fruit_name <=", value, "fruitName");
			return (Criteria) this;
		}

		public Criteria andFruitNameLike(String value) {
			addCriterion("fruit_name like", value, "fruitName");
			return (Criteria) this;
		}

		public Criteria andFruitNameNotLike(String value) {
			addCriterion("fruit_name not like", value, "fruitName");
			return (Criteria) this;
		}

		public Criteria andFruitNameIn(List<String> values) {
			addCriterion("fruit_name in", values, "fruitName");
			return (Criteria) this;
		}

		public Criteria andFruitNameNotIn(List<String> values) {
			addCriterion("fruit_name not in", values, "fruitName");
			return (Criteria) this;
		}

		public Criteria andFruitNameBetween(String value1, String value2) {
			addCriterion("fruit_name between", value1, value2, "fruitName");
			return (Criteria) this;
		}

		public Criteria andFruitNameNotBetween(String value1, String value2) {
			addCriterion("fruit_name not between", value1, value2, "fruitName");
			return (Criteria) this;
		}

		public Criteria andSumScoreIsNull() {
			addCriterion("sum_score is null");
			return (Criteria) this;
		}

		public Criteria andSumScoreIsNotNull() {
			addCriterion("sum_score is not null");
			return (Criteria) this;
		}

		public Criteria andSumScoreEqualTo(BigDecimal value) {
			addCriterion("sum_score =", value, "sumScore");
			return (Criteria) this;
		}

		public Criteria andSumScoreNotEqualTo(BigDecimal value) {
			addCriterion("sum_score <>", value, "sumScore");
			return (Criteria) this;
		}

		public Criteria andSumScoreGreaterThan(BigDecimal value) {
			addCriterion("sum_score >", value, "sumScore");
			return (Criteria) this;
		}

		public Criteria andSumScoreGreaterThanOrEqualTo(BigDecimal value) {
			addCriterion("sum_score >=", value, "sumScore");
			return (Criteria) this;
		}

		public Criteria andSumScoreLessThan(BigDecimal value) {
			addCriterion("sum_score <", value, "sumScore");
			return (Criteria) this;
		}

		public Criteria andSumScoreLessThanOrEqualTo(BigDecimal value) {
			addCriterion("sum_score <=", value, "sumScore");
			return (Criteria) this;
		}

		public Criteria andSumScoreIn(List<BigDecimal> values) {
			addCriterion("sum_score in", values, "sumScore");
			return (Criteria) this;
		}

		public Criteria andSumScoreNotIn(List<BigDecimal> values) {
			addCriterion("sum_score not in", values, "sumScore");
			return (Criteria) this;
		}

		public Criteria andSumScoreBetween(BigDecimal value1, BigDecimal value2) {
			addCriterion("sum_score between", value1, value2, "sumScore");
			return (Criteria) this;
		}

		public Criteria andSumScoreNotBetween(BigDecimal value1, BigDecimal value2) {
			addCriterion("sum_score not between", value1, value2, "sumScore");
			return (Criteria) this;
		}

		public Criteria andAllSumIsNull() {
			addCriterion("all_sum is null");
			return (Criteria) this;
		}

		public Criteria andAllSumIsNotNull() {
			addCriterion("all_sum is not null");
			return (Criteria) this;
		}

		public Criteria andAllSumEqualTo(BigDecimal value) {
			addCriterion("all_sum =", value, "allSum");
			return (Criteria) this;
		}

		public Criteria andAllSumNotEqualTo(BigDecimal value) {
			addCriterion("all_sum <>", value, "allSum");
			return (Criteria) this;
		}

		public Criteria andAllSumGreaterThan(BigDecimal value) {
			addCriterion("all_sum >", value, "allSum");
			return (Criteria) this;
		}

		public Criteria andAllSumGreaterThanOrEqualTo(BigDecimal value) {
			addCriterion("all_sum >=", value, "allSum");
			return (Criteria) this;
		}

		public Criteria andAllSumLessThan(BigDecimal value) {
			addCriterion("all_sum <", value, "allSum");
			return (Criteria) this;
		}

		public Criteria andAllSumLessThanOrEqualTo(BigDecimal value) {
			addCriterion("all_sum <=", value, "allSum");
			return (Criteria) this;
		}

		public Criteria andAllSumIn(List<BigDecimal> values) {
			addCriterion("all_sum in", values, "allSum");
			return (Criteria) this;
		}

		public Criteria andAllSumNotIn(List<BigDecimal> values) {
			addCriterion("all_sum not in", values, "allSum");
			return (Criteria) this;
		}

		public Criteria andAllSumBetween(BigDecimal value1, BigDecimal value2) {
			addCriterion("all_sum between", value1, value2, "allSum");
			return (Criteria) this;
		}

		public Criteria andAllSumNotBetween(BigDecimal value1, BigDecimal value2) {
			addCriterion("all_sum not between", value1, value2, "allSum");
			return (Criteria) this;
		}
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table v_bet_statistic
	 * @mbg.generated  Sat Apr 15 20:14:12 CST 2017
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
     * This class corresponds to the database table v_bet_statistic
     *
     * @mbg.generated do_not_delete_during_merge Fri Apr 07 09:38:56 CST 2017
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }
}