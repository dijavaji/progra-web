<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>jsp servlets y operaciones sql</title>
</head>
<body>
	<form method="get">
		<p>cedula <input type="text" name="numCedula" size="20"/></p>
		<p><input type="submit" name="btnIngresar" value="Consultar"/>
	</form>
	<%if (request.getParameter("numCedula")!= null && request.getParameter("numCedula") != "") 
	{%>
		<jsp:useBean id="obj" class="ec.com.technoloqie.personaapp.controlador.Persona"></jsp:useBean>
		<jsp:setProperty property="*" name="obj"/>
	<%
		obj.procedimientoConexion();
		obj.procedimientoConsultar();
	%>	
	<%=obj.procedimientoMostrarConsulta() %>
	<% } %>
</body>
</html>