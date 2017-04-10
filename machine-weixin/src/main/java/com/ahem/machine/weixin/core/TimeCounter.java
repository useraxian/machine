package com.ahem.machine.weixin.core;

import java.io.Serializable;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.socket.TextMessage;

import com.ahem.machine.weixin.entity.TMachineBetRecord;
import com.ahem.machine.weixin.entity.TMachineRecord;
import com.ahem.machine.weixin.service.RecordService;
import com.ahem.machine.weixin.service.UserScoreService;
import com.ahem.machine.weixin.websocket.MessageType;
import com.ahem.machine.weixin.websocket.SysWebSocketHandler;
import com.ahem.machine.weixin.websocket.WebMessage;
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

	// 期号
	private volatile int recordId = 0;
	// 分钟
	private volatile int minute = 0;
	// 秒
	private volatile int second = 0;

	private RecordService recordService;
	private UserScoreService userScoreService;

	public TimeCounter(RecordService recordService, UserScoreService userScoreService) {
		// 初始化时间计数器
		this.recordService = recordService;
		this.userScoreService = userScoreService;

		// 获取开奖期号
		Integer id = this.recordService.findOpeningId();

		set(id, 1, 0);
		logger.info("时间计数器初始化成功！[recordId=" + id + ",minute=" + minute + ",second=" + second + "]");
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

		// 距离开奖20秒
		if (minute == 0 && second == 20) {
			open();
		}

		if (minute == 0 && second == 0) {
			// 期号从数据库获取，时间从配置表获取
			this.recordId = recordService.readyNext();
			logger.debug("下一期号：" + this.recordId);
			set(this.recordId, 1, 0);
		}
		// logger.debug(this.toString());
	}

	/**
	 * 生成开奖结果,重置时间和期号
	 */
	private void open() {
		try {
			logger.debug("到达开奖前20秒，准备生成开奖记录！期号：" + this.recordId);
			// 生成开奖记录
			TMachineRecord openRecord = recordService.generateRecord(this.recordId);
			logger.debug("已生成，开奖记录：" + openRecord);

			// 计算用户得分
			userScoreService.countUsersScore(openRecord.getId());

			// 群发开奖记录
			WebMessage message = new WebMessage(MessageType.openRecord, openRecord);
			TextMessage textMessage = new TextMessage(message.toJsonString());
			SysWebSocketHandler.broadcast(textMessage);
			logger.debug("结束群发开奖记录：" + openRecord);

			// 发送用户各自得分情况
			List<TMachineBetRecord> records = userScoreService.findGotScore(recordId);
			
			for (TMachineBetRecord record : records) {
				record.getBetResult();
//				record
			}
		} catch (Exception e) {
			
			logger.error("开奖异常！", e);
			// TODO 发生异常，进行手动开奖
		}
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
