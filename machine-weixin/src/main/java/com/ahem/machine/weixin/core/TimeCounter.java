package com.ahem.machine.weixin.core;

import java.io.Serializable;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ahem.machine.weixin.entity.TMachineRecord;
import com.ahem.machine.weixin.mapper.TMachineBetRecordMapper;
import com.alibaba.fastjson.annotation.JSONField;

/**
 * <p>
 * Title: TimeCounter.java
 * </p>
 * <p>
 * Description: 时间倒计时器
 * </p>
 * 
 * @author ahem
 * @date 2017年3月20日
 * @version
 */
@Component
public class TimeCounter implements Serializable {
	/** serialVersionUID */
	private static final long serialVersionUID = 1L;

	private Logger logger = LoggerFactory.getLogger(TimeCounter.class);

	@Autowired
	TMachineBetRecordMapper recordMapper;

	// 期号
	private volatile int recordId = 0;
	// 分钟
	private volatile int minute = 0;
	// 秒
	private volatile int second = 0;

	public TimeCounter() {
		// 初始化时间计数器
		set(0, 0, 40);
		logger.info("时间计数器初始化成功！");
	}

	/**
	 * 计数
	 */
	public void count() {
		if (second > 0) {
			second--;
		} else if (second == 0 && minute > 0) {
			minute--;
			second = 60;
			second--;
		}

		// 距离开奖30秒，生成开奖结果,重置时间和期号
		if (minute == 0 && second == 30) {
			// TODO 期号从数据库获取，时间从配置表获取
			set(recordId++, 1, 0);
		}
		// logger.debug(this.toString());
	}

	/**
	 * 设置时间计时器，
	 * 
	 * @param recordId
	 * @param minute
	 * @param second
	 */
	synchronized public void set(int recordId, int minute, int second) {
		this.recordId = recordId;
		this.minute = minute;
		this.second = second;
	}

	/**
	 * 获取当前时间
	 */
	@JSONField(serialize = false)
	public String getTime() {
		return numberCover(minute) + ":" + numberCover(second);
	}

	/**
	 * 初始化时间计数器
	 */
	public String toString() {
		return "期号" + recordId + ":" + numberCover(minute) + ":" + numberCover(second);
	}

	/**
	 * 数字补位：小于10时十位数补0
	 * 
	 * @param num
	 * @return
	 */
	private String numberCover(int num) {
		if (num < 10) {
			return "0" + num;
		} else {
			return num + "";
		}
	}

	public int getRecordId() {
		return recordId;
	}

	public void setRecordId(int recordId) {
		this.recordId = recordId;
	}

	public int getMinute() {
		return minute;
	}

	public void setMinute(int minute) {
		this.minute = minute;
	}

	public int getSecond() {
		return second;
	}

	public void setSecond(int second) {
		this.second = second;
	}

}
