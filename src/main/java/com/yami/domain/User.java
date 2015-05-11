package com.yami.domain;

import com.yami.annotation.PrimaryKey;

public class User extends BaseDomain {
	
	private static final long serialVersionUID = 1L;

	@PrimaryKey
	private int userId;
	
	private String userName;
	
	private String password;
	
	private int firstPay = 0;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getFirstPay() {
		return firstPay;
	}

	public void setFirstPay(int firstPay) {
		this.firstPay = firstPay;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}
}
