<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	JE SUIS PAGE1.JSP
	<form action="page2.jsp?tel=1234&adresse=Paris&pays=France" method="post">
	  NOM: <input type="text" name="nom"><br>
	  PRENOM: <input type="text" name="prenom"><br><br>
	  AGE: <input type="number" name="age"><br><br>
	  <input type="submit" value="Submit">
	</form>
	
</body>
</html>