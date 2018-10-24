<%@page import="ec.com.technoloqie.productoWeb.controlador.beans.ProductoBean"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@ page import="java.util.*, ec.com.technoloqie.productoWeb.controlador.form.* "  %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Consulta solicitada ...</title>
	</head>
<body>
	<% ArrayList<ProductoBean> productos = (ArrayList)request.getAttribute("productos"); %>
	<h1>Listado de productos</h1>
	
	<table>
		<th>CategoriaId</th>
		<th>Categoria</th>
		<th>ProductoId</th>
		<th>Producto</th>
		<th>Precio</th>
		<th>Stock</th>
		
		<% for(int i = 0; i<productos.size(); i++){ 
			ProductoBean prod = productos.get(i);%>
			<tr>
				<td><%= prod.getIdCategoria() %></td>
				<td><%= prod.getNombreCategoria() %></td>
				<td><%= prod.getIdProducto() %></td>
				<td><%= prod.getNombreProducto() %></td>
				<td><%= prod.getPrecioProducto() %></td>
				<td><%= prod.getStockProducto() %></td>
			</tr>
		<% } %>	
	</table>
	</p>
	</p>
</body>
</html>