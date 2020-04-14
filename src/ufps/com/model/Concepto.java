package ufps.com.model;

public class Concepto {
	String codigo;
	String descripcion;
	Integer tipo;
	String codigotercero;
	
	public Concepto() {
		super();
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Integer getTipo() {
		return tipo;
	}

	public void setTipo(Integer tipo) {
		this.tipo = tipo;
	}

	public String getCodigotercero() {
		return codigotercero;
	}

	public void setCodigotercero(String codigotercero) {
		this.codigotercero = codigotercero;
	}
	
	

}
