package dominio;

public class Movimiento {
	
	private int idMov;
	private String numero;
	private int tipoMovimiento;
	private String fecha;
	private String detalle;
	private double importe;
	
	//Constructor
	public Movimiento()
	{}
	
	public Movimiento(int idMov, String numero, int tipoMovimiento, String fecha, String detalle, double importe) {
		super();
		this.idMov = idMov;
		this.numero = numero;
		this.tipoMovimiento = tipoMovimiento;
		this.fecha = fecha;
		this.detalle = detalle;
		this.importe = importe;
	}

	@Override
	public String toString() {
		return "Movimiento: idMov=" + idMov + ", numero=" + numero + ", tipo=" + tipoMovimiento + ", fecha=" + fecha
				+ ", detalle=" + detalle + ", importe=" + importe;
	}
	
	//Getters & Setters
	public int getIdMov() {
		return idMov;
	}
	public void setIdMov(int idMov) {
		this.idMov = idMov;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public int getTipo() {
		return tipoMovimiento;
	}
	public void setTipo(int tipoMovimiento) {
		this.tipoMovimiento = tipoMovimiento;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	public String getDetalle() {
		return detalle;
	}
	public void setDetalle(String detalle) {
		this.detalle = detalle;
	}
	public double getImporte() {
		return importe;
	}
	public void setImporte(double importe) {
		this.importe = importe;
	}
}
