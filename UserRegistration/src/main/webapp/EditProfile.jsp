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
	<h3>Edit Your Details</h3>
	<%
		UserBean ub = (UserBean)application.getAttribute("ubean");
		String firstName = (String)request.getAttribute("fname");
		out.println("Pages belongs to : "+firstName);
	%>
	<br>
	<div>
		<form action="updateProfile" method="post">
			Address<input type="text" name="uAddr"/>
			<br>
			MailId<input type="text" name="uMailId"/>
			<br>
			PhoneNumber<input type="text" name="uPhno" >
			<br>
			<input type="submit" value="Submit"/>
		</form>
	</div>
</body>
</html>