<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Eliminación Usuario</title>
</head>
<body>

<form action="servletUsuario" method="post">
<h1>Eliminación de Usuario</h1>
Ingrese el DNI del usuario a Eliminar: <input type="text" placeholder="Ejemplo: 99999999" name="txtDNI" requered />
<input type="submit" value="Buscar" name="btnBuscar"/>
</form>

</body>
</html>