<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1> Solicitar prestamo </h1>
<form action="servletCuenta" method="post">
	DNI: <input type="text" placeholder="Ingrese su DNI" name="txtDni" required/> <br>
	Cuenta Destino: <select name="selectCuenta" required style="width: 109px; "> </select>  <br>
	Monto solicitado: <input type="date" name="txtMonto" required/> <br>
	Cantidad de cuotas: <input type="number" name="txtCuotas" required/>  <br>
	<input type="submit" value="Enviar Solicitud"/>
</form>

</body>
</html>