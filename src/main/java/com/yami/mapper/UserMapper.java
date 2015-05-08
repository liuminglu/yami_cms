package com.yami.mapper;

import com.yami.dto.User;


public interface UserMapper {

	Integer getUserCount();
	
	User getUserByUserId(String userId);
	
	int insertUser(User user);
	
}
