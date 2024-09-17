package tp5;

public class ProductoCooperativa extends Producto{

	public ProductoCooperativa(String nombre, int stock, int precio) {
		super(nombre, stock, aplicarDescuento(precio));
		
	}
	private static int aplicarDescuento(int precio) {
		return precio-(precio*10/100);
	}
	
}
