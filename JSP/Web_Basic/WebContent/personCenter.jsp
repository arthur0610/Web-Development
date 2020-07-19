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
	//User user = (User) request.getAttribute("user");
	User user = (User) session.getAttribute("user");
	%>
Username: <%=user.getUsername() %> <br/>
Age: <%=user.getAge() %> <br/>
Gender: <%=user.getGender() %> <br/>
</body>
</html>