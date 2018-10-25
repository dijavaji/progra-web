<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>jsp, beans y operacion guardado sql</title>
</head>
<body>
	<form method="get">
		<p>Cedula <input type="text" name="txtCedula" size="20"/></p>
		<p>Nombre <input type="text" name="txtNombre" size="20"/></p>
		<p>Apellido <input type="text" name="txtApellido" size="20"/></p>
		<p>Sexo <select name="slSexo">
					<option value="M">masculino</option>
					<option value="F">femenino</option>
				</select>
		</p>
		<input type="submit" value="Ingresar datos" name="btnIngresar"/>
	</form>
	<%if (request.getParameter("txtCedula")!= null && request.getParameter("txtCedula") != ""&&
			request.getParameter("txtNombre")!= null && request.getParameter("txtNombre") != ""&&
			request.getParameter("txtApellido")!= null && request.getParameter("txtApellido") != ""&&
			request.getParameter("slSexo")!= null && request.getParameter("slSexo") != "") 
	{ 
		String[] datos = new String[4];
		datos[0] = request.getParameter("txtCedula");
		datos[1] = request.getParameter("txtNombre");
		datos[2] = request.getParameter("txtApellido");
		datos[3] = request.getParameter("slSexo");
	 %>
	<jsp:useBean id="objetoId" class="ec.com.technoloqie.personaapp.controlador.PersonaArreglo"></jsp:useBean>
	<jsp:setProperty property="arreglo" name="objetoId" value="<%=datos %>"/>
	<%
		objetoId.procedimientoConexion();
		objetoId.procedimientoIngreso();
	}
	%>
</body>
</html>