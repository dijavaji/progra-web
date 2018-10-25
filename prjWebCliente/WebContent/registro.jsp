<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html:html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Registro de usuarios</title>
</head>
<body>
	<h1>Registro de usuario</h1>
	<html:form action="/registrar" method="POST">
		<table>
			<tr>
				<td> nombre </td>
				<td> <html:text property="nombre"></html:text> </td>
			</tr>
			<tr>
				<td> usuario </td>
				<td> <html:text property="usuario"></html:text> </td>
			</tr>
			<tr>
				<td> password </td>
				<td> <html:text property="password"></html:text> </td>
			</tr>
			<tr>
				<td> email </td>
				<td> <html:text property="email"></html:text> </td>
			</tr>
			<tr>
				<td colspan="2">
				<br/>
					<html:submit property="submit" value="Registrar"></html:submit>
					<html:reset value="Limpiar"></html:reset>
			</tr>
		</table>
	</html:form>

</body>
</html>