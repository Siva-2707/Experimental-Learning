<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page import="com.siva.webapp.pojos.Student , java.util.*" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>JSTL Core</title>
</head>
<body>
	<%
	String arr[] = {"Siva", "Shree"};
	pageContext.setAttribute("names", arr);
	%>
	For each<br>
	<c:forEach var="name" items="${names}">
		 ${name} <br>
	</c:forEach>
	
	<%
	List<Student> students = new ArrayList<>();
	students.add(new Student("Siva","Rajesh","935353245"));
	students.add(new Student("Vishnu","Ram","NA"));
	students.add(new Student("Jaya","Raj","NA"));
	pageContext.setAttribute("studs", students);
	%>
	<br>For each with objects and put into a table<br>
	<table border="1">
	<tr>
		<th>First Name</th>
		<th>Last Name</th>
		<th>Contact</th>
	</tr>
	<c:forEach var="student" items="${studs}">
		<tr>
			<td>${student.firstName}</td>
			<td>${student.lastName}</td>
			<c:choose>
				<c:when test="${student.contact == 'NA'}">
				 	<td>Data not available</td>
				</c:when>
				<c:otherwise>
					<td>${student.contact}</td>
				</c:otherwise>
			</c:choose>
			<c:if test="${student.contact == 'NA'}">
				<td>If check example</td>
			</c:if>
			
			
		</tr>
	</c:forEach>
	</table>
</body>
</html>