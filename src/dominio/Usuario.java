package dominio;

public class Usuario {
	private String dni; //@ToDo Esta debería ser la PK en la BD para utilizar como FK en las tablas de CUENTAS y PRESTAMOS. Emi.
	private String usuario;
	private String password;
	private String cuil;
	private String sexo;
	private String fechaNac;
	private String direc;
	private String localidad;
	private String provincia;
	private String mail;
	private String telefono;
	private boolean activo; //Este campo se usará para hacer la baja lógica en la BD.
	
	//Constructors
	
	public Usuario() {}

	public Usuario(String dni, String usuario, String password, String cuil, String sexo, String fechaNac, String direc,
			String localidad, String provincia, String mail, String telefono, boolean activo) {
		super();
		this.dni = dni;
		this.usuario = usuario;
		this.password = password;
		this.cuil = cuil;
		this.sexo = sexo;
		this.fechaNac = fechaNac;
		this.direc = direc;
		this.localidad = localidad;
		this.provincia = provincia;
		this.mail = mail;
		this.telefono = telefono;
		this.activo = activo;
	}
	
	//Getters and Setters
	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getCuil() {
		return cuil;
	}

	public void setCuil(String cuil) {
		this.cuil = cuil;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getFechaNac() {
		return fechaNac;
	}

	public void setFechaNac(String fechaNac) {
		this.fechaNac = fechaNac;
	}

	public String getDirec() {
		return direc;
	}

	public void setDirec(String direc) {
		this.direc = direc;
	}

	public String getLocalidad() {
		return localidad;
	}

	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}

	public String getProvincia() {
		return provincia;
	}

	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public boolean isActivo() {
		return activo;
	}

	public void setActivo(boolean activo) {
		this.activo = activo;
	}

	@Override
	public String toString() {
		return "Usuario [dni=" + dni + ", usuario=" + usuario + ", password=" + password + ", cuil=" + cuil + ", sexo="
				+ sexo + ", fechaNac=" + fechaNac + ", direc=" + direc + ", localidad=" + localidad + ", provincia="
				+ provincia + ", mail=" + mail + ", telefono=" + telefono + ", activo=" + activo + "]";
	}

	
}
