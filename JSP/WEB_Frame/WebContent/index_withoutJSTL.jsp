<%@page import="edu.zxie0018.model.User"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
	Object o = session.getAttribute("user");
	if(o == null) {
		%>
		<!-- <a href="<%=request.getContextPath() %>/login.jsp">Login</a> -->
		<a href="${pageContext.request.contextPath }/login.jsp">Login</a>
		<!-- <a href="<%=request.getContextPath() %>/register.jsp">Register</a> -->
		<a href="${pageContext.request.contextPath }/register.jsp">Register</a>
		<%
		
	} else {
		User user = (User) o;
		out.println("Now user is: " + user.getUsername() + "<br/>");
	}
	 %>
	<br/>
	<hr/>
	
	Body content
	
</body>
</html>