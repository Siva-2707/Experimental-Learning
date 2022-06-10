<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page import="com.siva.studentApp.beans.Student, java.util.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link type="text/css" rel="stylesheet" href="css/StudentApplication.css">
<title>Student DB</title>
</head>
<body>
	<div id="header">
		<h3>Student Database</h3>
		<input id ="logoutButton" value="Logout" type="button">
	</div>
	<div class="container">
		<h3>Create new student</h3>
		<div id="createStudent">
			<input id="addStudentButton" value="Add Student" type= "button" onclick="getElementById('studentForm').style.visibility='visible'"  />
			<form id = "studentForm" action="StudentControllerServlet" method="get"  >
				First name: <input name="first_name" type="text"> 
				Last name:<input name="last_name" type="text"> 
				Email: <input name="email" type="text"> 
				<input name ="operation" value="ADD" type="submit">
			</form>
		</div>
	</div>
	<hr>
	<div class="wrapper">
		<div id="content">
			<h3>Existing Students</h3>
			<table border="1">
				<tr>
					<th>ID</th>
					<th>First Name</th>
					<th>Last Name</th>
					<th>Email</th>
					<th>Action</th>
				</tr>
				<c:forEach var="student" items="${studentList}">
					<tr>
						<td>${student.rollNumber}</td>
						<td>${student.firstName}</td>
						<td>${student.lastName}</td>
						<td>${student.email}</td>
						<td><a href="#">Update</a></td>
					</tr>
				</c:forEach>
			</table>
		</div>
	</div>
</body>
</html>