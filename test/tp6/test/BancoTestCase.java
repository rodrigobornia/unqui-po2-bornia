package tp6.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import tp6.Banco;
import tp6.Cliente;
import tp6.SolicitudCreditoPersonal;
import tp6.SolicitudDeCredito;

class BancoTestCase {

	Banco banco;	
	Cliente cliente;
	SolicitudDeCredito creditoPersonal;
	
	@BeforeEach
	void setUp() throws Exception {
		cliente = new Cliente("Marcos", "1243", 23, 13d, 30d);
		creditoPersonal = new SolicitudCreditoPersonal(cliente, 20d, 3);
		
		banco = new Banco();
		

	}

	@Test
	void testElBancoAgregaUnCliente() {
		banco.agregarCliente(cliente);
		assertEquals(banco.getClientes().size(), 1);
	}

	@Test
	void testElBancoAgregaUnaSolicitud() {
		cliente = new Cliente("Marcos", "1243", 23, 200000d, 16000d);
		creditoPersonal = new SolicitudCreditoPersonal(cliente, 20d, 3);
		banco.agregarSolicitud(creditoPersonal);
		assertEquals(banco.getSolicitudes().size(), 1);
	}
	
	@Test
	void testElBancoConoceElMontoTotal() {
		cliente = new Cliente("Marcos", "1243", 23, 200000d, 16000d);
		creditoPersonal = new SolicitudCreditoPersonal(cliente, 20d, 3);
		banco.agregarSolicitud(creditoPersonal);
		assertEquals(banco.montoTotal(), 20d);
	}
	

}
