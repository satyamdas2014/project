<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>login</title>
</head>
<body>
<h1>login here...</h1>
<form action=project method="post">
username<input type="email" name="email"/>
password<input type="text" name="password"/>
<input type="submit" value="login"/>
</form>
<%
if(request.getAttribute("error")!=null){
  out.println(request.getAttribute("error"));
}
%>
</body>
</html>