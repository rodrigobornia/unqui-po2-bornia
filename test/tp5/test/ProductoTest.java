package tp5.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import tp5.Producto;

class ProductoTest {
	
	private Producto arroz ;
	@BeforeEach
	void setUp() throws Exception {
		arroz = new Producto("Arroz", 1000, 90000);
	}
 	@Test
	void incrementarStock() {
		arroz.incrementarStock(200);
		assertEquals(1200, arroz.getStock());
	}
 	void disminuirStock() {
		arroz.disminuirStock(200);
		assertEquals(800, arroz.getStock());
	}
 	@Test
	void getPrecio() {
		assertEquals(90000, arroz.getPrecio());
	}
	
	@Test
	void hayStockTest() {
		assertTrue(arroz.hayStock(100));
	}
	
	@Test
	void noHayStockTest() {
		assertFalse(arroz.hayStock(2000));
	}
}
