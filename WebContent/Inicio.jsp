<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1> Login </h1>
<form action="servletUsuario" method="get">
	Usuario: <input type="text" name="txtUsuario" required> <br>
	Contraseņa:  <input type="password" name="txtPassword" required> <br>
	<input type="submit" value="Aceptar" name="btnAceptar"> <br>
	
</form>

</body>
</html>