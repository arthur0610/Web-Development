<%@page import="edu.monash.model.User"%>
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
	Object o = session.getAttribute("user");
	if(o != null) {
		User user = (User) o;
		out.println("Now user is: " + user.getUsername() + "<br/>");
	}
	%>
	<a href="login.jsp">Login</a> <a href="register.jsp">Register</a>
</body>
</html>