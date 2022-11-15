package Excepciones;

public class CUILInexistente extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "No se ha encontrado el CUIL ingresado";
	}
	
}
