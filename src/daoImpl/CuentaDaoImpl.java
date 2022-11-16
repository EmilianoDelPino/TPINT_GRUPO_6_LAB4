package daoImpl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import dao.CuentaDao;
import dominio.Cuenta;

public class CuentaDaoImpl implements CuentaDao{

		private String host = "jdbc:mysql://localhost:3306/";
		private String user = "root";
		private String pass = "admin";
		private String dbName = "bdbanco";


		
		public int eliminarCuenta(String num_cuenta)
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
				String query = "delete from cuentas where numCuenta="+num_cuenta;
				filas=st.executeUpdate(query);
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			return filas;
		}

		
		public int agregarCuenta(Cuenta cuenta)
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
				java.sql.Date sqlDate = java.sql.Date.valueOf( cuenta.getFecha_creacion() );
				String query = "INSERT INTO cuentas (`dni`, `numCuenta`, `cbu`, `fechaCreacion`, `saldo`)" + " VALUES ('"+cuenta.getDni()+"','"+cuenta.getNum_cuenta()+"','"+cuenta.getCbu()+"','"+ sqlDate +"','"+cuenta.getSaldo()+"')";
				filas=st.executeUpdate(query);
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			return filas;
		}
		
		public ArrayList<Cuenta> obtenerCuentas() {

			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			ArrayList<Cuenta> lista = new ArrayList<Cuenta>();
			Connection conn = null;
			try{
				conn = DriverManager.getConnection(host + dbName, user, pass);
				Statement st = conn.createStatement();
				
				ResultSet rs = st.executeQuery("SELECT dni,numCuenta,cbu,fechaCreacion,saldo FROM cuentas");
				
				while(rs.next()){
					
					Cuenta cuenta = new Cuenta();
					cuenta.setDni("dni");
					cuenta.setNum_cuenta(rs.getString("numCuenta"));
					cuenta.setCbu(rs.getString("cbu"));
					cuenta.setFecha_creacion(rs.getDate("fechaCreacion").toLocalDate());
					cuenta.setSaldo(rs.getDouble("saldo"));
					
					lista.add(cuenta);
				}
				conn.close();
			}catch(Exception e){
				e.printStackTrace();
			}finally{
			
			}
			
			return lista;
		}

		
		
		public Cuenta obtenerUnaCuenta(String num_cuenta)
		{
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			Cuenta cuenta = new Cuenta();
			Connection con = null;
			try{
				con = DriverManager.getConnection(host + dbName, user, pass);
				PreparedStatement miSentencia = con.prepareStatement("Select dni,cbu,fechaCreacion,tipo,numCuenta,saldo from cuentas where numCuenta = ?");
				miSentencia.setString(1, num_cuenta);
				ResultSet resultado = miSentencia.executeQuery();
				resultado.next();
				
				cuenta.setDni(resultado.getString(1));
				cuenta.setCbu(resultado.getString(2));
				cuenta.setFecha_creacion(resultado.getDate(3).toLocalDate());
				cuenta.setIdTipoCuenta(resultado.getInt(4));
				cuenta.setNum_cuenta(resultado.getString(5));
				cuenta.setSaldo(resultado.getDouble(6));

			    con.close();
			}
			catch(Exception e)
			{
				System.out.println("Conexion fallida");
			}
			finally
			{
			}
			return cuenta;
		}

		public ArrayList<Cuenta> obtenerCuentasDeUser(String dni) {
			
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			ArrayList<Cuenta> lista = new ArrayList<Cuenta>();
			Connection conn = null;
			try{
				conn = DriverManager.getConnection(host + dbName, user, pass);
				Statement st = conn.createStatement();
				
				ResultSet rs = st.executeQuery("SELECT dni,numCuenta,cbu,fechaCreacion,saldo FROM cuentas");
				
				while(rs.next()){
					
					Cuenta cuenta = new Cuenta();
					cuenta.setDni("dni");
					cuenta.setNum_cuenta(rs.getString("numCuenta"));
					cuenta.setCbu(rs.getString("cbu"));
					cuenta.setFecha_creacion(rs.getDate("fechaCreacion").toLocalDate());
					cuenta.setSaldo(rs.getDouble("saldo"));
					
					lista.add(cuenta);
				}
				conn.close();
			}catch(Exception e){
				e.printStackTrace();
			}finally{
			
			}
			
			return lista;
		}
		
		
		
	}
