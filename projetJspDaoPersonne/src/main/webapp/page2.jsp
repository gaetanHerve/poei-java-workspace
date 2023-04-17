<%@page import="model.Personne"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Allo la Terre, ici page2</title>
</head>
<body>
<h1>TEST</h1>

<% 
	String reponse = "";
	ArrayList<Personne> personnes = (ArrayList<Personne>)request.getAttribute("personnes"); 

	for (Personne p : personnes) {
		reponse += p.getNom() + " " + p.getPrenom() + "<br>";
	}
	out.print(reponse);

%>

</body>
</html>