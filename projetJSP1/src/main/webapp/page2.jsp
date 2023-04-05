<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	JE SUIS PAGE2.JSP
	<br>
	
	<% // scriptlet
	String nom = request.getParameter("nom");
	String prenom = request.getParameter("prenom");
	String age = request.getParameter("age");
	String tel = request.getParameter("tel");
	String adresse = request.getParameter("adresse");
	String pays = request.getParameter("pays");
	
	String reponse = nom + " " + prenom + " " + age + " " + tel + " " + adresse + " " + pays;
	out.print(reponse);
	%>
</body>
</html>