package com.ahem.machine.pub.po;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table t_machine_fruit
 *
 * @mbg.generated do_not_delete_during_merge Wed Apr 19 09:59:47 CST 2017
 */
public class TMachineFruit {

	/**
	 * Database Column Remarks: 水果编号 This field was generated by MyBatis Generator. This field corresponds to the database column t_machine_fruit.id
	 * @mbg.generated  Wed Apr 19 09:59:47 CST 2017
	 */
	private Integer id;
	/**
	 * Database Column Remarks: 英文名称 This field was generated by MyBatis Generator. This field corresponds to the database column t_machine_fruit.en_name
	 * @mbg.generated  Wed Apr 19 09:59:47 CST 2017
	 */
	private String enName;
	/**
	 * Database Column Remarks: 中文名称 This field was generated by MyBatis Generator. This field corresponds to the database column t_machine_fruit.cn_name
	 * @mbg.generated  Wed Apr 19 09:59:47 CST 2017
	 */
	private String cnName;
	/**
	 * Database Column Remarks: 图标名称 This field was generated by MyBatis Generator. This field corresponds to the database column t_machine_fruit.image_name
	 * @mbg.generated  Wed Apr 19 09:59:47 CST 2017
	 */
	private String imageName;
	/**
	 * Database Column Remarks: 按钮名称 This field was generated by MyBatis Generator. This field corresponds to the database column t_machine_fruit.button_name
	 * @mbg.generated  Wed Apr 19 09:59:47 CST 2017
	 */
	private String buttonName;
	/**
	 * Database Column Remarks: 水果倍数 This field was generated by MyBatis Generator. This field corresponds to the database column t_machine_fruit.fruit_multiple
	 * @mbg.generated  Wed Apr 19 09:59:47 CST 2017
	 */
	private Integer fruitMultiple;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column t_machine_fruit.id
	 * @return  the value of t_machine_fruit.id
	 * @mbg.generated  Wed Apr 19 09:59:47 CST 2017
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column t_machine_fruit.id
	 * @param id  the value for t_machine_fruit.id
	 * @mbg.generated  Wed Apr 19 09:59:47 CST 2017
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column t_machine_fruit.en_name
	 * @return  the value of t_machine_fruit.en_name
	 * @mbg.generated  Wed Apr 19 09:59:47 CST 2017
	 */
	public String getEnName() {
		return enName;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column t_machine_fruit.en_name
	 * @param enName  the value for t_machine_fruit.en_name
	 * @mbg.generated  Wed Apr 19 09:59:47 CST 2017
	 */
	public void setEnName(String enName) {
		this.enName = enName;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column t_machine_fruit.cn_name
	 * @return  the value of t_machine_fruit.cn_name
	 * @mbg.generated  Wed Apr 19 09:59:47 CST 2017
	 */
	public String getCnName() {
		return cnName;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column t_machine_fruit.cn_name
	 * @param cnName  the value for t_machine_fruit.cn_name
	 * @mbg.generated  Wed Apr 19 09:59:47 CST 2017
	 */
	public void setCnName(String cnName) {
		this.cnName = cnName;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column t_machine_fruit.image_name
	 * @return  the value of t_machine_fruit.image_name
	 * @mbg.generated  Wed Apr 19 09:59:47 CST 2017
	 */
	public String getImageName() {
		return imageName;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column t_machine_fruit.image_name
	 * @param imageName  the value for t_machine_fruit.image_name
	 * @mbg.generated  Wed Apr 19 09:59:47 CST 2017
	 */
	public void setImageName(String imageName) {
		this.imageName = imageName;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column t_machine_fruit.button_name
	 * @return  the value of t_machine_fruit.button_name
	 * @mbg.generated  Wed Apr 19 09:59:47 CST 2017
	 */
	public String getButtonName() {
		return buttonName;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column t_machine_fruit.button_name
	 * @param buttonName  the value for t_machine_fruit.button_name
	 * @mbg.generated  Wed Apr 19 09:59:47 CST 2017
	 */
	public void setButtonName(String buttonName) {
		this.buttonName = buttonName;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column t_machine_fruit.fruit_multiple
	 * @return  the value of t_machine_fruit.fruit_multiple
	 * @mbg.generated  Wed Apr 19 09:59:47 CST 2017
	 */
	public Integer getFruitMultiple() {
		return fruitMultiple;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column t_machine_fruit.fruit_multiple
	 * @param fruitMultiple  the value for t_machine_fruit.fruit_multiple
	 * @mbg.generated  Wed Apr 19 09:59:47 CST 2017
	 */
	public void setFruitMultiple(Integer fruitMultiple) {
		this.fruitMultiple = fruitMultiple;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_machine_fruit
	 * @mbg.generated  Wed Apr 19 09:59:47 CST 2017
	 */
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(getClass().getSimpleName());
		sb.append(" [");
		sb.append("Hash = ").append(hashCode());
		sb.append(", id=").append(id);
		sb.append(", enName=").append(enName);
		sb.append(", cnName=").append(cnName);
		sb.append(", imageName=").append(imageName);
		sb.append(", buttonName=").append(buttonName);
		sb.append(", fruitMultiple=").append(fruitMultiple);
		sb.append("]");
		return sb.toString();
	}
}