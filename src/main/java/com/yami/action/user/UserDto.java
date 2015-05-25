package com.yami.action.user;

import com.yami.action.BaseDto;
import com.yami.domain.User;

public class UserDto extends BaseDto {

	private String username;
	private String password;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
