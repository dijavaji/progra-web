<%-- 
    Document   : operacion
    Created on : 26/09/2018, 10:17:48
    Author     : fing.labcom
    jsp sencillo que realiza operaciones basicas mediante javascript
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>practica jsp utilizando javascript</title>
        <script type="text/javascript">
        	function calcular(signo){
        		switch (signo) {
				case '+':
					document.form1.resultado.value = eval(document.form1.numero1.value) + eval(document.form1.numero2.value);
					break;
				case '-':
					document.form1.resultado.value = eval(document.form1.numero1.value) - eval(document.form1.numero2.value);
					break;
				case '*':
					document.form1.resultado.value = eval(document.form1.numero1.value) * eval(document.form1.numero2.value);
					break;	
				case '/':
					document.form1.resultado.value = eval(document.form1.numero1.value) / eval(document.form1.numero2.value);
					break;	

				default:
					document.form1.resultado.value = "error";
					break;
				}
        	}
        </script>
    </head>
    <body>
        <form name="form1">
    		<p>Numero1 <input type="text" name="numero1" size="5"></p>
    		<p>
    			<select id="signoId" name="signo">
    				<option value="+">+</option>
    				<option value="-">-</option>
    				<option value="*">*</option>
    				<option value="/">/</option>
    			</select>
    		</p>
    		<p>Numero2 <input type="text" name="numero2" size="5"></p>
    		<input type="button" onclick="calcular( document.getElementById('signoId').value)" value="Calcular">  
    		<p>Resultado <input type="text" name="resultado" size="5"></p> 
        </form>
    </body>
</html>
