package com.yami.action;

import java.io.Serializable;
import java.util.List;

public class BaseDto implements Serializable {

	private static final long serialVersionUID = 1L;
	private long id;
	private int page = 1;
	private int rows = 20;
	private int from;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}

	public int getRows() {
		return rows;
	}

	public void setRows(int rows) {
		this.rows = rows;
	}

	public int getFrom() {
		return (page-1)*rows;
	}

	public void setFrom(int from) {
		this.from = from;
	}
}
