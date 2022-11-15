package dominio;

import java.time.LocalDate;

public class Cuenta {
	private String dni; //Este DNI tiene que ser FK de la tabla Usuarios, no puede haber una cuenta con un usuario inexistente.
	private String num_cuenta;
	private String cbu;
	private LocalDate fecha_creacion;
	private Double saldo; //Lo cree con Double porque en la BD seguramente sea un money por lo tanto debería soportar un valor con "," .
	private int idTipoCuenta;
	private boolean estado;
	
	//Constructors
	public Cuenta() {}

	public Cuenta(String dni, String num_cuenta, String cbu, LocalDate fecha_creacion, Double saldo, int idTipoCuenta,
			boolean estado) {
		super();
		this.dni = dni;
		this.num_cuenta = num_cuenta;
		this.cbu = cbu;
		this.fecha_creacion = fecha_creacion;
		this.saldo = saldo;
		this.idTipoCuenta = idTipoCuenta;
		this.estado = estado;
	}


	//Getters and Setters
	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNum_cuenta() {
		return num_cuenta;
	}

	public void setNum_cuenta(String num_cuenta) {
		this.num_cuenta = num_cuenta;
	}

	public String getCbu() {
		return cbu;
	}

	public void setCbu(String cbu) {
		this.cbu = cbu;
	}

	public LocalDate getFecha_creacion() {
		return fecha_creacion;
	}

	public void setFecha_creacion(LocalDate localDate) {
		this.fecha_creacion = localDate;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}
	
	public int getIdTipoCuenta() {
		return idTipoCuenta;
	}

	public void setIdTipoCuenta(int idTipoCuenta) {
		this.idTipoCuenta = idTipoCuenta;
	}

	public boolean isEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}

	@Override
	public String toString() {
		return "Cuenta [dni=" + dni + ", num_cuenta=" + num_cuenta + ", cbu=" + cbu + ", fecha_creacion="
				+ fecha_creacion + ", saldo=" + saldo + "]";
	}

	
}
