<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	
<h1> Agregar Cliente </h1>
<form action="servletCuenta" method="post">
	DNI: <input type="text" name="txtDni" /> <br>
	Tipo: <select name="selectTipo"> </select>  <br>
	Fecha de creacion: <input type="text" name="txtFecha" /> <br>
	Numero de cuenta: <input type="text" name="txtNumero" />  <br>
	CBU: <input type="text" name="txtCbu" /> <br>
	Saldo: <input type="text" name="txtSaldo" />  <br>
	<input type="submit" value="Guardar cuenta"/>
</form>
	
</body>
</html>