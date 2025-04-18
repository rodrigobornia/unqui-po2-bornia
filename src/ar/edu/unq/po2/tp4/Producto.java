package ar.edu.unq.po2.tp4;

public class Producto {
	String nombre;
	int precio;
	Boolean esPrecioCuidado = false;


	public Producto(String nombre, int precio) {
		super();
		this.nombre = nombre;
		this.precio = precio;
	}
	//
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	//
	public int getPrecio() {
		return precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	//
	public Boolean getEsPrecioCuidado() {
		return esPrecioCuidado;
	}
	public void setEsPrecioCuidado(Boolean esPrecioCuidado) {
		this.esPrecioCuidado = esPrecioCuidado;
	}
	
	
}
