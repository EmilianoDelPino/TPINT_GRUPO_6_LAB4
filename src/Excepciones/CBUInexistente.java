package Excepciones;

public class CBUInexistente extends RuntimeException {


	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public String getMessage() {
		return "El CBU ingresado no existe";
	}
	
}
