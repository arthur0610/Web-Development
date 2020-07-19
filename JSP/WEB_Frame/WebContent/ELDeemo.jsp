<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page import="edu.zxie0018.model.User"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
page request session application

<% 
	request.setAttribute("number", 2000); 
	session.setAttribute("user", "kk");
	session.removeAttribute("user");
	application.setAttribute("count", 500);
%>

<hr/>

${requestScope.number}
<br/>
${sessionScope.user}
<br/>
${applicationScope.count}
<br/>

${number}
<br/>

<%
	User u = new User("kkk", "kkk", 90, "male", false);
	request.setAttribute("user", u);
%>
${user.username }
${user.password }

<%
	List<User> list = new ArrayList<User>();
	list.add(new User("kkk", "kkk", 90, "male", false));
	list.add(new User("kkkqq", "kkk", 90, "male", false));
	list.add(new User("kkkqqq", "kkk", 90, "male", false));
	list.add(new User("kkkqqqq", "kkk", 90, "male", false));
	list.add(new User("kkkqqqqq", "kkk", 90, "male", false));
	request.setAttribute("list", list);
%>

${list[2].username }
${list[4].username }

${pageContext.request.contextPath }


</body>
</html>