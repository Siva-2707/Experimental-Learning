<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Processed Data</title>
</head>
<body>

<pre>
	${param.firstName} ${param.lastName} is a ${param.gender} from ${param.continent}
	Interested in :
	<ul>
	<%
	String interests[] = request.getParameterValues("intrest");
	if(interests != null){
		for(String interest : interests)
			out.println("<li>"+interest+"</li>");
	}
	%>
	</ul>
</pre>
</body>
</html>