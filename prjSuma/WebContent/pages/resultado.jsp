<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>suma dos numeros </title>
</head>
<body>
	<% 
		Integer numero1 = Integer.parseInt(request.getParameter("numero1"));
		Integer numero2 = Integer.parseInt(request.getParameter("numero2"));
	%>
	<center>
		<h1>La suma es: <%=numero1 + numero2 %></h1>
		<br>
		<a href="suma.jsp">Volver</a>
	</center>
</body>
</html>