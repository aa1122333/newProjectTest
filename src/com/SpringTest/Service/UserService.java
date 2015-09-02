package com.SpringTest.Service;

import com.SpringTest.dao.UserDao;
import com.SpringTest.daoImpl.UserDaoImpl;
import com.SpringTest.model.User;

public class UserService {
	private UserDao userDao ;// initial by Spring
	
	public UserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	public boolean controllerCalltoAddaUser(User aUser){
		return this.userDao.addUser(aUser);
	}
}
