package ar.edu.unq.po2.tp4;

public class ProductoPrimeraNecesidad extends Producto{
	int precioNecesidad;
	int descuento;
		
	public int precioProductoPrimeraNecesidad(Producto producto) {
		
		return precioNecesidad += producto.getPrecio()  * descuento / 100 ; 
	}
	public ProductoPrimeraNecesidad(String nombre,int precio) {
		super(nombre,precio);
	}
	
	
	//Constructor Punto 2
	public ProductoPrimeraNecesidad(String nombre,int precio, int descuento) {
		super(nombre,precio);
		this.descuento = descuento;
	}
	public int getPrecio() {
		return this.precio - this.descuentoDePrecio();   //En los ejemplos esta hecho asi (Habia puesto override)
	}
	private int descuentoDePrecio() {
		return (precio * descuento) / 100;
	}
}
