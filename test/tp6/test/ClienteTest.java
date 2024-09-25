package tp6.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import tp6.Cliente;

class ClienteTestCase {

	
	Cliente cliente;
	
	@BeforeEach
	void setUp() throws Exception {
	
		cliente = new Cliente("Marcos", "1243", 23, 403d, 30d);
	}

	@Test
	void testConstructorDelCliente() {
		assertEquals(cliente.getEdad(), 23);
		assertEquals(cliente.getSueldoNetoAnual(), 30d);
		assertEquals(cliente.getSueldoNeto(), 403d);
		assertEquals(cliente.getNyAp(), "Marcos");
	}


}
