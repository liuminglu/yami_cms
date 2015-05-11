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
	
	@Override
	public Integer getUserCount() {
		return userMapper.getUserCount();
	}

	@Override
	public User getUserByUserId(String userId) {
		Assert.notNull(userId, "userId can't be null");
		return userMapper.getUserByUserId(userId);
	}
	
	@Override
	public int insertUser(User user) {
		Assert.notNull(user, "param can't be null : user");
		try {
			userMapper.insertUser(user);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return user.getUserId();
	}


}
