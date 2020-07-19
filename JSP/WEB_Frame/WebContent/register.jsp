<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<script type="text/javascript" src="${pageContext.request.contextPath }/js/jquery-3.4.1.min.js"></script>
<script type="text/javascript">
$(function(){
	$("input[name='username']").blur(verifyUsername);
});

function verifyUsername() {
	$.ajax({
		url:"${pageContext.request.contextPath}/verifyUsername",
		type:"post",
		data:{
			username:$("input[name='username']").val()
		},
		cache:false,
		dataType:"json",
		success:function(msg) {
			//$("#msg").append(msg);
			//alert(msg.isSuccess);
			if(msg.isSuccess) {
				$("#usernameVerifiaction").html("<font color='green'>The username is free to register!</font>");
			} else {
				$("#usernameVerifiaction").html("<font color='red'>The username is used!</font>");
			}
		}
	});
}
</script>
</head>
<body>
	<%
	//if(request.getAttribute("msg")!=null) {
	//	out.println(request.getAttribute("msg")+ "<br/>");
	//}
	%>
	
	${msg}

<!--
	<form action="register_do.jsp" method="post">
-->	

	<!-- <form action="<%=request.getContextPath() %>/register_do" method="post">  -->
	<form action="${pageContext.request.contextPath }/register_do" method="post">
	Username: <input type="text" name="username" /> <br/> <div id="usernameVerifiaction"></div>
	Password: <input type="password" name="pwd" /> <br/>
	Age: <input type="text" name="age" /> <br/>
	Gender: <input type="radio" name="gender" value="male" checked="checked"/>Male <input type="radio" name="gender" value="female" />Female<br/>
	<input type="submit" value="register"> <br/>
	
	</form>
</body>
</html>