package dominio;

public class Prestamo {
	private String id; //@ToDo Esta debería ser la PK en la BD
	private String dni;
	private String fecha;
	private Integer plazo; //Que sería el plazo?
	private Integer cuotas;
	private double importeSolicitado;
	private double importeFinal;
	private double importeMes;
	private boolean pagado;
	
	//Constructors
	public Prestamo() {}
	
	public Prestamo(String id, String dni, String fecha, Integer plazo, Integer cuotas, double importeSolicitado,
			double importeFinal, double importeMes, boolean pagado) {
		super();
		this.id = id;
		this.dni = dni;
		this.fecha = fecha;
		this.plazo = plazo;
		this.cuotas = cuotas;
		this.importeSolicitado = importeSolicitado;
		this.importeFinal = importeFinal;
		this.importeMes = importeMes;
		this.pagado = pagado;
	}
	
	@Override
	public String toString() {
		return "Prestamo: id=" + id + ", dni=" + dni + ", fecha=" + fecha + ", plazo=" + plazo + ", cuotas=" + cuotas
				+ ", importeSolicitado=" + importeSolicitado + ", importeFinal=" + importeFinal + ", importeMes="
				+ importeMes + ", pagado=" + pagado;
	}
	//Getters & Setters
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	public Integer getPlazo() {
		return plazo;
	}
	public void setPlazo(Integer plazo) {
		this.plazo = plazo;
	}
	public Integer getCuotas() {
		return cuotas;
	}
	public void setCuotas(Integer cuotas) {
		this.cuotas = cuotas;
	}
	public double getImporteSolicitado() {
		return importeSolicitado;
	}
	public void setImporteSolicitado(double importeSolicitado) {
		this.importeSolicitado = importeSolicitado;
	}
	public double getImporteFinal() {
		return importeFinal;
	}
	public void setImporteFinal(double importeFinal) {
		this.importeFinal = importeFinal;
	}
	public double getImporteMes() {
		return importeMes;
	}
	public void setImporteMes(double importeMes) {
		this.importeMes = importeMes;
	}
	public boolean isPagado() {
		return pagado;
	}
	public void setPagado(boolean pagado) {
		this.pagado = pagado;
	}
	
	
	
	}
