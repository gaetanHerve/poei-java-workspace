<%@page import="model.Article"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Tableau BS</title>

<!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">

<!-- jQuery library -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.4/jquery.min.js"></script>

<!-- Latest compiled JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script> 

</head>
<body>


<% 
	ArrayList<Article> articles = (ArrayList<Article>)request.getAttribute("articles"); 
%>

<div class="container">
  <h2>Articles Jstl</h2>
  <table class="table table-striped">
    <thead>
      <tr>
        <th>Ref</th>
        <th>Marque</th>
        <th>Prix</th>
        <th>Couleur</th>
        <th>Cher ?</th>
      </tr>
    </thead>
    <tbody>
    <c:forEach var="a" items="${requestScope.articles}">
      <tr>
    	<td><c:out value="${a.ref}" /></td>
        <td><c:out value="${a.marque}" /></td>
        <td><c:out value="${a.prix}" /></td>
        <td><c:out value="${a.couleur}" /></td>        
        <td><c:out value="${a.isCher() ? 'Oui' : 'Non' }" /></td>
      </tr>
     </c:forEach>
    </tbody>
  </table>
</div>

</body>
</html>