package Excepciones;

public class UsuarioExistente extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "Usuario ya existente";
	}
	
}
