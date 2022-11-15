package Excepciones;

public class LoginIncorrecto extends RuntimeException{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public String getMessage(){
		return "Usuario y/o contraseña incorrectos";
	}
}
