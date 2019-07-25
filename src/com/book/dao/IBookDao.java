package com.book.dao;

import java.util.List;

import com.book.entity.Book;

public interface IBookDao {
	
	public boolean addBook(Book book);
	
	public boolean deleteBook(int bno);
	
	public boolean updateBook(int bno,Book book);
	
	public Book queryBookByBno(int bno);
	
	public List<Book> queryAllBook();
}
