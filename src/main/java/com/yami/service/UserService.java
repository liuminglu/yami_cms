package com.yami.service;

import com.yami.dto.User;

public interface UserService {
	
	Integer getUserCount();
	
	User getUserByUserId(String userId);
	
	int insertUser(User user);
}
