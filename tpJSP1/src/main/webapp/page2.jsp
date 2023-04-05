<%@ page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>tp JSP1 page2</title>
</head>
<body>
	RECAP ARTICLE :
	<br>
	
	<h3>Version avec concatenation</h3>
	<%
	String ref = request.getParameter("ref");
	String marque = request.getParameter("marque");
	String prix = request.getParameter("prix");
	
	ArrayList<String> arr = new ArrayList<String>();
	
	String responseUl = "<ul>";
	responseUl += "<li>" + ref.toLowerCase() + "</li>";
	responseUl += "<li>" + marque.toUpperCase() + "</li>";
	responseUl += "<li>" + prix +"€" + "</li>";
	responseUl += "<li>" + (Integer.parseInt(prix) > 100 ? "cher" : "pas cher") + "</li>";
	responseUl += "</ul>";
	out.print(responseUl);
	%>

	<h3>Version avec variables intégrées</h3>
	<ul>
		<li><%=ref.toLowerCase() %></li>
		<li><%=marque.toUpperCase() %></li>
		<li><%=prix + "€" %></li>
		<li><%=(Integer.parseInt(prix) > 100 ? "cher" : "pas cher")%></li>
	</ul>
	
</body>
</html>