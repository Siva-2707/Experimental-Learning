<%@page import="java.io.IOException"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.*"  %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<pre>
		<form action="todolist.jsp">
			Add new item: <input type = "text" name = "item">
			<input type= "submit" name = "Submit"> 
			<input type = "submit" name ="clearList" value="Clear List">
		</form> 
		<%
		Set<String> itemList = (Set<String>) session.getAttribute("myToDoList");
		
		if(itemList == null){
			itemList = new TreeSet<String>();
			session.setAttribute("myToDoList", itemList);
		}
		
		String item = request.getParameter("item");
		if(item != null && !item.equals("")){
			itemList.add(item);
		}
		%>
		<hr>
		<b>To do:</b>
		<ol>
		<%
		for(String task : itemList){
			out.println("<li>"+task+"</li>");
		}	
		%>
		</ol>
		
		
		
		
		
		
	</pre>
</body>
</html>