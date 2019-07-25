package com.book.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.book.entity.Book;
import com.book.service.IBookService;
import com.book.serviceImpl.BookServiceImpl;

/**
 * Servlet implementation class QueryByBnoServlet
 */
public class QueryByBnoServlet extends HttpServlet {
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		int bno=Integer.parseInt(request.getParameter("bno"));
		IBookService service=new BookServiceImpl();
		Book book = service.queryBookByBno(bno);
		request.setAttribute("book", book);
		request.getRequestDispatcher("bookinfo.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
