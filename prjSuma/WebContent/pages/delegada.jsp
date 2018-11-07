<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>pagina jsp que delega la operacion</title>
</head>
<body>
	<% 
		if((!(request.getParameter("numero1").equals(null)))
				&& (!(request.getParameter("numero1").equals("")))
				&& (!(request.getParameter("numero2").equals(null))) 
				&& (!(request.getParameter("numero2").equals("")))	
				)
		{	
	%>
		<jsp:forward page="resultado.jsp"></jsp:forward>
	<%} else {%>
		<jsp:forward page="suma.jsp">
			<jsp:param value="los numeros deben contener algun valor" name="mensaje"/>
		</jsp:forward>
	<% } %>	
</body>
</html>