<%@page import="java.util.List"%>
<%@page import="edu.zxie0018.model.Good" %>>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	Good Content
	<table border="1">
	
	<%
	List<Good> GoodsList = (List<Good>) request.getAttribute("GoodsList");

	
	for(Good good : GoodsList) {
		%>
		<tr>
			<td><%=good.getGoodName() %></td>
			<td><%=good.getGoodDescrition() %></td>
			<td><%=good.getPrice() %></td>
			<td><%=good.getInventory() %></td>
			<td>Edit Delete</td>
		</tr>
		<%
	}
	%>
	
	</table>
</body>
</html>