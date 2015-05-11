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
	
	@Test
	public void saveUser() {
		User user = new User();
		user.setUserName("liuminglu");
		user.setPassword("000000");
		System.out.println(userService.insertUser(user));
	}
	
	@Test
	public void getUserByUserId() {
		System.out.println(userService.getUserByUserId("1").getUserName());
	}
	
	@Test
	public void countAll() {
		System.out.println(userService.getUserCount());
	}


}
