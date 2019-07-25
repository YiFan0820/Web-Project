<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="AddBookServlet">
		索书号：<input type="text" name="bno"/><br>
		书名：    <input type="text" name="bname"/><br>
		作者：    <input type="text" name="aname"/><br>
		类型：    <input type="text" name="btype"/><br>
		<input type="submit" value="新增"/>
	</form>
	<a href="QueryAllServlet">返回</a>
	
	
</body>
</html>