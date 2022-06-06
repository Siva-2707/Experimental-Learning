<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student DB</title>
</head>
<body>
	<h3>Create new user</h3>
	<form >
		First name: <input name ="first_name" type="text">
		Last name: <input name ="last_name" type="text">
		Email: <input name ="email" type="text">
		<input name="Create" type="submit">
	</form>
	<hr>
	<h3>Existing users</h3>
	
	<c:forEach var="">
	</c:forEach>
</body>
</html>