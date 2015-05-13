package com.yami.mapper;

import com.yami.domain.User;


public interface UserMapper {

	Integer getUserCount();
	
	User getUserByUserId(String userId);
	
	int insertUser(User user);
	
}
