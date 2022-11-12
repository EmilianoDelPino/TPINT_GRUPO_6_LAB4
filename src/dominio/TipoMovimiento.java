package dominio;

public class TipoMovimiento {
	private int IdTipoMovimiento;
	private String Descripcion;
	
	//Constructors
	public TipoMovimiento() {}
	
	public TipoMovimiento(int idTipoMovimiento, String descripcion) {
		super();
		IdTipoMovimiento = idTipoMovimiento;
		Descripcion = descripcion;
	}
	
	//Getters and Setters
	public int getIdTipoMovimiento() {
		return IdTipoMovimiento;
	}

	public void setIdTipoMovimiento(int idTipoMovimiento) {
		IdTipoMovimiento = idTipoMovimiento;
	}

	public String getDescripcion() {
		return Descripcion;
	}

	public void setDescripcion(String descripcion) {
		Descripcion = descripcion;
	}
	
	
}
