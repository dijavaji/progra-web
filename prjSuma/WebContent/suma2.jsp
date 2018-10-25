<%-- 
    Document   : suma2
    Created on : 26/09/2018, 9:44:40
    Author     : fing.labcom
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:useBean id="idBean" class="ec.com.technoloqie.operacion.modelo.BeanOperacion"/>
<jsp:setProperty name="idBean" property="*"/>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP utilizando una clase java</title>
    </head>
    <body>
        <form method="get"> 
            <p> Numero1 : <input type="text" name="numero1" size="20"> </p>
            <p> Numero2 : <input type="text" name="numero2" size="20"> </p>
            
            <input type="submit" value="Sumar" name="btnSumar"/>
            
        </form>
        <p>La suma de <%= idBean.getNumero1() %> + <%= idBean.getNumero2() %> es igual: <%= idBean.suma() %> </p>
    </body>
</html>
