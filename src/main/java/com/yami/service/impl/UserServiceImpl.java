package com.yami.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import com.yami.domain.User;
import com.yami.mapper.UserMapper;
import com.yami.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService {

	private UserMapper userMapper;
	
	public void setUserMapper(UserMapper userMapper) {
		this.userMapper = userMapper;
	}
	
	public Integer getUserCount() {
		return userMapper.getUserCount();
	}

	public User getUserByUserId(String userId) {
		Assert.notNull(userId, "userId can't be null");
		return userMapper.getUserByUserId(userId);
	}
	
	public long insertUser(User user) {
		Assert.notNull(user, "param can't be null : user");
		try {
			userMapper.insertUser(user);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return user.getId();
	}


}
