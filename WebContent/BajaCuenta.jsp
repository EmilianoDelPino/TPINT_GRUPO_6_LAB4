<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
 
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Eliminación Cuentas</title>
</head>
<body>

<form action="servletCuenta" method="post">
<h1>Eliminación de Cuentas</h1>
Ingrese el DNI del Cliente <input type="text" placeholder="Ejemplo 99999999" name="txtDNI" requered/><br>
Seleccione la Cuenta que desea Eliminar 
<select name="cuenta">
	<option value="Caja de ahorros">Caja de ahorros</option>
	<option value="Cuenta Corriente">Cuenta Corriente</option>
</select> <br>
<input type="submit" value="Eliminar" name="btnEliminar"/>

</form>

</body>

</html>