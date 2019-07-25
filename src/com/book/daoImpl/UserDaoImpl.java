package com.book.daoImpl;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.book.entity.User;
import com.book.util.DBUtil;
import com.sun.corba.se.spi.orbutil.fsm.Guard.Result;
import com.sun.org.apache.bcel.internal.generic.RETURN;

public class UserDaoImpl {
	public boolean queryUser(User user ) {
		String sql="select * from jsplogin where name=? and pwd=?";
		Object []params= {user.getName(),user.getPwd()};
		ResultSet rs=DBUtil.queryAllBook(sql, params);
		try {
			if(rs.next()) {
				String name=rs.getString(1);
				String pwd=rs.getString(2);
				String name1=user.getName();
				String pwd1=user.getPwd();
				boolean flag1=false;
				boolean flag2=false;
				if(name.equals(name1))			//因为name和name1指向的是不同的对象，故用==好判断结果一定为false
					flag1=true;
				if(pwd.equals(pwd1))
					flag2=true;
				if(flag1&&flag2) 
				{
					return true;
				}
			}
			return false;						//查询没有此人则返回false;
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
	}
	
	public boolean addUser(User user) {
		String msg="select * from jsplogin where name=?";
		Object []arr= {user.getName()};
		ResultSet rs= DBUtil.queryAllBook(msg, arr);
		try {
			while(rs.next()) {
				String name=rs.getString(1);
				if(name.equals(user.getName())) {
					return false;
				}
			}
			String sql="insert into jsplogin values(?,?)";
			Object []params= {user.getName(),user.getPwd()};
			return DBUtil.addBook(sql, params);
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
		
	}
}
