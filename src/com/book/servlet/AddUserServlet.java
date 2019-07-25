package com.book.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.imageio.spi.RegisterableService;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.book.entity.User;
import com.book.serviceImpl.UserServiceImpl;

/**
 * Servlet implementation class AddUserServlet
 */
public class AddUserServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String name=request.getParameter("name");
		String pwd=request.getParameter("pwd");
		User user=new User(name,pwd);
		UserServiceImpl service=new UserServiceImpl();
		PrintWriter out=response.getWriter();
		boolean result=service.addUser(user);
		if(result) {
			response.sendRedirect("login.jsp");
		}else {
			//out.print("×¢²áÊ§°Ü");
			response.sendRedirect("error.jsp");
		}
			
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
