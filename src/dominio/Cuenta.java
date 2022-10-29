package dominio;

public class Cuenta {
	private String dni; //Este DNI tiene que ser FK de la tabla Usuarios, no puede haber una cuenta con un usuario inexistente.
	private String num_cuenta;
	private String cbu;
	private String fecha_creacion;
	private boolean admin; // Este campo es para setear el tipo de cuenta, si es true significa que es un Administrador, si no es un Usuario normal.
	private Double saldo; //Lo cree con Double porque en la BD seguramente sea un money por lo tanto debería soportar un valor con "," .
	
	//Constructors
	public Cuenta() {}

	public Cuenta(String dni, String num_cuenta, String cbu, String fecha_creacion, boolean admin, Double saldo) {
		super();
		this.dni = dni;
		this.num_cuenta = num_cuenta;
		this.cbu = cbu;
		this.fecha_creacion = fecha_creacion;
		this.admin = admin;
		this.saldo = saldo;
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

	public String getFecha_creacion() {
		return fecha_creacion;
	}

	public void setFecha_creacion(String fecha_creacion) {
		this.fecha_creacion = fecha_creacion;
	}

	public boolean isAdmin() {
		return admin;
	}

	public void setAdmin(boolean admin) {
		this.admin = admin;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	@Override
	public String toString() {
		return "Cuenta [dni=" + dni + ", num_cuenta=" + num_cuenta + ", cbu=" + cbu + ", fecha_creacion="
				+ fecha_creacion + ", admin=" + admin + ", saldo=" + saldo + "]";
	}

	
}
