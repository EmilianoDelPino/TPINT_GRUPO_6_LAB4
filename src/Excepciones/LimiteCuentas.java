package Excepciones;

public class LimiteCuentas extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public String getMessage() {
		return "El cliente lleg� al limite de 3 (tres) cuentas";
	}
	
}
