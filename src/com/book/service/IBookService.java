package com.book.service;

import java.util.List;

import com.book.entity.Book;

public interface IBookService {
	
	public boolean addBook(Book book);
	
	public boolean deleteBook(int bno);
	
	public boolean updateBook(int bno,Book book);
	
	public Book queryBookByBno(int bno);
	
	public List<Book> queryAllBook();
}
