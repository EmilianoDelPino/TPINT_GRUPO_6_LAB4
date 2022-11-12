package dominio;

public class Cuotas {
	
	private int IdPrestamo;
	private int NroCuota;
	private boolean Pagado;
	private String FechaDePago;
	private String FechaPagado;
	
	//Constructors
	public Cuotas() {
		
	}

	public Cuotas(int idPrestamo, int nroCuota, boolean pagado, String fechaDePago, String fechaPagado) {
		super();
		IdPrestamo = idPrestamo;
		NroCuota = nroCuota;
		Pagado = pagado;
		FechaDePago = fechaDePago;
		FechaPagado = fechaPagado;
	}
	
	//Getters and Setters
	public int getIdPrestamo() {
		return IdPrestamo;
	}

	public void setIdPrestamo(int idPrestamo) {
		IdPrestamo = idPrestamo;
	}

	public int getNroCuota() {
		return NroCuota;
	}

	public void setNroCuota(int nroCuota) {
		NroCuota = nroCuota;
	}

	public boolean isPagado() {
		return Pagado;
	}

	public void setPagado(boolean pagado) {
		Pagado = pagado;
	}

	public String getFechaDePago() {
		return FechaDePago;
	}

	public void setFechaDePago(String fechaDePago) {
		FechaDePago = fechaDePago;
	}

	public String getFechaPagado() {
		return FechaPagado;
	}

	public void setFechaPagado(String fechaPagado) {
		FechaPagado = fechaPagado;
	}
	@Override
	public String toString() {
		return "Cuotas: IdPrestamo=" + IdPrestamo + ", NroCuota=" + NroCuota + ", Pagado=" + Pagado + ", FechaDePago="
				+ FechaDePago + ", FechaPagado=" + FechaPagado;
	}

	
	
}
