package com.helmetworldback.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.helmetworld.configuration.ApplicationConfig;
import com.helmetworld.dao.UserDao;
import com.helmetworldback.model.Users;

public class AppTest {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext annotationConfigApplicationContext=new AnnotationConfigApplicationContext();
		annotationConfigApplicationContext.register(ApplicationConfig.class);
		annotationConfigApplicationContext.refresh();
		UserDao user=(UserDao)annotationConfigApplicationContext.getBean("userDaoImpl");
		Users users=new Users();
		users.setUsername("dummy");
		users.setPassword("dummy");
		user.addUser(users);
	}

}
