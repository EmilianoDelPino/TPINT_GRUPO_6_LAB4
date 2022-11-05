<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<br>
<H1>Solicitudes pendientes</H1>
<br>	
<table id="tabla" class="display">
	<thead>
		<tr>
			<th>Cliente</th>
			<th>Monto solicitado</th>
			<th>Plazo</th>
			<th>Cuotas</th>
			<th>Saldo actual</th>

		</tr>
	</thead>
	<tbody>	
	<tr>
		<td style="width: 235px; "><input type="hidden" name="nombreYapellido" value=> </td>
		<td style="width: 128px; "> <input type="hidden" name="Monto" value=>        </td>
		<td style="width: 80px; ">$<input type="hidden" name="Plazo" value=> </td>
		<td style="width: 80px; ">$<input type="hidden" name="Cuotas" value=> </td>
		<td style="width: 80px; ">$<input type="hidden" name="Saldo" value=> </td>

		<td> <input type="submit" name="btnDenegar" value="Denegar"> <input type="submit" name="btnAceptar" value="Aceptar"></td>
	</tr>
	</tbody>
</table>

</body>
</html>