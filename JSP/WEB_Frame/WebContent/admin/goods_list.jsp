<%@page import="java.util.List"%>
<%@page import="edu.zxie0018.model.Good" %>
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
	Good Content
	<table border="1">
	<tr><td>goodName</td><td>goodDescrition</td><td>price</td><td>invertory</td><td>Edit Delete</td>
	</tr>
	<c:forEach items="${GoodsList }" var="g">
		<tr>
			<td>${g.goodName }</td>
			<td>${g.goodDescrition }</td>
			<td>${g.price }</td>
			<td>${g.inventory }</td>
			<td>Edit Delete</td>
		</tr>
	</c:forEach>
	</table>
</body>
</html>