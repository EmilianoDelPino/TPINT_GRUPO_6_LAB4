package debug;



import java.time.LocalDate;

import daoImpl.UsuarioDaoImpl;
import dominio.Usuario;

public class debugger {

	public static void main(String[] args) {
		LocalDate d = LocalDate.now();
		
		int c = 0;
		Usuario usuario = new Usuario();
		usuario.setDni("12345");
		usuario.setUsuario("12345");
		usuario.setPassword("12345");
		usuario.setNombre("12345");
		usuario.setApellido("12345");
		usuario.setCuil("12345");
		usuario.setSexo("m");
		usuario.setFechaNac(d);
		usuario.setDirec("12345");
		usuario.setNacionalidad("12345");
		usuario.setLocalidad("12345");
		usuario.setProvincia("12345");
		usuario.setMail("12345");
		usuario.setTelefono("12345");
		usuario.setActivo(1);
		usuario.setAdmin(1);
		
		UsuarioDaoImpl x = new UsuarioDaoImpl();
		
		c = x.agregarUsuario(usuario);
		
		System.out.println(c);
	}

}
