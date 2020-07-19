<%@page import="java.util.ArrayList"%>
<%@page import="edu.zxie0018.model.User"%>
<%@page import="java.util.List"%>
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

<%-- <%request.setAttribute("username", user) %> --%>
<c:set var="username" value="kk" scope="request"></c:set>
${username }

<c:out value="${username }"></c:out>
<c:remove var="username"/>
<c:out value="${username }"></c:out>

<br/>

<c:set var="age" value="20" scope="request"></c:set>
<c:if test="${age > 18}">
xswl
</c:if>

<br/>

<c:choose>
<c:when test="${age > 18 }">core:when</c:when>
<c:otherwise>core:otherwise</c:otherwise>
</c:choose>

<br/>

<c:forEach var="i" begin="1" end="10">
${i }<br/>
</c:forEach>

<%
	List<User> list = new ArrayList<User>();
	list.add(new User("kkk", "kkk", 90, "male", false));
	list.add(new User("kkkqq", "kkk", 90, "male", false));
	list.add(new User("kkkqqq", "kkk", 90, "male", false));
	list.add(new User("kkkqqqq", "kkk", 90, "male", false));
	list.add(new User("kkkqqqqq", "kkk", 90, "male", false));
	request.setAttribute("list", list);
%>

<c:forEach items="${list }" var="u">
${u.username } ${u.age }<br/>
</c:forEach>

</body>
</html>