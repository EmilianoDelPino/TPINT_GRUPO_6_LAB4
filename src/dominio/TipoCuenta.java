package dominio;

public class TipoCuenta {
	private int id;
	private String descripci�n;
	
	
	//Constructors
	public TipoCuenta() {}
	
	public TipoCuenta(int id, String descripci�n) {
		super();
		this.id = id;
		this.descripci�n = descripci�n;
	}
	
	//Getters & Setters
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDescripci�n() {
		return descripci�n;
	}
	public void setDescripci�n(String descripci�n) {
		this.descripci�n = descripci�n;
	}
	
	
}
