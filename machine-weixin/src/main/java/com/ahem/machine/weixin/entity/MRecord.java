package com.ahem.machine.weixin.entity;

import java.util.Date;

public class MRecord {
	private Integer recordId;
	private String imgName;
	private String openTime;

	public MRecord(Integer recordId, String imgName, String openTime) {
		super();
		this.recordId = recordId;
		this.imgName = imgName;
		this.openTime = openTime;
	}

	public Integer getRecordId() {
		return recordId;
	}

	public void setRecordId(Integer recordId) {
		this.recordId = recordId;
	}

	public String getImgName() {
		return imgName;
	}

	public void setImgName(String imgName) {
		this.imgName = imgName;
	}

	public String getOpenTime() {
		return openTime;
	}

	public void setOpenTime(String openTime) {
		this.openTime = openTime;
	}

}
