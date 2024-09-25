package tp6.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import tp6.Cliente;
import tp6.Propiedad;
import tp6.SolicitudCreditoPersonal;
import tp6.SolicitudDeCredito;
import tp6.SolicitudDeCreditoHipotecario;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SolicitudDeCreditoTest {

	SolicitudDeCredito creditoPersonal, creditoHipotecario;
	Cliente cliente;
	Propiedad propiedad;
	@BeforeEach
	void setUp() throws Exception {
	
		cliente = new Cliente("Marcos", "1243", 23, 403d, 30d);
		creditoPersonal = new SolicitudCreditoPersonal(cliente, 20d, 3);
		creditoHipotecario = new SolicitudDeCreditoHipotecario(cliente, 30d, 4, propiedad);
	}

	@Test
	void testCreditoPersonalNoAceptable() {
		assertFalse(creditoPersonal.esAceptable());
	}
	
	@Test
	void testCreditoPersonalAceptable() {
		cliente = new Cliente("Marcos", "1243", 23, 200000d, 16000d);
		creditoPersonal = new SolicitudCreditoPersonal(cliente, 20d, 3);
		assertTrue(creditoPersonal.esAceptable());
	}
	
	@Test
	void testCreditoHipotecarioNoAceptable() {
		assertFalse(creditoHipotecario.esAceptable());
	}
	
	@Test
	void testCreditoHipotecarioAceptable() {
		propiedad = new Propiedad("desc", "1224", 20d);
		cliente = new Cliente("Marcos", "1243", 23, 43d, 50d);
		creditoHipotecario = new SolicitudDeCreditoHipotecario(cliente, 10d, 4, propiedad);
		assertTrue(creditoHipotecario.esAceptable());
	}
}
