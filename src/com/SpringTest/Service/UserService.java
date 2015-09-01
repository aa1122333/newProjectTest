package com.SpringTest.Service;

import com.SpringTest.dao.UserDao;
import com.SpringTest.daoImpl.UserDaoImpl;
import com.SpringTest.model.User;

public class UserService {
	private UserDao userDao = new UserDaoImpl();
	
	public UserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	public void controllerCalltoAddaUser(User aUser){
		this.userDao.addUser(aUser);
	}
}
