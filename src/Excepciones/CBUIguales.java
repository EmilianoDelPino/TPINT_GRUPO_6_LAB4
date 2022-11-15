package Excepciones;

public class CBUIguales extends RuntimeException {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public String getMessage() {
		return "No se puede hacer una transferencia entre dos mismas cuentas.";
	}
}
