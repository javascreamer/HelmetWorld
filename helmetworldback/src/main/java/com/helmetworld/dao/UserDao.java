package com.helmetworld.dao;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.helmetworldback.model.Users;

@ComponentScan("com")
@Repository
public interface UserDao {
	boolean addUser(Users user);

}
