package tp4;

public class ProductoPrimeraNecesidad extends Producto {
	public ProductoPrimeraNecesidad(String nombre, double precio, boolean esPrecioCuidado, double descuento) {
		super(nombre, aplicarDescuento(precio, descuento), esPrecioCuidado);
	}

	private static double aplicarDescuento(double precio, double descuento) {
		return precio-precio*descuento;
	}
}
