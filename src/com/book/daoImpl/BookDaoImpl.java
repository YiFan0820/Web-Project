package com.book.daoImpl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.book.dao.IBookDao;
import com.book.entity.Book;
import com.book.util.DBUtil;

public class BookDaoImpl implements IBookDao{

	@Override
	public boolean addBook(Book book) {
		//String sql="insert into bookstore values("+1056+"New"+"Tom"+"text"+")";
		
	//+"("+book.getBno()+","+book.getBname()+","+book.getAname()+","+book.getBtype()+")";
		String sql="insert into bookstore values(?,?,?,?)";
		Object []params= {book.getBno(),book.getBname(),book.getAname(),book.getBtype()};
		return DBUtil.addBook(sql,params);
	}

	@Override
	public boolean deleteBook(int bno) {
		String sql="delete from bookstore where bno=?";
		Object []params= {bno};
		return DBUtil.deleteBook(sql, params);
	}

	@Override
	public boolean updateBook(int bno,Book book) {
		String sql="update bookstore set bno=?,bname=?,aname=?,btype=? where bno=?";
		Object []params= {book.getBno(),book.getBname(),book.getAname(),book.getBtype(),bno};
		return DBUtil.updateBook(sql, params);
	}

	@Override
	public Book queryBookByBno(int bno) {
		String sql="select * from bookstore where bno=?";
		Object []params= {bno};
		ResultSet rs=DBUtil.queryBookByBno(sql, params);
		Book book=null;
		try {
			if(rs.next()) {
				int no=rs.getInt(1);
				String name1=rs.getString(2);
				String name2=rs.getString(3);
				String type=rs.getString(4);
				book=new Book(no, name1, name2, type);
			}
			return book;
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}catch (Exception e) {
			e.printStackTrace();
			return null;
		}finally {
			DBUtil.closeAll();
		}
	}

	@Override
	public List<Book> queryAllBook() {
		List<Book> books=new ArrayList<>();
		String sql="select * from bookstore";
		ResultSet rs = DBUtil.queryAllBook(sql,null);
		try {
			while(rs.next()){
				int bno=rs.getInt(1);
				String bname=rs.getString(2);
				String aname=rs.getString(3);
				String btype=rs.getString(4);
				Book book=new Book(bno,bname,aname,btype);
				books.add(book);
			}
			return books;
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}catch(Exception e) {
			e.printStackTrace();
			return null;
		}finally {
			DBUtil.closeAll();
		}
	}

}
