<%@page import="model.Article"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Recap</title>

 <!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css">

<!-- jQuery library -->
<script src="https://cdn.jsdelivr.net/npm/jquery@3.6.4/dist/jquery.slim.min.js"></script>

<!-- Popper JS -->
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>

<!-- Latest compiled JavaScript -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.bundle.min.js"></script>  
</head>
<body>
    
<div class="container">
  <div class="card shadow p-3 mb-5 bg-white rounded" style="width: 75%;">
  	<h2 class="card-title">Recap</h2>
	  <table class="table table-striped">
	    <thead class="thead-dark">
	      <tr>
	      	<th>Ref</th>
	        <th>Marque</th>
	        <th>Prix</th>
	        <th>Couleur</th>
	        <th>Cher ?</th>
	      </tr>
	    </thead>
	    <tbody>
	    <c:forEach var="article" items="${requestScope.articles}">
	      <tr>
	      	<td><c:out value="${article.ref}" /></td>
	        <td><c:out value="${article.marque}" /></td>
	        <td><c:out value="${article.prix}" /></td>
	        <td><c:out value="${article.couleur}" /></td>
	        <td><c:out value="${article.isCher() ? 'Cher' : 'Pas cher'}" /></td>       
	      </tr>
	     </c:forEach>
	    </tbody>
	  </table>
  </div>
</div>

</body>
</html>