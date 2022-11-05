<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="ServletCuenta" method="post">
			
			<h1>TRANSFERENCIA ENTRE CUENTAS</h1>
				<div class="menuTransferencias">
			   		<ul>
			     		<li>
			       			<a href="CuentasUsuario.jsp">Cuentas Bancarias</a>
			      		</li>
			      		<li>
			       			<a href="Transferencias.jsp">Transferencir a otros</a>
			      		</li>
			      		<li>
			       			<a href="PerfilUsuario.jsp">Perfil</a>
			      		</li>
			    	</ul>
			  	</div>
				<div class="form-group">
					<label>Cuenta Origen:</label>
					 <select name="ddlCuentaOrigen" class="form-control" required>
        				<option selected disabled value="">Seleccionar Cuenta</option>
        				<option> Opcion </option>
      				</select>
				</div>
				<div class="form-group">
					<label>Cuenta Destino:</label>
					 <select name="ddlCuentaDestino" class="form-control" required>
        				<option selected disabled value="">Seleccionar Cuenta</option>
        				<option> Opcion2 </option>
      				</select>
				</div>
					<div class="form-group">
					<label>Monto a transferir:</label>
					<input type="number" name="txtMonto" class="form-control" required>
				</div>
			
			<br><br>
				<input type = "submit" name="btnTransferirEntreCuentas" value="Transferir" class="btn btn-info">
			</form>
</body>
</html>