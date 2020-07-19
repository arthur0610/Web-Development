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

	<c:choose>
	<c:when test="${empty user }">
		<a href="${pageContext.request.contextPath }/login.jsp">Login</a>
		<a href="${pageContext.request.contextPath }/register.jsp">Register</a>
	</c:when>
	<c:otherwise>
		Now user is: ${user.username }
	</c:otherwise>
	</c:choose>

	<br/>
	<hr/>
	
	Body content
	
</body>
</html>