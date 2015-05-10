package com.yami.action.user;

import com.yami.action.BaseAction;
import com.yami.dto.User;

public class UserAction extends BaseAction<UserModel> {

	private static final long serialVersionUID = 1L;
	
	public String login() {
		User user = model.getUser();
		System.out.println(user.getUserName());
		System.out.println(user.getPassword());
		System.out.println(model.getModelId());
		model.setUserName(user.getUserName());
		return "toWelcome";
	}

}
