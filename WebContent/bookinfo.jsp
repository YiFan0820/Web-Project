<%@page import="com.book.entity.Book"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		Book books=(Book)request.getAttribute("book");
	%>
	<form action="UpdateBookServlet">
		索书号：<input type="text" name="bno" value=<%=books.getBno() %> /><br>
		书名：    <input type="text" name="bname" value=<%=books.getBname() %> /><br>
		作者：    <input type="text" name="aname" value=<%=books.getAname() %> /><br>
		类型：    <input type="text" name="btype" value=<%=books.getBtype() %> /><br>
		<input type="submit" value="修改"/>
		<a href="QueryAllServlet">返回</a>
	</form>
	<!-- <a href="QueryAllServlet"/>返回 -->
</body>
</html>