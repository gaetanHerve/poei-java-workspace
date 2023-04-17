<%@page import="model.Article"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Articles to string</title>
</head>
<body>
<h1>Articles to string</h1>

<% ArrayList<Article> articles = (ArrayList<Article>)request.getAttribute("articles"); %>

<% for (Article a : articles ) {
		out.print(a);
		out.print("<br>");
	}
%>

</body>
</html>