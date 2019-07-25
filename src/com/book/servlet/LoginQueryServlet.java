package com.book.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.book.entity.User;
import com.book.serviceImpl.UserServiceImpl;

public class LoginQueryServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String name=request.getParameter("name");
		String pwd=request.getParameter("pwd");
		User user=new User(name,pwd);
		UserServiceImpl service=new UserServiceImpl();
		PrintWriter out=response.getWriter();
		boolean result=service.queryUser(user);
		if(result) {
			response.sendRedirect("QueryAllServlet");
		}else {
			out.write("此用户不存在！请重新输入");
			//response.sendRedirect("login.jsp");
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
