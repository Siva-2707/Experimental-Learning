<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.*"  %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>JSTL Function tags</title>
</head>
<body>
	<c:set var="name" value="Siva"/>
	Length of the string : <b>${name}</b>: ${fn:length(name)} <br>
	UpperCase of the string : <b>${name}</b>: ${fn:toUpperCase(name)}
	<br>LowerCase of the string : <b>${name}</b>: ${fn:toLowerCase(name)}
	<br>Does the string <b>(${name})</b> starts with :<b>S</b>: ${fn:startsWith(name,"S")}
	<br><br> Split function example: 

	<c:set var="cityString" value="Chennai,Mumbai,Delhi,Pondicherry,Vishagapatinam" />
	<c:set var="cityArray" value="${fn:split(cityString,',') }" />
	<c:forEach var="city" items="${cityArray}">
		<br>${city}
	</c:forEach>
	<br> <br> Join function example: 
	<c:set var= "jointString"  value="${fn:join(cityArray,'*') }"/>
	<br>${jointString}
</body>
</html>