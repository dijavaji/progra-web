<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="ec.com.technoloqie.prjoperacion.modelo.*" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Pagina de resultados</title>
</head>
<body>
	<% Integer i = (Integer) request.getAttribute("respuesta"); %>
	<p>La suma es : <%=i %></p>
</body>
</html>