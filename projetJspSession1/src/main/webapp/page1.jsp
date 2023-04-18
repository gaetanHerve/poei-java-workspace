<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>page1</title>
</head>
<body>
	<h1>Page 1 JSP</h1>
	<%= session.getAttribute("nom") %>
	<hr>
	<%= session.getId() %>
</body>
</html>