<%@page import="java.sql.ResultSet"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        <%@ include file="menu.jsp" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title> Registration</title>
</head>
<body>
<h1>All Registration</h1>
<form action="alllist" method="post">
<table>
<thead>
<tr>
<th>Name</th>
<th>City</th>
<th>Email</th>
<th>Mobile</th>
</tr>
</thead>
<table>
</form>
<%
ResultSet res=(ResultSet)request.getAttribute("result");
while(res.next()){%>
	<tbody>
	<tr>
		<td><%= res.getString(1) %></td>
		<td><%= res.getString(2) %></td>
		<td><%= res.getString(3) %></td>
			<td><%= res.getString(4) %></td>
</tr>
	</tbody>
	
<%} %>
</table>
</body>
</html>