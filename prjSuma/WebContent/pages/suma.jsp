<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>jsp page</title>
</head>
<body>
	<form action="delegada.jsp" method="post">
		<center>
			<p> Numero1 : <input type="text" name="numero1" size="20"> </p>
            <p> Numero2 : <input type="text" name="numero2" size="20"> </p>
            
            <input type="submit" value="Sumar" name="btnSumar"/>
            </br>
            <font color="red">
            	<% if(!(request.getParameter("mensaje") == null)){
            			out.println(request.getParameter("mensaje"));
            		}
            	%>
            </font>
		</center>
	</form>
</body>
</html>