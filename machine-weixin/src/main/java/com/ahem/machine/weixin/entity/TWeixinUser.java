package com.ahem.machine.weixin.entity;

import java.util.Date;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table t_weixin_user
 *
 * @mbg.generated do_not_delete_during_merge Sun Mar 26 16:59:34 CST 2017
 */
public class TWeixinUser {

	/**
	 * Database Column Remarks: 微信用户的唯一标识 This field was generated by MyBatis Generator. This field corresponds to the database column t_weixin_user.open_id
	 * @mbg.generated  Wed Apr 05 14:47:31 CST 2017
	 */
	private String openId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column t_weixin_user.nickname
	 * @mbg.generated  Wed Apr 05 14:47:31 CST 2017
	 */
	private String nickname;
	/**
	 * Database Column Remarks: 最近一次登录时间 This field was generated by MyBatis Generator. This field corresponds to the database column t_weixin_user.login_time
	 * @mbg.generated  Wed Apr 05 14:47:31 CST 2017
	 */
	private Date loginTime;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column t_weixin_user.sex
	 * @mbg.generated  Wed Apr 05 14:47:31 CST 2017
	 */
	private Integer sex;
	/**
	 * Database Column Remarks: 用户个人资料填写的省份 This field was generated by MyBatis Generator. This field corresponds to the database column t_weixin_user.province
	 * @mbg.generated  Wed Apr 05 14:47:31 CST 2017
	 */
	private String province;
	/**
	 * Database Column Remarks: 普通用户个人资料填写的城市 This field was generated by MyBatis Generator. This field corresponds to the database column t_weixin_user.city
	 * @mbg.generated  Wed Apr 05 14:47:31 CST 2017
	 */
	private String city;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column t_weixin_user.country
	 * @mbg.generated  Wed Apr 05 14:47:31 CST 2017
	 */
	private String country;
	/**
	 * Database Column Remarks: 用户头像，最后一个数值代表正方形头像大小（有0、46、64、96、132数值可选，0代表640*640正方形头像），用户没有头像时该项为空。若用户更换头像，原有头像URL将失效。  This field was generated by MyBatis Generator. This field corresponds to the database column t_weixin_user.headimgurl
	 * @mbg.generated  Wed Apr 05 14:47:31 CST 2017
	 */
	private String headimgurl;
	/**
	 * Database Column Remarks: 用户特权信息，json 数组，如微信沃卡用户为（chinaunicom） This field was generated by MyBatis Generator. This field corresponds to the database column t_weixin_user.privilege
	 * @mbg.generated  Wed Apr 05 14:47:31 CST 2017
	 */
	private String privilege;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column t_weixin_user.open_id
	 * @return  the value of t_weixin_user.open_id
	 * @mbg.generated  Wed Apr 05 14:47:31 CST 2017
	 */
	public String getOpenId() {
		return openId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column t_weixin_user.open_id
	 * @param openId  the value for t_weixin_user.open_id
	 * @mbg.generated  Wed Apr 05 14:47:31 CST 2017
	 */
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column t_weixin_user.nickname
	 * @return  the value of t_weixin_user.nickname
	 * @mbg.generated  Wed Apr 05 14:47:31 CST 2017
	 */
	public String getNickname() {
		return nickname;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column t_weixin_user.nickname
	 * @param nickname  the value for t_weixin_user.nickname
	 * @mbg.generated  Wed Apr 05 14:47:31 CST 2017
	 */
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column t_weixin_user.login_time
	 * @return  the value of t_weixin_user.login_time
	 * @mbg.generated  Wed Apr 05 14:47:31 CST 2017
	 */
	public Date getLoginTime() {
		return loginTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column t_weixin_user.login_time
	 * @param loginTime  the value for t_weixin_user.login_time
	 * @mbg.generated  Wed Apr 05 14:47:31 CST 2017
	 */
	public void setLoginTime(Date loginTime) {
		this.loginTime = loginTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column t_weixin_user.sex
	 * @return  the value of t_weixin_user.sex
	 * @mbg.generated  Wed Apr 05 14:47:31 CST 2017
	 */
	public Integer getSex() {
		return sex;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column t_weixin_user.sex
	 * @param sex  the value for t_weixin_user.sex
	 * @mbg.generated  Wed Apr 05 14:47:31 CST 2017
	 */
	public void setSex(Integer sex) {
		this.sex = sex;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column t_weixin_user.province
	 * @return  the value of t_weixin_user.province
	 * @mbg.generated  Wed Apr 05 14:47:31 CST 2017
	 */
	public String getProvince() {
		return province;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column t_weixin_user.province
	 * @param province  the value for t_weixin_user.province
	 * @mbg.generated  Wed Apr 05 14:47:31 CST 2017
	 */
	public void setProvince(String province) {
		this.province = province;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column t_weixin_user.city
	 * @return  the value of t_weixin_user.city
	 * @mbg.generated  Wed Apr 05 14:47:31 CST 2017
	 */
	public String getCity() {
		return city;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column t_weixin_user.city
	 * @param city  the value for t_weixin_user.city
	 * @mbg.generated  Wed Apr 05 14:47:31 CST 2017
	 */
	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column t_weixin_user.country
	 * @return  the value of t_weixin_user.country
	 * @mbg.generated  Wed Apr 05 14:47:31 CST 2017
	 */
	public String getCountry() {
		return country;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column t_weixin_user.country
	 * @param country  the value for t_weixin_user.country
	 * @mbg.generated  Wed Apr 05 14:47:31 CST 2017
	 */
	public void setCountry(String country) {
		this.country = country;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column t_weixin_user.headimgurl
	 * @return  the value of t_weixin_user.headimgurl
	 * @mbg.generated  Wed Apr 05 14:47:31 CST 2017
	 */
	public String getHeadimgurl() {
		return headimgurl;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column t_weixin_user.headimgurl
	 * @param headimgurl  the value for t_weixin_user.headimgurl
	 * @mbg.generated  Wed Apr 05 14:47:31 CST 2017
	 */
	public void setHeadimgurl(String headimgurl) {
		this.headimgurl = headimgurl;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column t_weixin_user.privilege
	 * @return  the value of t_weixin_user.privilege
	 * @mbg.generated  Wed Apr 05 14:47:31 CST 2017
	 */
	public String getPrivilege() {
		return privilege;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column t_weixin_user.privilege
	 * @param privilege  the value for t_weixin_user.privilege
	 * @mbg.generated  Wed Apr 05 14:47:31 CST 2017
	 */
	public void setPrivilege(String privilege) {
		this.privilege = privilege;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_weixin_user
	 * @mbg.generated  Wed Apr 05 14:47:31 CST 2017
	 */
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(getClass().getSimpleName());
		sb.append(" [");
		sb.append("Hash = ").append(hashCode());
		sb.append(", openId=").append(openId);
		sb.append(", nickname=").append(nickname);
		sb.append(", loginTime=").append(loginTime);
		sb.append(", sex=").append(sex);
		sb.append(", province=").append(province);
		sb.append(", city=").append(city);
		sb.append(", country=").append(country);
		sb.append(", headimgurl=").append(headimgurl);
		sb.append(", privilege=").append(privilege);
		sb.append("]");
		return sb.toString();
	}
}