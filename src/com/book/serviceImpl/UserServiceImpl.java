package com.book.serviceImpl;

import com.book.daoImpl.UserDaoImpl;
import com.book.entity.User;

public class UserServiceImpl {
	UserDaoImpl dao=new UserDaoImpl();
	//��ѯ�û��Ƿ����
	public boolean queryUser(User user) {
		return dao.queryUser(user);
	}
	public boolean addUser(User user) {
		return dao.addUser(user);
	}
}
