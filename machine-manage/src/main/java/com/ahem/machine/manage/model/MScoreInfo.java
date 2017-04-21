package com.ahem.machine.manage.model;

/**
* <p>Title: MScoreInfo.java</p>
* <p>Description: 得分情况Model</p>
* @author ahem
* @date 2017年4月21日
* @version 
*/
public class MScoreInfo {
	private String fruitName;
	private int score;

	public MScoreInfo(String fruitName, int score) {
		super();
		this.fruitName = fruitName;
		this.score = score;
	}

	public String getFruitName() {
		return fruitName;
	}

	public void setFruitName(String fruitName) {
		this.fruitName = fruitName;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

}
