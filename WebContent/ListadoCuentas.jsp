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
	<div class= list-cuentas>
		<ul>
			<li><a href="UsuarioMain.jsp">Página Principal</a></li>
			<li><a href="Cuentas.jsp">Cuentas</a></li>
		</ul>
		<br>
		<H1>Cuentas</H1>
		<br>	
		<table id="tabla" class="display">
			<thead>
				<tr>
					<th>CBU</th>
					<th>CUIL</th>
					<th style="height: 28px; ">Tipo de Cuenta</th>
					<th style="height: 37px; ">Numero de Cuenta</th>
					<th style="width: 82px; ">Fecha de Creacion</th>
					<th>Saldo</th>
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
				</tr>
			</tbody>
		</table>
	</div>
</body>
</html>