package com.yami.test.user;


import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.yami.domain.User;
import com.yami.service.UserService;

public class UserServiceImplTest {
	
	private static UserService userService;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-config/spring-*.xml");
		userService = (UserService) context.getBean("userService");
	}
	


}
