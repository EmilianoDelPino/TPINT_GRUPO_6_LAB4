package dao;

import java.util.ArrayList;

import dominio.Usuario;

public interface UsuarioDao {

	public int eliminarUsuario(String dni);

	public int agregarUsuario(Usuario usuario);

	public ArrayList<Usuario> obtenerUsuarios();

	public Usuario obtenerUnUsuario(String dni);
	
}
