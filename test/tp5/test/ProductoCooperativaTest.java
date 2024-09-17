package tp5.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import tp5.Producto;
import tp5.ProductoCooperativa;

class ProductoCooperativaTest  {
	private Producto arroz;
	
	@BeforeEach
	void setUp() throws Exception {
		arroz = new ProductoCooperativa("Arroz", 1000, 90000);
	}

	@Test
	void getPrecioConDescuento() {
		assertEquals(81000, arroz.getPrecio());
	}

}
