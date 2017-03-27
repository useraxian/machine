package com.ahem.machine.weixin.mapper;

import com.ahem.machine.weixin.entity.TMachineFruit;
import com.ahem.machine.weixin.entity.TMachineFruitExample.Criteria;
import com.ahem.machine.weixin.entity.TMachineFruitExample.Criterion;
import com.ahem.machine.weixin.entity.TMachineFruitExample;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class TMachineFruitSqlProvider {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_machine_fruit
	 * @mbg.generated  Sun Mar 26 16:59:34 CST 2017
	 */
	public String countByExample(TMachineFruitExample example) {
		SQL sql = new SQL();
		sql.SELECT("count(*)").FROM("t_machine_fruit");
		applyWhere(sql, example, false);
		return sql.toString();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_machine_fruit
	 * @mbg.generated  Sun Mar 26 16:59:34 CST 2017
	 */
	public String deleteByExample(TMachineFruitExample example) {
		SQL sql = new SQL();
		sql.DELETE_FROM("t_machine_fruit");
		applyWhere(sql, example, false);
		return sql.toString();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_machine_fruit
	 * @mbg.generated  Sun Mar 26 16:59:34 CST 2017
	 */
	public String insertSelective(TMachineFruit record) {
		SQL sql = new SQL();
		sql.INSERT_INTO("t_machine_fruit");
		if (record.getId() != null) {
			sql.VALUES("id", "#{id,jdbcType=INTEGER}");
		}
		if (record.getEnName() != null) {
			sql.VALUES("en_name", "#{enName,jdbcType=VARCHAR}");
		}
		if (record.getCnName() != null) {
			sql.VALUES("cn_name", "#{cnName,jdbcType=VARCHAR}");
		}
		if (record.getImageName() != null) {
			sql.VALUES("image_name", "#{imageName,jdbcType=VARCHAR}");
		}
		if (record.getButtonName() != null) {
			sql.VALUES("button_name", "#{buttonName,jdbcType=VARCHAR}");
		}
		return sql.toString();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_machine_fruit
	 * @mbg.generated  Sun Mar 26 16:59:34 CST 2017
	 */
	public String selectByExample(TMachineFruitExample example) {
		SQL sql = new SQL();
		if (example != null && example.isDistinct()) {
			sql.SELECT_DISTINCT("id");
		} else {
			sql.SELECT("id");
		}
		sql.SELECT("en_name");
		sql.SELECT("cn_name");
		sql.SELECT("image_name");
		sql.SELECT("button_name");
		sql.FROM("t_machine_fruit");
		applyWhere(sql, example, false);
		if (example != null && example.getOrderByClause() != null) {
			sql.ORDER_BY(example.getOrderByClause());
		}
		return sql.toString();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_machine_fruit
	 * @mbg.generated  Sun Mar 26 16:59:34 CST 2017
	 */
	public String updateByExampleSelective(Map<String, Object> parameter) {
		TMachineFruit record = (TMachineFruit) parameter.get("record");
		TMachineFruitExample example = (TMachineFruitExample) parameter.get("example");
		SQL sql = new SQL();
		sql.UPDATE("t_machine_fruit");
		if (record.getId() != null) {
			sql.SET("id = #{record.id,jdbcType=INTEGER}");
		}
		if (record.getEnName() != null) {
			sql.SET("en_name = #{record.enName,jdbcType=VARCHAR}");
		}
		if (record.getCnName() != null) {
			sql.SET("cn_name = #{record.cnName,jdbcType=VARCHAR}");
		}
		if (record.getImageName() != null) {
			sql.SET("image_name = #{record.imageName,jdbcType=VARCHAR}");
		}
		if (record.getButtonName() != null) {
			sql.SET("button_name = #{record.buttonName,jdbcType=VARCHAR}");
		}
		applyWhere(sql, example, true);
		return sql.toString();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_machine_fruit
	 * @mbg.generated  Sun Mar 26 16:59:34 CST 2017
	 */
	public String updateByExample(Map<String, Object> parameter) {
		SQL sql = new SQL();
		sql.UPDATE("t_machine_fruit");
		sql.SET("id = #{record.id,jdbcType=INTEGER}");
		sql.SET("en_name = #{record.enName,jdbcType=VARCHAR}");
		sql.SET("cn_name = #{record.cnName,jdbcType=VARCHAR}");
		sql.SET("image_name = #{record.imageName,jdbcType=VARCHAR}");
		sql.SET("button_name = #{record.buttonName,jdbcType=VARCHAR}");
		TMachineFruitExample example = (TMachineFruitExample) parameter.get("example");
		applyWhere(sql, example, true);
		return sql.toString();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_machine_fruit
	 * @mbg.generated  Sun Mar 26 16:59:34 CST 2017
	 */
	public String updateByPrimaryKeySelective(TMachineFruit record) {
		SQL sql = new SQL();
		sql.UPDATE("t_machine_fruit");
		if (record.getEnName() != null) {
			sql.SET("en_name = #{enName,jdbcType=VARCHAR}");
		}
		if (record.getCnName() != null) {
			sql.SET("cn_name = #{cnName,jdbcType=VARCHAR}");
		}
		if (record.getImageName() != null) {
			sql.SET("image_name = #{imageName,jdbcType=VARCHAR}");
		}
		if (record.getButtonName() != null) {
			sql.SET("button_name = #{buttonName,jdbcType=VARCHAR}");
		}
		sql.WHERE("id = #{id,jdbcType=INTEGER}");
		return sql.toString();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_machine_fruit
	 * @mbg.generated  Sun Mar 26 16:59:34 CST 2017
	 */
	protected void applyWhere(SQL sql, TMachineFruitExample example, boolean includeExamplePhrase) {
		if (example == null) {
			return;
		}
		String parmPhrase1;
		String parmPhrase1_th;
		String parmPhrase2;
		String parmPhrase2_th;
		String parmPhrase3;
		String parmPhrase3_th;
		if (includeExamplePhrase) {
			parmPhrase1 = "%s #{example.oredCriteria[%d].allCriteria[%d].value}";
			parmPhrase1_th = "%s #{example.oredCriteria[%d].allCriteria[%d].value,typeHandler=%s}";
			parmPhrase2 = "%s #{example.oredCriteria[%d].allCriteria[%d].value} and #{example.oredCriteria[%d].criteria[%d].secondValue}";
			parmPhrase2_th = "%s #{example.oredCriteria[%d].allCriteria[%d].value,typeHandler=%s} and #{example.oredCriteria[%d].criteria[%d].secondValue,typeHandler=%s}";
			parmPhrase3 = "#{example.oredCriteria[%d].allCriteria[%d].value[%d]}";
			parmPhrase3_th = "#{example.oredCriteria[%d].allCriteria[%d].value[%d],typeHandler=%s}";
		} else {
			parmPhrase1 = "%s #{oredCriteria[%d].allCriteria[%d].value}";
			parmPhrase1_th = "%s #{oredCriteria[%d].allCriteria[%d].value,typeHandler=%s}";
			parmPhrase2 = "%s #{oredCriteria[%d].allCriteria[%d].value} and #{oredCriteria[%d].criteria[%d].secondValue}";
			parmPhrase2_th = "%s #{oredCriteria[%d].allCriteria[%d].value,typeHandler=%s} and #{oredCriteria[%d].criteria[%d].secondValue,typeHandler=%s}";
			parmPhrase3 = "#{oredCriteria[%d].allCriteria[%d].value[%d]}";
			parmPhrase3_th = "#{oredCriteria[%d].allCriteria[%d].value[%d],typeHandler=%s}";
		}
		StringBuilder sb = new StringBuilder();
		List<Criteria> oredCriteria = example.getOredCriteria();
		boolean firstCriteria = true;
		for (int i = 0; i < oredCriteria.size(); i++) {
			Criteria criteria = oredCriteria.get(i);
			if (criteria.isValid()) {
				if (firstCriteria) {
					firstCriteria = false;
				} else {
					sb.append(" or ");
				}
				sb.append('(');
				List<Criterion> criterions = criteria.getAllCriteria();
				boolean firstCriterion = true;
				for (int j = 0; j < criterions.size(); j++) {
					Criterion criterion = criterions.get(j);
					if (firstCriterion) {
						firstCriterion = false;
					} else {
						sb.append(" and ");
					}
					if (criterion.isNoValue()) {
						sb.append(criterion.getCondition());
					} else if (criterion.isSingleValue()) {
						if (criterion.getTypeHandler() == null) {
							sb.append(String.format(parmPhrase1, criterion.getCondition(), i, j));
						} else {
							sb.append(String.format(parmPhrase1_th, criterion.getCondition(), i, j,
									criterion.getTypeHandler()));
						}
					} else if (criterion.isBetweenValue()) {
						if (criterion.getTypeHandler() == null) {
							sb.append(String.format(parmPhrase2, criterion.getCondition(), i, j, i, j));
						} else {
							sb.append(String.format(parmPhrase2_th, criterion.getCondition(), i, j,
									criterion.getTypeHandler(), i, j, criterion.getTypeHandler()));
						}
					} else if (criterion.isListValue()) {
						sb.append(criterion.getCondition());
						sb.append(" (");
						List<?> listItems = (List<?>) criterion.getValue();
						boolean comma = false;
						for (int k = 0; k < listItems.size(); k++) {
							if (comma) {
								sb.append(", ");
							} else {
								comma = true;
							}
							if (criterion.getTypeHandler() == null) {
								sb.append(String.format(parmPhrase3, i, j, k));
							} else {
								sb.append(String.format(parmPhrase3_th, i, j, k, criterion.getTypeHandler()));
							}
						}
						sb.append(')');
					}
				}
				sb.append(')');
			}
		}
		if (sb.length() > 0) {
			sql.WHERE(sb.toString());
		}
	}
}