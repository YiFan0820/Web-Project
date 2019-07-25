package com.book.serviceImpl;

import com.book.daoImpl.UserDaoImpl;
import com.book.entity.User;

public class UserServiceImpl {
	UserDaoImpl dao=new UserDaoImpl();
	//查询用户是否存在
	public boolean queryUser(User user) {
		return dao.queryUser(user);
	}
	public boolean addUser(User user) {
		return dao.addUser(user);
	}
}
