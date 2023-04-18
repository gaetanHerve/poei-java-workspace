<%@page import="model.Personne"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Allo la Terre, ici page4</title>

<!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">

<!-- jQuery library -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.4/jquery.min.js"></script>

<!-- Latest compiled JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script> 
</head>
<body>
    
<div class="container">
  <h2>Récap Personne</h2>
  <table class="table table-striped">
    <thead>
      <tr>
      	<th>Id</th>
        <th>Nom</th>
        <th>Prénom</th>
        <th>Age</th>
      </tr>
    </thead>
    <tbody>
      <tr>
      	<td><c:out value="${personne.id}" /></td>
        <td><c:out value="${personne.nom}" /></td>
        <td><c:out value="${personne.prenom}" /></td>
        <td><c:out value="${personne.age}" /></td>       
      </tr>
    </tbody>
  </table>
</div>

</body>
</html>