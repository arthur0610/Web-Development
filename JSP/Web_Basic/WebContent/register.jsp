<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<!--
	<form action="register_do.jsp" method="post">
-->	
	<form action="register_do" method="post">
	Username: <input type="text" name="username" /> <br/>
	Password: <input type="password" name="pwd" /> <br/>
	Age: <input type="text" name="age" /> <br/>
	Gender: <input type="radio" name="gender" value="male" />Male <input type="radio" name="gender" value="female" />Female<br/>
	<input type="submit" value="register"> <br/>
	
	</form>
</body>
</html>