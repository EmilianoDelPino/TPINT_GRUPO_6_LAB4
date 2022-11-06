<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style>
	table, th, td
	{
		border: 1px solid black;
	}
</style>
</head>
<body>
<div class="list-clientes">
   	<ul>
		<li><a href="UsuarioMain.jsp">Página Principal</a></li>
		<li><a href="Cuentas.jsp">Cuentas</a></li>
	</ul>
  	</div>
	<br>
	<H1>Clientes</H1>
	<br>	
	<table id="tabla" class="display">
		<thead>
			<tr>
				<th>Cuil</th>
				<th>Dni</th>
				<th>Nombre</th>
				<th>Apellido</th>
				<th>Sexo</th>
				<th>Nacionalidad</th>
				<th style="height: 38px; ">Fecha de Nacimiento</th>
				<th>Provincia</th>
				<th>Localidad</th>
				<th>Direccion</th>
				<th>Correo</th>
				<th>Telefono</th>
				<th>Usuario</th>
				<th></th>
			</tr>
		</thead>
		<tbody>	
			<tr>
				<td></td>
				<td></td>
				<td></td>
				<td></td>
				<td></td>
				<td></td>
				<td></td>
				<td></td>
				<td></td>
				<td></td>
				<td></td>
				<td></td>
				<td></td>
				<td><input type="submit" name="btnSeleccionarPrestamo" value="Eliminar"></td>
			</tr>
		</tbody>
	</table>
	<br>
	<label>Está seguro que desea eliminarlo?</label>
	<form action="ServletCliente" method="post">
		<input type="hidden" name="Usu"> <!-- Esto debería guardar los datos del usuario al que clickeemos "Eliminar" para que confirme la operación -->
		<input type="submit" name="btnConfirmarEliminar" value="Aceptar">
		<input type="submit" name="btnCancelarEliminar" value="Cancelar">
	</form>
</body>
</html>