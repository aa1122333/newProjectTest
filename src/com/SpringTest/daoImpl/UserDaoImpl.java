package com.SpringTest.daoImpl;

import java.io.Serializable;

import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate3.HibernateTemplate;

import com.SpringTest.dao.UserDao;
import com.SpringTest.model.User;

public class UserDaoImpl implements UserDao {
	private HibernateTemplate hibernateTemplate;
	
	public void setSessionFactory(SessionFactory sessionFactory){
		this.hibernateTemplate = new HibernateTemplate(sessionFactory);
	}

	@Override
	public boolean addUser(User user) {
		// TODO Auto-generated method stub
		
		Serializable i = hibernateTemplate.save(user);
		System.out.println(i);
		if(i.equals(0))
			return false;
		else 
			return true;
	}

	@Override
	public boolean deleteUser(User user) {
		// TODO Auto-generated method stub
		System.out.println("deleteUser");
		hibernateTemplate.delete(user);
		return false;
	}

	@Override
	public boolean editUser(User user) {
		// TODO Auto-generated method stub
		System.out.println("editUser");
		hibernateTemplate.update(user);
		return false;
	}

	@Override
	public User searchUser(int id) {
		// TODO Auto-generated method stub
		System.out.println("searchUser");
		User user = (User) hibernateTemplate.get(User.class, id);
		return user;
	}

}
