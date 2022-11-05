<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div class="menuTransferencias">
   		<ul>
     		<li>
       			<a href="CuentasUsuario.jsp">Cuentas Bancarias</a>
      		</li>
      		<li>
       			<a href="TransferenciaEntreCuentas.jsp">Transferencia entre Mis Cuentas</a>
      		</li>
      		<li>
       			<a href="PerfilUsuario.jsp">Perfil</a>
      		</li>
    	</ul>
  	</div>
  	<div class="transf-gral" >
  		<form action="ServletCuenta" method="post">
			<h1>TRANSFERENCIA</h1>
			<div class="form-group">
				<div class="form-group">
					<label>Cuenta Origen:</label>
					 <select name="ddlCuentaOrigen" required>
        				<option selected disabled value="">Seleccionar Cuenta</option>
        				<option> opcion1 </option>
      				</select>
				</div>
					<label>Ingrese CBU de la cuenta destino:</label>
					<input type="number" name="txtCbuDestino" class="form-control" required>
			</div>
				<div class="form-group">
					<label>Monto a transferir:</label>
					<input type="number" name="txtMonto" class="form-control" required>
				</div>
			
			<br><br>
				<input type = "submit" name="btnTransferirOtraCuenta" value="Transferir" class="btn btn-info">
			</form>
  	</div>
</body>
</html>