<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<%@ page import="java.util.*, ec.com.technoloqie.productoWeb.controlador.form.* "  %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html:html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>jsp page</title>
</head>
<body>
	<h1>Listado de de categoria productos</h1>
	
	<html:form	method="post">
		<html:select property="categoriaProducto">
			<html:options name="categoriaProductoForm" property="categoriaProducto"/>
		</html:select>
		<%-- <html:submit value="Mostrar listado de productos"></html:submit> --%>
	</html:form>
</body>
</html:html>