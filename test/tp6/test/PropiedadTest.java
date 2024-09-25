package tp6.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import tp6.Propiedad;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PropiedadTest {

	Propiedad propiedad;
	
	@BeforeEach
	void setUp() throws Exception {
	
		propiedad = new Propiedad("desc", "1224", 100d);
		
	}

	@Test
	void testValorFiscalDeLaPropiedad() {
		assertEquals(propiedad.getValorFiscal(), 100d);
	}

	@Test
	void testDescripcionDeLaPropiedad() {
		assertEquals(propiedad.getDescripcion(), "desc");
	}
	
	@Test
	void testDireccionDeLaPropiedad() {
		assertEquals(propiedad.getDireccion(), "1224");
	}

}
