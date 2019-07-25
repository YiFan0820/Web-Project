package com.book.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.book.entity.Book;
import com.book.service.IBookService;
import com.book.serviceImpl.BookServiceImpl;

public class UpdateBookServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		int bno=Integer.parseInt(request.getParameter("bno"));
		String bname=request.getParameter("bname");
		String aname=request.getParameter("aname");
		String btype=request.getParameter("btype");
		Book book=new Book(bno,bname,aname,btype);
		IBookService service=new BookServiceImpl();
		boolean result = service.updateBook(bno, book);
		if(result) {
			response.sendRedirect("QueryAllServlet");
		}else {
			response.sendRedirect("error.jsp");
		}
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
