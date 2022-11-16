package dominio;

import java.time.LocalDate;

public class Usuario {
	private String dni; //@ToDo Esta debería ser la PK en la BD para utilizar como FK en las tablas de CUENTAS y PRESTAMOS. Emi.
	private String usuario;
	private String password;
	private String nombre;
	private String apellido;
	private String cuil;
	private char sexo;
	private LocalDate fechaNac;
	private String direc;
	private String nacionalidad;
	private String localidad;
	private String provincia;
	private String mail;
	private String telefono;
	private Integer activo; //Este campo se usará para hacer la baja lógica en la BD.
	private Integer admin;
	
	//Constructors
	
	public Usuario() {}
	

	public Usuario(String dni, String usuario, String password, String nombre, String apellido, String cuil,
			char sexo, LocalDate fechaNac, String direc, String nacionalidad, String localidad, String provincia,
			String mail, String telefono, Integer activo, Integer admin) {
		super();
		this.dni = dni;
		this.usuario = usuario;
		this.password = password;
		this.nombre = nombre;
		this.apellido = apellido;
		this.cuil = cuil;
		this.sexo = sexo;
		this.fechaNac = fechaNac;
		this.direc = direc;
		this.nacionalidad = nacionalidad;
		this.localidad = localidad;
		this.provincia = provincia;
		this.mail = mail;
		this.telefono = telefono;
		this.activo = activo;
		this.admin = admin;
	}

	public Integer getActivo() {
		return activo;
	}


	public void setActivo(Integer activo) {
		this.activo = activo;
	}


	public Integer getAdmin() {
		return admin;
	}


	public void setAdmin(Integer admin) {
		this.admin = admin;
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


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getApellido() {
		return apellido;
	}


	public void setApellido(String apellido) {
		this.apellido = apellido;
	}


	public String getCuil() {
		return cuil;
	}


	public void setCuil(String cuil) {
		this.cuil = cuil;
	}


	public char getSexo() {
		return sexo;
	}


	public void setSexo(char string) {
		this.sexo = string;
	}


	public LocalDate getFechaNac() {
		return fechaNac;
	}


	public void setFechaNac(LocalDate date) {
		this.fechaNac = date;
	}


	public String getDirec() {
		return direc;
	}


	public void setDirec(String direc) {
		this.direc = direc;
	}


	public String getNacionalidad() {
		return nacionalidad;
	}


	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
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


	@Override
	public String toString() {
		return "Usuario: dni=" + dni + ", usuario=" + usuario + ", password=" + password + ", nombre=" + nombre
				+ ", apellido=" + apellido + ", cuil=" + cuil + ", sexo=" + sexo + ", fechaNac=" + fechaNac + ", direc="
				+ direc + ", nacionalidad=" + nacionalidad + ", localidad=" + localidad + ", provincia=" + provincia
				+ ", mail=" + mail + ", telefono=" + telefono + ", activo=" + activo + ", admin=" + admin;
	}


	
}
