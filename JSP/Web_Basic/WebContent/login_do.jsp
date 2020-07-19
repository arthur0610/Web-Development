<%@page import="edu.monash.model.User"%>
<%@page import="edu.monash.util.DatabaseUtil"%>
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
	String username = request.getParameter("username");
	String pwd = request.getParameter("pwd");
	
	User user = DatabaseUtil.verifyUser(username, pwd);
	if(user == null) {
		out.println("login failed, username or password is incorrect!");
		request.setAttribute("msg", "login failed, username or password is incorrect!");
		request.getRequestDispatcher("login.jsp").forward(request, response);
	} else {
		out.println("login successfully!");
		// session:
		session.setAttribute("user", user);
		//request.setAttribute("user", user);
		request.getRequestDispatcher("personCenter.jsp").forward(request, response);
	}
	
	%>
</body>
</html>