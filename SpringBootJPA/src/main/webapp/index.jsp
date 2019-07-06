<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<form action="addEmp">
		<input type="text" name="Id"> </br>
		<input type="text" name="Name"> </br>
		<input type="text" name="Tech"> </br>
		<input type="submit" name="Submit">
	</form>
	
	<form action="getByTech">
		<input type="text" name="tech"> </br>
		<input type="submit" name="Submit">
	</form>
</body>
</html>