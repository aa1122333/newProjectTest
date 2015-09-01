package com.SpringTest.dao;

import com.SpringTest.model.User;

public interface UserDao {
	public boolean addUser(User user);
	public boolean deleteUser(User user);
	public boolean editUser(User user);
	public boolean searchUser(User user);
}
