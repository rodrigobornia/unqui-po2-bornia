package tp4.test;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import tp4.ProductoPrimeraNecesidad;

public class ProductoPrimeraNecesidadTest {

	private ProductoPrimeraNecesidad leche;
	
	@BeforeEach
	public void setUp() {
		leche = new ProductoPrimeraNecesidad("Leche", 8d, false, 0.11d);
	}
	
	@Test
	public void testCalcularPrecio() {
		assertEquals(new Double(7.12), leche.getPrecio());
	}
}