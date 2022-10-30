<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1> Agregar Usuario </h1>
<form action="servletUsuario" method="post">
		Nombre: <input type="text" placeholder="Ingrese su Nombre" name="txtNombre" required/> <br>
		Apellido: <input type="text" placeholder="Ingrese su Apellido" name="txtApellido" required/>  <br>
		DNI: <input type="text" placeholder="Ingrese su DNI" name="txtDni" required/> <br>
		CUIL/CUIT: <input type="text" placeholder="Ingrese su CUIL" name="txtCuil" pattern="[0-9]{2}-[0-9]{8}-[0-9]{1}" required/> <small> Formato: 12-34567890-1 </small> <br>
		Sexo: <select name="Sexo" required>
			<option value="Masculino">Masculino</option>
			<option value="Femenino">Femenino</option>
		 </select> <br>
		Nacionalidad: <input type="text" placeholder="Ingrese su Nacionalidad" name="txtNacionalidad" required/>  <br>
		Fecha De Nacimiento: <input type="date" name="txtFechaNac" required/> <br>
		Direccion: <input type="text" placeholder="Ingrese su Direccion" name="txtDireccion" required/>  <br>
		Localidad: <input type="text" placeholder="Ingrese su Localidad" name="txtLocalidad" required/> <br>
		Provincia: <select name="Provincia" required>
			<option value="Buenos Aires">Buenos Aires</option>
			<option value="Buenos Aires Capital">Buenos Aires Capital</option>
			<option value="Catamarca">Catamarca</option>
			<option value="Chaco">Chaco</option>
			<option value="Chubut">Chubut</option>
			<option value="Cordoba">Cordoba</option>
			<option value="Corrientes">Corrientes</option>
			<option value="Entre Rios">Entre Rios</option>
			<option value="Formosa">Formosa</option>
			<option value="Jujuy">Jujuy</option>
			<option value="La Pampa">La Pampa</option>
			<option value="La Rioja">La Rioja</option>
			<option value="Mendoza">Mendoza</option>
			<option value="Misiones">Misiones</option>
			<option value="Neuquen">Neuquen</option>
			<option value="Rio Negro">Rio Negro</option>
			<option value="Salta">Salta</option>
			<option value="San Juan">San Juan</option>
			<option value="San Luis">San Luis</option>
			<option value="Santa Cruz">Santa Cruz</option>
			<option value="Santa Fe">Santa Fe</option>
			<option value="Santiago del Estero">Santiago del Estero</option>
			<option value="Tierra del Fuego">Tierra del Fuego</option>
			<option value="Tucuman">Tucuman</option>
		</select> <br>
		Correo electronico: <input type="email" placeholder="Ingrese su Email" name="txtEmail" required/> <br>
		Telefono: <input type="tel" placeholder="Ingrese su Telefono" name="txtTelefono" required/>  <br>
		Usuario: <input type="text" placeholder="Ingrese su Usuario" name="txtUsuario" required/> <br>
		Password: <input type="password" placeholder="Ingrese su Contraseña" name="txtPassword" required/>  <br>
		<input type="submit" value="Guardar cliente" name= "btnGuardarCliente"/>
</form>
<%
	if(request.getAttribute("btnGuardarCliente")!=null)
	{%>
		<%= request.getAttribute("btnGuardarCliente") %>
	<%}%>
</body>
</html>