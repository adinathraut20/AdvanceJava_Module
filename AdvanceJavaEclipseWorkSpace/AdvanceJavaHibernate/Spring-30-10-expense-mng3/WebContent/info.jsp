<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@ page import="java.util.List" %>
   <%@ page import="com.cdac.dto.Expense" %>
    <% List<Expense> li = (List<Expense>)request.getAttribute("list"); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<img src="https://i.pinimg.com/originals/a5/9c/93/a59c93e6fc0f836f9477b24b80a9c12a.jpg" width="500" height="300"/>
<% for(Expense i : li){ %>
	<div><%= i.toString() %></div>
	<div><img src=<%= i.getItemName() %> width="500" height="300"></div> 
	<% } %>
</body>
</html>