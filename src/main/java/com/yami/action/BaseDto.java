package com.yami.action;

import java.io.Serializable;

public class BaseDto implements Serializable {

	private static final long serialVersionUID = 1L;
	
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
	
}
