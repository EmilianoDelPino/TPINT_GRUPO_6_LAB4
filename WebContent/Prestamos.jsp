<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Mis préstamos</title>
</head>
<body>
	<div class="menuperfil">
   		<ul>
				<li><a href="UsuarioMain.jsp">Página Principal</a></li>
				<li><a href="Cuentas.jsp">Cuentas</a></li>
		</ul>
  	</div>
	<br>
	<H1>Prestamos</H1>
	<br>	
	<table id="tabla" class="display">
		<thead>
			<tr>
				<th>Codigo</th>
				<th>CBU de cuenta</th>
				<th>Importe total a Pagar</th>
				<th>Importe Pedido</th>
				<th>Monto por Mes</th>
				<th>Cantidad de Cuotas</th>
				<th>Cuotas Pagadas</th>
				<th>Cuotas Faltantes</th>
				<th>Estado</th>
			</tr>
		</thead>
		<tbody>	
			<tr>
				<td><input type="hidden" name="Id" value=> </td>
				<td> <input type="hidden" name="Cbu" value=>        </td>
				<td>$<input type="hidden" name="ImpAPagar" value=> </td>
				<td>$<input type="hidden" name="ImpPedido" value=> </td>
				<td>$<input type="hidden" name="MontoXMes" value=> </td>
				<td><input type="hidden" name="Cuotas" value=> </td>
				<td><input type="hidden" name="CuotasPagas" value=> </td>
				<td><input type="hidden" name="CuotasFaltantes" value=> </td>
				<td></td>
				<td> <input type="submit" name="btnSeleccionarPrestamo" value="Seleccionar"><!-- ToDo: SOLO SI ESTADO ES AUTORIZADO --></td>
			</tr>
		</tbody>
	</table>
<br>
	<input name=btnSolicitarPrestamo type="submit" value="Solicitar Nuevo Prestamo"/>
<br>
</body>
</html>