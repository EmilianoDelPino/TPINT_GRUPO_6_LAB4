package Excepciones;

public class DNIExistente extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "DNI ya existente";
	}
	
}
