package dominio;

public class Moviemiento {
	
	private String numero; //@ToDo Esta debería ser la PK en la BD
	private String tipo;
	private String fecha;
	private String detalle;
	private double importe;
	

	public Moviemiento(String numero, String tipo, String fecha, String detalle, double importe) {
		super();
		this.numero = numero;
		this.tipo = tipo;
		this.fecha = fecha;
		this.detalle = detalle;
		this.importe = importe;
	}
	
	@Override
	public String toString() {
		return "Moviemiento [numero=" + numero + ", tipo=" + tipo + ", fecha=" + fecha + ", detalle=" + detalle
				+ ", importe=" + importe + "]";
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
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
