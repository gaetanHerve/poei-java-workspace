<%@page import="model.Personne"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

PAGE 4 JSP

<%
	ArrayList<Personne> personnes =  (ArrayList<Personne>) application.getAttribute("personnes"); 
	out.print(personnes);
%>

</body>
</html>