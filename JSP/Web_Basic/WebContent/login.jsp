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

	
	Login Page <hr>
	<!-- <form action="login_do.jsp" method="post">  -->
	<form action="login_do" method="post">
	Username: <input type="text" name="username" /> <br/>
	Password: <input type="password" name="pwd" /> <br/>
	<input type="submit" value="Login"> <br/>
	</form>
</body>
</html>