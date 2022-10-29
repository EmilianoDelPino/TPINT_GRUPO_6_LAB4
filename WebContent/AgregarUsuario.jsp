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
<form action="servletUsuario" method="post">
		Nombre: <input type="text" name="txtNombre" /> <br>
		Apellido: <input type="text" name="txtApellido" />  <br>
		DNI: <input type="text" name="txtDni" /> <br>
		CUIL/CUIT: <input type="text" name="txtCuil" />  <br>
		Sexo: <input type="text" name="txtSexo" /> <br>
		Nacionalidad: <input type="text" name="txtPais" />  <br>
		Fecha De Nacimiento: <input type="text" name="txtFechaNac" /> <br>
		Direccion: <input type="text" name="txtDireccion" />  <br>
		Localidad: <input type="text" name="txtLocalidad" /> <br>
		Provincia: <input type="text" name="txtProvincia" />  <br>
		Correo electronico: <input type="text" name="txtEmail" /> <br>
		Telefono: <input type="text" name="txtTelefono" />  <br>
		Usuario: <input type="text" name="txtUsuario" /> <br>
		Password: <input type="text" name="txtPassword" />  <br>
		<input type="submit" value="Guardar cliente"/>
</form>

</body>
</html>