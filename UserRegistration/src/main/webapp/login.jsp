<%@page import="com.pack.UserBean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
		UserBean ub = (UserBean)application.getAttribute("ubean");
		out.println("Welcome user : "+ub.getfName()+"<br/>");
	%>
	<a href="viewProfile" >View Profile</a><br/>
	<a href="logoutUser" >Logout</a>
</body>
</html>