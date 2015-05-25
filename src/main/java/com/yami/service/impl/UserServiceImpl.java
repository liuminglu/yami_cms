package com.yami.service.impl;

import com.yami.domain.member.Manager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import com.yami.domain.User;
import com.yami.mapper.UserMapper;
import com.yami.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService {
	@Autowired
	private UserMapper userMapper;

	public UserMapper getUserMapper() {
		return userMapper;
	}

	public void setUserMapper(UserMapper userMapper) {
		this.userMapper = userMapper;
	}

	@Override
	public User getUserById(long id) {
		return userMapper.getUserById(id);
	}

	@Override
	public Manager getManagerByName(String username) {
		return userMapper.getManagerByName(username);
	}

	@Override
	public void updateUserType(long id, int type) {
		userMapper.updateUserType(id,type);
	}

	@Override
	public void registerManager(Manager manager) {
		userMapper.registerManager(manager);
	}




}
