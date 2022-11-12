package dominio;

public class TipoCuenta {
	private int id;
	private String descripción;
	
	
	//Constructors
	public TipoCuenta() {}
	
	public TipoCuenta(int id, String descripción) {
		super();
		this.id = id;
		this.descripción = descripción;
	}
	
	//Getters & Setters
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDescripción() {
		return descripción;
	}
	public void setDescripción(String descripción) {
		this.descripción = descripción;
	}
	
	
}
