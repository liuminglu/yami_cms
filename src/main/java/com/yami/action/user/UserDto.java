package com.yami.action.user;

import com.yami.action.BaseModel;
import com.yami.dto.User;

public class UserModel extends BaseModel {

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
