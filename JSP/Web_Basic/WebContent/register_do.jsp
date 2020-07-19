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
	Object msg = request.getAttribute("msg");
	if(msg!=null) {out.println(msg);}
	%>

	<%
	String username = request.getParameter("username");
	String pwd = request.getParameter("pwd");
	int age = Integer.parseInt(request.getParameter("age"));
	String gender = request.getParameter("gender");
		
	boolean isSuccess = DatabaseUtil.addUser(username, pwd, age, gender);
	if(isSuccess) {
		request.setAttribute("msg", "Register successfully!");
		request.getRequestDispatcher("login.jsp").forward(request, response);
		
	} else {
		request.setAttribute("msg", "Register failed!");
		request.getRequestDispatcher("register.jsp").forward(request, response);
	}
		
		
	if(isSuccess) {
	//		out.println("Register successfully");
	%>
		<font color="green">Register successfully!! Your Username: <%= username %></font>
	<%
	} else {
	%>
		out.println("<font color="red">fail to register"</font>);
	<%
	}
	%>
</body>
</html>

