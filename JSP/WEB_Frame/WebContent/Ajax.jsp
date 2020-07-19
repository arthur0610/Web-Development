<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<script type="text/javascript" src="${pageContext.request.contextPath }/js/jquery-3.4.1.min.js"></script>
<script type="text/javascript">


//setInterval("callAjax()", 2000);
setInterval("callAjaxByJs()", 2000);

function callAjax() {
	$.ajax({
		url:"${pageContext.request.contextPath}/ajaxrequest?data=ClientData",
		type:"get",
		cache:false,
		success:function(msg) {
			$("#msg").append(msg);
		}
	});
}

function callAjaxByJs() {
	var xmlhttp = new XMLHttpRequest();
	xmlhttp.open("GET", "${pageContext.request.contextPath}/ajaxrequest?data=ClientData", true);
	xmlhttp.send();
	xmlhttp.onreadystatechange = function() {
		if(xmlhttp.readyState == 4 && xmlhttp.status == 200) {
			$("#msg").append(xmlhttp.responseText);
		}
	}
}

</script>
</head>
<body>
	<div id="msg"></div>

	<form action="${pageContext.request.contextPath }/login_do" method="post">
	Username: <input type="text" name="username" /> <br/>
	Password: <input type="password" name="pwd" /> <br/>
	<input type="submit" value="Login"> <br/>
	</form>
</body>
</html>