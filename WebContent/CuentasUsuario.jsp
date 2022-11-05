<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div class="menuperfil">
   			 <ul>
						<li><a href="UsuarioMain.jsp">Página Principal</a></li>
					    <li><a href="Prestamos.jsp">Prestamos</a></li>
					    <li><a href="EditarCliente.jsp">Editar Cliente</a></li>
			</ul>
  		</div>
<br>
<H1>Cuentas</H1>
<br>	
<table id="tabla" class="display">
	<thead>
		<tr>
			<th>Numero de Cuenta</th>
			<th>Tipo de Cuenta</th>
			<th>Saldo</th>

		</tr>
	</thead>
	<tbody>	
	<tr>
		<td style="width: 147px; "><input type="hidden" name="Id" value=> </td>
		<td style="width: 214px; "> <input type="hidden" name="Cbu" value=>        </td>
		<td style="width: 80px; ">$<input type="hidden" name="ImpAPagar" value=> </td>

		<td> <input type="submit" name="btnVerMovimientos" value="Ver Movimientos"></td>
	</tr>
	</tbody>
</table>

</body>
</html>