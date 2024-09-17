package tp5;

import java.util.ArrayList;
import java.util.List;

public class Caja {
		private List<Producto> productos =  new ArrayList<Producto>();;
		private int montoAPagar = 0;
		
		public void registrarProducto(Producto producto, int cantidad) {
			if(!producto.hayStock(cantidad)) return;
			productos.add(producto);
			montoAPagar += producto.getPrecio() * cantidad;
			producto.disminuirStock(cantidad);
		}
		
		public int montoAPagar() {
			return this.montoAPagar;
		}
}
