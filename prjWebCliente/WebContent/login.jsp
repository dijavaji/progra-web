<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Formulario de autentificacion</title>
</head>
<body>
	<h1> Formulario de autenticacion</h1>
	<html:form action="/validar" method="POST">
		<table>
			<tr>
				<td> Usuario</td>
				<td> <html:text property="usuario"></html:text> </td>
			</tr>
			<tr>
				<td> Password</td>
				<td> <html:text property="password"></html:text> </td>
			</tr>
			<tr>
				<td colspan="2">
					<br/>
					<html:submit property="submit" value="Validar"></html:submit>
					<html:reset value="Limpiar"></html:reset>
				</td>
			</tr>
		</table>
	</html:form>
		<br/>
		<html:link forward="paraRegistro">Registrese</html:link>
</body>
</html>