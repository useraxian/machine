package com.ahem.machine.weixin.entity;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table t_machine_index
 *
 * @mbg.generated do_not_delete_during_merge Sun Mar 26 16:59:34 CST 2017
 */
public class TMachineIndex {
    /**
     * Database Column Remarks:
     *   位置编号
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_machine_index.id
     *
     * @mbg.generated Sun Mar 26 16:59:34 CST 2017
     */
    private Integer id;

    /**
     * Database Column Remarks:
     *   水果编号
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_machine_index.fruit_id
     *
     * @mbg.generated Sun Mar 26 16:59:34 CST 2017
     */
    private Integer fruitId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_machine_index.id
     *
     * @return the value of t_machine_index.id
     *
     * @mbg.generated Sun Mar 26 16:59:34 CST 2017
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_machine_index.id
     *
     * @param id the value for t_machine_index.id
     *
     * @mbg.generated Sun Mar 26 16:59:34 CST 2017
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_machine_index.fruit_id
     *
     * @return the value of t_machine_index.fruit_id
     *
     * @mbg.generated Sun Mar 26 16:59:34 CST 2017
     */
    public Integer getFruitId() {
        return fruitId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_machine_index.fruit_id
     *
     * @param fruitId the value for t_machine_index.fruit_id
     *
     * @mbg.generated Sun Mar 26 16:59:34 CST 2017
     */
    public void setFruitId(Integer fruitId) {
        this.fruitId = fruitId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_machine_index
     *
     * @mbg.generated Sun Mar 26 16:59:34 CST 2017
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", fruitId=").append(fruitId);
        sb.append("]");
        return sb.toString();
    }
}