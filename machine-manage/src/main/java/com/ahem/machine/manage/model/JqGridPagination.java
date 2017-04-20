package com.ahem.machine.manage.model;

import java.util.List;

/**
* <p>Title: JqGridPagination.java</p>
* <p>Description: JqGrid分页对象</p>
* @author ahem
* @date 2017年4月19日
* @version 
*/
public class JqGridPagination {
	private int page;
	private int total;
	private int records;
	private List<Object> rows;

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public int getRecords() {
		return records;
	}

	public void setRecords(int records) {
		this.records = records;
	}

	public List<Object> getRows() {
		return rows;
	}

	public void setRows(List<Object> rows) {
		this.rows = rows;
	}

}
