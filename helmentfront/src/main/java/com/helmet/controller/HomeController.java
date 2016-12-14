package com.helmet.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.helmetworld.dao.UserDao;
import com.helmetworldback.model.Users;

@Controller
public class HomeController {
	@Autowired
	UserDao userDao;
	@RequestMapping("/")
	public String index()
	{
		System.out.println("index called");
		return "index";
	}
	@RequestMapping("/register")
	public String register(@RequestParam("username") String username,@RequestParam("password") String password)
	{
		System.out.println("inside register");
		Users user=new Users();
		user.setUsername(username);
		user.setPassword(password);
		userDao.addUser(user);
		return "index";
	}
}
