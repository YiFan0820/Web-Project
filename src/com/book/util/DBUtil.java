package com.book.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.book.entity.Book;

public class DBUtil {
	private static final String URL="jdbc:mysql://localhost:3306/login?useSSL=false&characterEncoding=utf-8";
	private static final String USERNAME="root";
	private static final String PWD="990414";
	
	public static Connection connection=null;
	public static PreparedStatement pstmt=null;
	public static ResultSet rs=null;
	
	public static Connection getConnection() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		connection = DriverManager.getConnection(URL,USERNAME,PWD);
		return connection;
	}
	
	public static PreparedStatement createPstmt(String sql,Object []params) throws ClassNotFoundException, SQLException {
		if(params==null) {
			pstmt=getConnection().prepareStatement(sql);
			return pstmt;
		}else {
			pstmt=getConnection().prepareStatement(sql);
			for(int i=0;i<params.length;i++) {
				pstmt.setObject(i+1, params[i]);
			}
			return pstmt;
		}
	}
//	public static void deleteBook(String bname,String sql) {
//		pstmt=getConnection().prepareStatement(sql);
//	}
	
	public static boolean addBook(String sql,Object []params) {
		try {
			pstmt=createPstmt(sql, params);
			int count=pstmt.executeUpdate();
			if(count>0) {
				return true;
			}else {
				return false;
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			return false;
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}catch(Exception e)
		{
			e.printStackTrace();
			return false;
		}finally {
			closeAll();
		}
	}
	
	//删除
	public static boolean deleteBook(String sql,Object []params) {
		try {
			pstmt=createPstmt(sql, params);
			int count=pstmt.executeUpdate();
			if(count>0) {
				return true;
			}else {
				return false;
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			return false;
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}catch(Exception e)
		{
			e.printStackTrace();
			return false;
		}finally {
			closeAll();
		}
	}
	public static boolean updateBook(String sql,Object []params) {
		try {
			pstmt=createPstmt(sql, params);
			int count=pstmt.executeUpdate();
			if(count>0) {
				return true;
			}else {
				return false;
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			return false;
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}catch(Exception e)
		{
			e.printStackTrace();
			return false;
		}finally {
			closeAll();
		}
	}
	
	public static ResultSet queryAllBook(String sql,Object []params) {
		try {
			pstmt=createPstmt(sql, params);
			rs=pstmt.executeQuery();
			return rs;
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			return null;
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}finally {
			//closeAll();
		}
	}
	//查询某一个信息
	public static ResultSet queryBookByBno(String sql,Object []params) {
		try {
			pstmt=createPstmt(sql, params);
			rs=pstmt.executeQuery();
			return rs;
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			return null;
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}catch(Exception e)
		{
			e.printStackTrace();
			return null;
		}finally {
		}
	}
	
	public static void closeAll() {
		if (rs != null)
			try {
				if (rs != null)
					rs.close();
				if (pstmt != null)
					pstmt.close();
				if (connection != null)
					connection.close();
			}catch (SQLException e) {
				e.printStackTrace();
			}catch (Exception e) {
				e.printStackTrace();
			}

	}
}
