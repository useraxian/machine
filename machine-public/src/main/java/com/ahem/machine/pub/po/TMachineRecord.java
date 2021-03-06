package com.ahem.machine.pub.po;

import java.util.Date;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table t_machine_record
 *
 * @mbg.generated do_not_delete_during_merge Wed Apr 19 09:59:47 CST 2017
 */
public class TMachineRecord {
    /**
     * Database Column Remarks:
     *   开奖编号
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_machine_record.id
     *
     * @mbg.generated Wed Apr 19 09:59:47 CST 2017
     */
    private Integer id;

    /**
     * Database Column Remarks:
     *   开奖时间
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_machine_record.open_time
     *
     * @mbg.generated Wed Apr 19 09:59:47 CST 2017
     */
    private Date openTime;

    /**
     * Database Column Remarks:
     *   开奖号码(对应位置表的编号)
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_machine_record.open_number
     *
     * @mbg.generated Wed Apr 19 09:59:47 CST 2017
     */
    private Integer openNumber;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_machine_record.id
     *
     * @return the value of t_machine_record.id
     *
     * @mbg.generated Wed Apr 19 09:59:47 CST 2017
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_machine_record.id
     *
     * @param id the value for t_machine_record.id
     *
     * @mbg.generated Wed Apr 19 09:59:47 CST 2017
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_machine_record.open_time
     *
     * @return the value of t_machine_record.open_time
     *
     * @mbg.generated Wed Apr 19 09:59:47 CST 2017
     */
    public Date getOpenTime() {
        return openTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_machine_record.open_time
     *
     * @param openTime the value for t_machine_record.open_time
     *
     * @mbg.generated Wed Apr 19 09:59:47 CST 2017
     */
    public void setOpenTime(Date openTime) {
        this.openTime = openTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_machine_record.open_number
     *
     * @return the value of t_machine_record.open_number
     *
     * @mbg.generated Wed Apr 19 09:59:47 CST 2017
     */
    public Integer getOpenNumber() {
        return openNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_machine_record.open_number
     *
     * @param openNumber the value for t_machine_record.open_number
     *
     * @mbg.generated Wed Apr 19 09:59:47 CST 2017
     */
    public void setOpenNumber(Integer openNumber) {
        this.openNumber = openNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_machine_record
     *
     * @mbg.generated Wed Apr 19 09:59:47 CST 2017
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", openTime=").append(openTime);
        sb.append(", openNumber=").append(openNumber);
        sb.append("]");
        return sb.toString();
    }
}