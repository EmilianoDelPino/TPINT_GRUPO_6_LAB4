package Excepciones;

public class CUILExistente extends RuntimeException{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public CUILExistente() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "CUIL ya existente";
	}

}
