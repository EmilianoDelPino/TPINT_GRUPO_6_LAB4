package daoImpl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import dao.UsuarioDao;
import dominio.Usuario;

public class UsuarioDaoImpl implements UsuarioDao{

	private String host = "jdbc:mysql://localhost:3306/";
	private String user = "root";
	private String pass = "root";
	private String dbName = "bdbanco";


	
	public int eliminarUsuario(String dni)
	{
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		int filas=0;
		Connection cn = null;
		try
		{
			cn = DriverManager.getConnection(host+dbName, user,pass);
			Statement st = cn.createStatement();
			String query = "delete from usuarios where dni="+dni;
			filas=st.executeUpdate(query);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return filas;
	}

	
	public int agregarUsuario(Usuario usuario)
	{
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
		int filas=0;
		Connection cn = null;
		try
		{
			cn = DriverManager.getConnection(host+dbName, user,pass);
			Statement st = cn.createStatement();
			java.sql.Date sqlDate = java.sql.Date.valueOf( usuario.getFechaNac() );
			String query = "INSERT INTO `bdbanco`.`usuarios` (`dni`, `usuario`, `password`, `nombre`, `apellido`, `cuil`, `sexo`, `fechaNac`, `direc`, `nacionalidad`, `localidad`, `provincia`, `mail`, `telefono`, `activo`, `admin`) "
					+ "		VALUES ('"+usuario.getDni()+"','"+usuario.getUsuario()+"','"+usuario.getPassword()+"','"+usuario.getNombre()+"','"+usuario.getApellido()+"','"+usuario.getCuil()+"','"+usuario.getSexo()+"','"+ sqlDate +"',"
							+ "'"+usuario.getDirec()+"','"+usuario.getNacionalidad()+"','"+usuario.getLocalidad()+"','"+usuario.getProvincia()+"','"+usuario.getMail()+"','"+usuario.getTelefono()+"','"+usuario.getActivo()+"','"+usuario.getAdmin()+"')";
			filas=st.executeUpdate(query);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return filas;
	}
	
	public ArrayList<Usuario> obtenerUsuarios() {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		ArrayList<Usuario> lista = new ArrayList<Usuario>();
		Connection conn = null;
		try{
			conn = DriverManager.getConnection(host + dbName, user, pass);
			Statement st = conn.createStatement();
			
			ResultSet rs = st.executeQuery("SELECT dni,usuario,password,nombre,apellido,cuil,sexo,fechaNac,direc,nacionalidad,localidad,provincia,mail,telefono,activo,admin FROM usuarios");
			
			while(rs.next()){
				
				Usuario usuarioRs = new Usuario();
				usuarioRs.setDni("dni");
				usuarioRs.setUsuario(rs.getString("usuario"));
				usuarioRs.setPassword(rs.getString("password"));
				usuarioRs.setNombre(rs.getString("nombre"));
				usuarioRs.setApellido(rs.getString("apellido"));
				usuarioRs.setCuil(rs.getString("cuil"));
				usuarioRs.setSexo(rs.getString("sexo").charAt(0));
				usuarioRs.setFechaNac(rs.getDate("fechaNac").toLocalDate());
				usuarioRs.setDirec(rs.getString("direc"));
				usuarioRs.setNacionalidad(rs.getString("nacionalidad"));
				usuarioRs.setLocalidad(rs.getString("localidad"));
				usuarioRs.setProvincia(rs.getString("provincia"));
				usuarioRs.setMail(rs.getString("mail"));
				usuarioRs.setTelefono(rs.getString("telefono"));
				usuarioRs.setActivo(rs.getInt("activo"));
				usuarioRs.setAdmin(rs.getInt("admin"));
				
				lista.add(usuarioRs);
			}
			conn.close();
		}catch(Exception e){
			e.printStackTrace();
		}finally{
		
		}
		
		return lista;
	}

	
	
	public Usuario obtenerUnUsuario(String dni)
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Usuario usuario = new Usuario();
		Connection con = null;
		try{
			con = DriverManager.getConnection(host + dbName, user, pass);
			PreparedStatement miSentencia = con.prepareStatement("Select * from usuarios where dni = ?");
			miSentencia.setString(1, dni); //Cargo el DNI recibido
			ResultSet resultado = miSentencia.executeQuery();
			resultado.next();
			
			usuario.setDni(resultado.getString(1));
			usuario.setUsuario(resultado.getString(2));
			usuario.setPassword(resultado.getString(3));
			usuario.setNombre(resultado.getString(4));
			usuario.setApellido(resultado.getString(5));
			usuario.setCuil(resultado.getString(6));
			usuario.setSexo(resultado.getString(7).charAt(0));
			usuario.setFechaNac(resultado.getDate(8).toLocalDate());
			usuario.setDirec(resultado.getString(9));
			usuario.setNacionalidad(resultado.getString(10));
			usuario.setLocalidad(resultado.getString(11));
			usuario.setProvincia(resultado.getString(12));
			usuario.setMail(resultado.getString(13));
			usuario.setTelefono(resultado.getString(14));
			usuario.setActivo(resultado.getInt(15));
			usuario.setAdmin(resultado.getInt(16));
		    con.close();
		}
		catch(Exception e)
		{
			System.out.println("Conexion fallida");
		}
		finally
		{
		}
		return usuario;
	}
	
}
