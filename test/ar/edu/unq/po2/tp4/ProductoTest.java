package ar.edu.unq.po2.tp4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class ProductoTest {
	private Producto vino;
	@BeforeEach
	void setUp() throws Exception {
		vino = new Producto("Vino",  8);
		
	}

	@Test
	void test() {
		assertEquals(8, vino.getPrecio());
	}
	public void testConstructor() {
		
		assertEquals("Vino", vino.getNombre());
		assertEquals(8, vino.getPrecio());
		assertFalse(vino.getEsPrecioCuidado());
	}

}
