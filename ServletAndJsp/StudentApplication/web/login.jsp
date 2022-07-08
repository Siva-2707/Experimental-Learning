<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
</head>
<body>

	<form action="ProcessLoginServlet" method="get">
	<%
		if(request.getAttribute("loginValidation") != null && (boolean) request.getAttribute("loginValidation") == false){
			out.print("<h3>Invalid username or password</h3> <br>");
			
		}
	%>
	User name: <input name="username" type="text">
	Password: <input name="password" type="password">
	<input name="Login" type="submit">
	
	</form>
</body>
</html>