package tp4;

public class Producto {
	private String nombre;
	private double precio;
	private boolean esPrecioCuidado = false;
	
	public Producto(String nombre, double precio) {
		this.nombre= nombre;
		this.precio = precio;
	}
	
	public Producto(String nombre, double precio, boolean esPrecioCuidado) {
		this.nombre= nombre;
		this.precio = precio;
		this.esPrecioCuidado = esPrecioCuidado;
	}
	public String getNombre() {
		return this.nombre;
	}


	public Double getPrecio() {
		return this.precio;
	}


	public Boolean esPrecioCuidado() {
		return this.esPrecioCuidado;
	}


	public void aumentarPrecio(double aumento) {
		this.precio = (this.precio+aumento);
	}
}
