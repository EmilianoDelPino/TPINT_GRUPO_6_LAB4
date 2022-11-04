<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>PERFIL</title>
</head>
<body>
  		<div class="menuperfil">
   			 <ul>
						<li><a href="UsuarioMain.jsp">Página Principal</a></li>
					 	<li><a href="Cuentas.jsp">Cuentas</a></li>
					    <li><a href="Prestamos.jsp">Prestamos</a></li>
					    <li><a href="EditarCliente.jsp">Editar Cliente</a></li>
			</ul>
  		</div>
  		 <div class="dropdown">
  			
		</div>
			<form action="ServletUsuario" method="post">
			
			<h1>
			<br><b>DATOS DEL PERFIL</b><br><br>
			</h1>
			
			<table style="line-height: normal; width:80%">
			<tr>
				<td>CUIL: </td>
				<td>Usuario: </td>
			</tr>
			<tr>
				<td>Nombre: </td>
				<td>Apellido: </td>
				<td>Sexo: </td>
			</tr>
			<tr>
				<td>Nacionalidad: </td>
				<td>Fecha de Nacimiento: </td>
			</tr>
			<tr>
				<td>Provincia: </td>
				<td>Localidad: </td>
				<td>Direccion: </td>
			</tr>
			<tr>
				<td>Correo: </td>
				<td>Telefono: </td>
			</tr>
		</table>
		<br>	
				<br>
				<br>
				<br>
			</form>
</body>
</html>