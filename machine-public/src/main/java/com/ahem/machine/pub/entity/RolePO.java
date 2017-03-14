package com.ahem.machine.pub.entity;

import java.io.Serializable;

public class RolePO implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -7602945114069405924L;
	private Long id;
	private String name;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
