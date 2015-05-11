package com.yami.service;

import com.yami.domain.User;

public interface UserService {
	
	Integer getUserCount();
	
	User getUserByUserId(String userId);
	
	int insertUser(User user);
}
