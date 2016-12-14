package com.helmetworld.dao;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.helmetworldback.model.Users;


@Repository("userDaoImpl")
@Transactional
public class UserDaoImpl implements UserDao {

	@Autowired
	private SessionFactory sessionFactory;
	public boolean addUser(Users user) {
		boolean check=false;
		Session session=sessionFactory.getCurrentSession();
		Integer i=(Integer)session.save(user);
		if(i==1)
			check=true;
		else
			check=false;	
		return check;
	}

}
