package ar.edu.unq.po2.tp4;

import java.util.ArrayList;
import java.util.List;

public class Supermercado {
	List<Producto> productos  = new ArrayList<Producto> ();
	String nombreS;
	String direccion;
	
	public int cantidadDeProductos() {
		return productos.size();
	 	}
	public double getSumaTotalDePrecios() {
			
			double sumatoriaDePrecios = this.getProductos().stream()
									 .mapToDouble(producto -> producto.getPrecio())
									 .sum();
			return sumatoriaDePrecios;
		}
	//
	public List<Producto> getProductos() {
		return productos;
	}
	public void setProductos(List<Producto> productos) {
		this.productos = productos;
	}
	//
	public String getNombreS() {
		return nombreS;
	}
	public void setNombreS(String nombreS) {
		this.nombreS = nombreS;
	}
	//
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
}
