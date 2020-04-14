package ufps.com.model;

import java.sql.SQLException;

import ufps.com.util.Conexion;

public class EmpleadoDao {
	Conexion con = null;
	
	public EmpleadoDao() {
		con = Conexion.getConexion();
		
	}
	public void insertar(Empleado empleado) {
		String sql= "INSERT INTO empleado(codigo,cedula,nombre,fechanacimiento,fechaingreso,fecharetiro)"+"VALUES ('"+empleado.getCodigo()+"', '"+empleado.getCedula()+"', '"+empleado.getNombre()+"', '"+empleado.getFechaNacimiento()+"', '"+empleado.getFechaIngreso()+"','"+empleado.getFechaRetiro()+"')";
		try {
			con.insert(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
