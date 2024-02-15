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
		String fName = (String)request.getAttribute("fname");
		UserBean ub = (UserBean)application.getAttribute("ubean");
		out.println("<br> Page belongs to :"+(String)request.getAttribute("fname"));
		out.println("<br>"+ub.getfName()+" "+ub.getlName()+" "+ub.getuAddr()+" "+ub.getuMailId()+" "+ub.getuPhno());
		
	%>
	<br/>
	<a href="editProfile">Edit Profile</a>
	<br/>
	<a href="logoutUser">Logout</a>
</body>
</html>