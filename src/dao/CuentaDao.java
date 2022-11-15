package dao;

import java.util.ArrayList;
import dominio.Cuenta;

public interface CuentaDao {

	public int eliminarCuenta(String num_cuenta);

	public int agregarCuenta(Cuenta cuenta);

	public ArrayList<Cuenta> obtenerCuentas();
	
	public ArrayList<Cuenta> obtenerCuentasDeUser(String dni);

	public Cuenta obtenerUnaCuenta(String num_cuenta);
	
}