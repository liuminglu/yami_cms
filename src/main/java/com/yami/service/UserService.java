package com.yami.service;

import com.yami.domain.User;
import com.yami.domain.member.Manager;

public interface UserService {
	public User getUserById(long id);
	public Manager getManagerByName(String username);
    public void updateUserType(long id,int type);
    public void registerManager(Manager manager);
}
