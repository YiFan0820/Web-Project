package com.book.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.book.service.IBookService;
import com.book.serviceImpl.BookServiceImpl;
public class DeleteBookServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		int bno=Integer.parseInt(request.getParameter("bno"));
		IBookService service=new BookServiceImpl();
		boolean result=service.deleteBook(bno);
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
