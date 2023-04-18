<%@page import="model.Article"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insérer un article</title>

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
    
<div class="container m-2">
	
	<div class="card shadow p-3 mb-5 bg-white rounded" style="width: 50%;">
		<h2 class="card-title">Find article by marque</h2>
		<form action="Findbymarque" method="post">
		  <div class="form-group">
		    <label for="marque">Marque</label>
		    <input type="text" class="form-control" id="marque" name="marque" aria-describedby="marque" placeholder="Enter marque">
		  </div>
		  <button type="submit" class="btn btn-primary">Submit</button>
		</form>
	</div>
	
	<div class="card shadow p-3 mb-5 bg-white rounded" style="width: 50%;">
		<h2 class="card-title">Insert new article</h2>
		<form action="Insert" method="post" style="margin: 2%">
		  <div class="form-group">
		    <label for="ref">Ref</label>
		    <input type="number" class="form-control" id="ref" name="ref" aria-describedby="ref" placeholder="Enter ref">
		  </div>
		  <div class="form-group">
		    <label for="marque">Marque</label>
		    <input type="text" class="form-control" id="marque" name="marque" placeholder="Enter marque">
		  </div>
		  <div class="form-group">
		    <label for="prix">Prix</label>
		    <input type="number" class="form-control" id="prix" name="prix" placeholder="Enter prix">
		  </div>
		  <div class="form-group">
		    <label for="couleur">Couleur</label>
		    <input type="text" class="form-control" id="couleur" name="couleur" placeholder="Enter couleur">
		  </div>
		  
		  <button type="submit" class="btn btn-primary">Submit</button>
		</form>
	</div>
</div>

</body>
</html>