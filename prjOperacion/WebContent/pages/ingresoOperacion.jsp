<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="ec.com.technoloqie.prjoperacion.modelo.*" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Ingreso de datos</title>
</head>
<body>
	<html:form action="/validar" method="POST">
		<p> Numero1 : <html:text property="numero1"></html:text> </p>
        <p> Numero2 : <html:text property="numero2"></html:text> </p>
        <html:submit property="Submit" value="Sumar"></html:submit>
            
	</html:form>
</body>
</html>