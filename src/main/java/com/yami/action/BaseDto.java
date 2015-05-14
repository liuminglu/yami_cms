package com.yami.action;

import java.io.Serializable;
import java.util.List;

public class BaseDto implements Serializable {

	private static final long serialVersionUID = 1L;
	private int id;
	private int page = 1;
	private int rows = 20;
	/**
	 * 用户Id
	 */
	private String userId;
	
	/**
	 * 用户名称
	 */
	private String userName;
	
	public String getUserId() {
		return userId;
	}
	
	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
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

}
