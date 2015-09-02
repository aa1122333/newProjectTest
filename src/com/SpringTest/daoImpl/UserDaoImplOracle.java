package com.SpringTest.daoImpl;

import com.SpringTest.dao.UserDao;
import com.SpringTest.model.User;

public class UserDaoImplOracle implements UserDao {

	@Override
	public boolean addUser(User user) {
		// TODO Auto-generated method stub
		System.out.println("addOracleUser");
		return false;
	}

	@Override
	public boolean deleteUser(User user) {
		// TODO Auto-generated method stub
		System.out.println("deleteOracleUser");
		return false;
	}

	@Override
	public boolean editUser(User user) {
		// TODO Auto-generated method stub
		System.out.println("editOracleUser");
		return false;
	}

	@Override
	public User searchUser(int id) {
		// TODO Auto-generated method stub
		System.out.println("searchOracleUser");
		return null;
	}

}
