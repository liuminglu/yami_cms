package com.yami.mapper;

import com.yami.domain.User;
import com.yami.domain.member.Manager;

public interface UserMapper {
    public User getUserById(long id);
    public void updateUserType(long id,int type);
    public Manager getManagerByName(String name);
    public void registerManager(Manager manager);
}
