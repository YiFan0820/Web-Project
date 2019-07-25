package com.book.serviceImpl;

import java.util.List;

import com.book.dao.IBookDao;
import com.book.daoImpl.BookDaoImpl;
import com.book.entity.Book;
import com.book.service.IBookService;

public class BookServiceImpl implements IBookService{
	IBookDao dao=new BookDaoImpl();
	@Override
	public boolean addBook(Book book) {
		return dao.addBook(book);
	}

	@Override
	public boolean deleteBook(int bno) {
		return dao.deleteBook(bno);
	}

	@Override
	public boolean updateBook(int bno,Book book) {
		return dao.updateBook(bno, book);
	}

	@Override
	public Book queryBookByBno(int bno) {
		return dao.queryBookByBno(bno);
	}

	@Override
	public List<Book> queryAllBook() {
		return dao.queryAllBook();
	}
	
}
