package tp4;

import java.util.ArrayList;
import java.util.List;

public class Supermercado {
	private String nombre;
	private String direccion;
	private List<Producto> productos;
	
	//Constructor
	public Supermercado(String nombre, String direccion) {
		this.nombre=nombre;
		this.direccion=direccion;
		productos = new ArrayList<Producto>();
	}
	public Integer getCantidadDeProductos() {
		return this.productos.size();
	}
	public void agregarProducto(Producto producto) {
		this.productos.add(producto);
	}

	public Double getPrecioTotal() {
		return this.productos.stream().mapToDouble(Producto::getPrecio).sum();
	}
	
}
