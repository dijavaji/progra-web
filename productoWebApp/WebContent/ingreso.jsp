<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Formulario bienvenida</title>
</head>
<body>
	<center>
		<html:form action="/ingresar" method="POST">
			<html:text property="bandera" value="Bienvenido al sistema de consulta" size="35"></html:text>
			</p></p>
			<html:submit property="submit" value="Ingresar al sistema"></html:submit>
		</html:form>
	</center>
</body>
</html>