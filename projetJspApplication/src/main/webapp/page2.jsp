<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
PAGE 2 JSP

<% String str = application.getAttribute("nom").toString();
	out.print(str);
%>
</body>
</html>