package debug;

import daoImpl.UsuarioDaoImpl;
import dominio.Usuario;

public class debugger {

	public static void main(String[] args) {
		
		
		UsuarioDaoImpl x = new UsuarioDaoImpl();
		
		x.eliminarUsuario("11234");
	}

}
