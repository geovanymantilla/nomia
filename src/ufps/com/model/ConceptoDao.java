package ufps.com.model;

import java.sql.SQLException;

import ufps.com.util.Conexion;

public class ConceptoDao {
Conexion con = null;
	
	public ConceptoDao() {
		con = Conexion.getConexion();
		
	}
	public void insertar(Concepto concepto) {
		String sql= "INSERT INTO concepto(codigo,descripcion,tipo,codtercero)"+"VALUES ('"+concepto.getCodigo()+"', '"+concepto.getDescripcion()+"', '"+concepto.getTipo()+"', '"+concepto.getCodigotercero()+"')";
		try {
			con.insert(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
