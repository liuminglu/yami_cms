package com.yami.action.user;

import com.yami.action.BaseDto;
import com.yami.domain.User;

public class UserDto extends BaseDto {

	private static final long serialVersionUID = 1L;

	private User user;
	
	private String modelId;

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getModelId() {
		return modelId;
	}

	public void setModelId(String modelId) {
		this.modelId = modelId;
	}
	
}
