<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>tp JSP1 page1</title>
</head>
<body>
SAISISSEZ UN ARTICLE :
	<form action="page2.jsp" method="post">
	  REF: <input type="text" name="ref"><br>
	  MARQUE: <input type="text" name="marque"><br><br>
	  PRIX: <input type="number" name="prix"><br><br>
	  <input type="submit" value="Submit">
	</form>
</body>
</html>