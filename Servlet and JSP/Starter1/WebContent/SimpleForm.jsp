<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<jsp:include page="Header.html"/>
	<pre>
	<form action="processForm.jsp">
		First Name: <input name="firstName" type="text"/><br>
		<br>
		Last Name: <input name="lastName" type="text"/><br>
		<br>
		Gender: Male<input name = "gender" type="radio" value= "Male" > Female<input name ="gender" type ="radio" value= "Female"> <br>
		Continent: <select name = "continent">
			<option>Asia</option>
			<option>Africa</option>
			<option>Europe</option>
			<option>North America</option>
			<option>South America</option>
			<option>Australia</option>
			<option>Antarctica</option>
		</select>
		 <br>
		Interested In:
		<input name = "intrest" type="checkbox" value= "Sports" >Sports 
		<input name = "intrest" type="checkbox" value= "Books" >Books 
		<input name = "intrest" type="checkbox" value= "Games" >Games
		<br>
		 
		
		<input type ="submit" name ="Submit" />
	</form>
	</pre>
	<jsp:include page="Footer.html"/>
	
</body>
</html>