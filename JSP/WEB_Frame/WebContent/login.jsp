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
	//if(request.getAttribute("msg")!=null) {
	//	out.println(request.getAttribute("msg")+ "<br/>");
	//}
	%>
	
	${msg}
	
	Login Page <hr>
	<!-- <form action="login_do.jsp" method="post">  -->
	<!-- <form action="login_do" method="post"> -->
	<form action="${pageContext.request.contextPath }/login_do" method="post">
	Username: <input type="text" name="username" /> <br/>
	Password: <input type="password" name="pwd" /> <br/>
	<input type="submit" value="Login"> <br/>
	</form>
</body>
</html>