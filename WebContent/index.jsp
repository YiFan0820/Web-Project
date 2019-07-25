<%@page import="java.util.List"%>
<%@page import="com.book.entity.Book"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>图书城</title>
</head>
<body background="night.jpg" style=" background-repeat:no-repeat ;background-size:100% 100%; background-attachment: fixed;" >
		<center>Welcome to our bookstore！</center>
		<table border="1px">
		<tr>
			<th>索书号</th>
			<th>书名</th>	
			<th>作者</th>
			<th>类型</th>
			<th>操作</th>
		</tr>
		<%
			List<Book> books=(List<Book>)request.getAttribute("All");
			for(Book book:books){
		%>
			<tr>
				<td><font color="white"><a href="QueryByBnoServlet?bno=<%=book.getBno()%>"/><%=book.getBno()%></font></td>
				<td><font color="white"><%=book.getBname() %></font></td>
				<td><font color="white"><%=book.getAname() %></font></td>
				<td><font color="white"><%=book.getBtype() %></font></td>
				<td><font color="white"><a href="DeleteBookServlet?bno=<%=book.getBno()%>"/>删除</font></td>
			</tr>
		<%
				
			}
			
		
		%>
		
		
		</table>
		<br>
		<form action="add.jsp">
				<input type="submit" value="新增"/>
		</form>
</body>
</html>