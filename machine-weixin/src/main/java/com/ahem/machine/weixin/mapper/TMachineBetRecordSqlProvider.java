package com.ahem.machine.weixin.mapper;

import com.ahem.machine.weixin.entity.TMachineBetRecord;
import com.ahem.machine.weixin.entity.TMachineBetRecordExample.Criteria;
import com.ahem.machine.weixin.entity.TMachineBetRecordExample.Criterion;
import com.ahem.machine.weixin.entity.TMachineBetRecordExample;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class TMachineBetRecordSqlProvider {

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_machine_bet_record
     *
     * @mbg.generated Sun Mar 26 16:59:34 CST 2017
     */
    public String countByExample(TMachineBetRecordExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("t_machine_bet_record");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_machine_bet_record
     *
     * @mbg.generated Sun Mar 26 16:59:34 CST 2017
     */
    public String deleteByExample(TMachineBetRecordExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("t_machine_bet_record");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_machine_bet_record
     *
     * @mbg.generated Sun Mar 26 16:59:34 CST 2017
     */
    public String insertSelective(TMachineBetRecord record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("t_machine_bet_record");
        
        if (record.getId() != null) {
            sql.VALUES("id", "#{id,jdbcType=INTEGER}");
        }
        
        if (record.getUserId() != null) {
            sql.VALUES("user_id", "#{userId,jdbcType=VARCHAR}");
        }
        
        if (record.getRecordId() != null) {
            sql.VALUES("record_id", "#{recordId,jdbcType=INTEGER}");
        }
        
        if (record.getBetFruitId() != null) {
            sql.VALUES("bet_fruit_id", "#{betFruitId,jdbcType=INTEGER}");
        }
        
        if (record.getBetScore() != null) {
            sql.VALUES("bet_score", "#{betScore,jdbcType=INTEGER}");
        }
        
        if (record.getBetMultiple() != null) {
            sql.VALUES("bet_multiple", "#{betMultiple,jdbcType=INTEGER}");
        }
        
        if (record.getBetTime() != null) {
            sql.VALUES("bet_time", "#{betTime,jdbcType=TIMESTAMP}");
        }
        
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_machine_bet_record
     *
     * @mbg.generated Sun Mar 26 16:59:34 CST 2017
     */
    public String selectByExample(TMachineBetRecordExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("id");
        } else {
            sql.SELECT("id");
        }
        sql.SELECT("user_id");
        sql.SELECT("record_id");
        sql.SELECT("bet_fruit_id");
        sql.SELECT("bet_score");
        sql.SELECT("bet_multiple");
        sql.SELECT("bet_time");
        sql.FROM("t_machine_bet_record");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_machine_bet_record
     *
     * @mbg.generated Sun Mar 26 16:59:34 CST 2017
     */
    public String updateByExampleSelective(Map<String, Object> parameter) {
        TMachineBetRecord record = (TMachineBetRecord) parameter.get("record");
        TMachineBetRecordExample example = (TMachineBetRecordExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("t_machine_bet_record");
        
        if (record.getId() != null) {
            sql.SET("id = #{record.id,jdbcType=INTEGER}");
        }
        
        if (record.getUserId() != null) {
            sql.SET("user_id = #{record.userId,jdbcType=VARCHAR}");
        }
        
        if (record.getRecordId() != null) {
            sql.SET("record_id = #{record.recordId,jdbcType=INTEGER}");
        }
        
        if (record.getBetFruitId() != null) {
            sql.SET("bet_fruit_id = #{record.betFruitId,jdbcType=INTEGER}");
        }
        
        if (record.getBetScore() != null) {
            sql.SET("bet_score = #{record.betScore,jdbcType=INTEGER}");
        }
        
        if (record.getBetMultiple() != null) {
            sql.SET("bet_multiple = #{record.betMultiple,jdbcType=INTEGER}");
        }
        
        if (record.getBetTime() != null) {
            sql.SET("bet_time = #{record.betTime,jdbcType=TIMESTAMP}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_machine_bet_record
     *
     * @mbg.generated Sun Mar 26 16:59:34 CST 2017
     */
    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("t_machine_bet_record");
        
        sql.SET("id = #{record.id,jdbcType=INTEGER}");
        sql.SET("user_id = #{record.userId,jdbcType=VARCHAR}");
        sql.SET("record_id = #{record.recordId,jdbcType=INTEGER}");
        sql.SET("bet_fruit_id = #{record.betFruitId,jdbcType=INTEGER}");
        sql.SET("bet_score = #{record.betScore,jdbcType=INTEGER}");
        sql.SET("bet_multiple = #{record.betMultiple,jdbcType=INTEGER}");
        sql.SET("bet_time = #{record.betTime,jdbcType=TIMESTAMP}");
        
        TMachineBetRecordExample example = (TMachineBetRecordExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_machine_bet_record
     *
     * @mbg.generated Sun Mar 26 16:59:34 CST 2017
     */
    public String updateByPrimaryKeySelective(TMachineBetRecord record) {
        SQL sql = new SQL();
        sql.UPDATE("t_machine_bet_record");
        
        if (record.getUserId() != null) {
            sql.SET("user_id = #{userId,jdbcType=VARCHAR}");
        }
        
        if (record.getRecordId() != null) {
            sql.SET("record_id = #{recordId,jdbcType=INTEGER}");
        }
        
        if (record.getBetFruitId() != null) {
            sql.SET("bet_fruit_id = #{betFruitId,jdbcType=INTEGER}");
        }
        
        if (record.getBetScore() != null) {
            sql.SET("bet_score = #{betScore,jdbcType=INTEGER}");
        }
        
        if (record.getBetMultiple() != null) {
            sql.SET("bet_multiple = #{betMultiple,jdbcType=INTEGER}");
        }
        
        if (record.getBetTime() != null) {
            sql.SET("bet_time = #{betTime,jdbcType=TIMESTAMP}");
        }
        
        sql.WHERE("id = #{id,jdbcType=INTEGER}");
        
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_machine_bet_record
     *
     * @mbg.generated Sun Mar 26 16:59:34 CST 2017
     */
    protected void applyWhere(SQL sql, TMachineBetRecordExample example, boolean includeExamplePhrase) {
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
                            sb.append(String.format(parmPhrase1_th, criterion.getCondition(), i, j,criterion.getTypeHandler()));
                        }
                    } else if (criterion.isBetweenValue()) {
                        if (criterion.getTypeHandler() == null) {
                            sb.append(String.format(parmPhrase2, criterion.getCondition(), i, j, i, j));
                        } else {
                            sb.append(String.format(parmPhrase2_th, criterion.getCondition(), i, j, criterion.getTypeHandler(), i, j, criterion.getTypeHandler()));
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