<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>page1</title>
</head>
<body>
	<h1>Page 2 JSP</h1>
	<% 
		String str = session.getAttribute("nom").toString();
		out.print(str);
	%>
</body>
</html>