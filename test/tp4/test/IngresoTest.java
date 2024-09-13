package tp4.test;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import tp4.Ingreso;

class IngresoTest {

	Ingreso ingreso;
	
	@BeforeEach
	void setUp() throws Exception {
		ingreso = new Ingreso(LocalDate.now(), "Concepto 1", 20d);
	}

	@Test
	void testConstructorIngreso() {
		assertEquals(LocalDate.now().getMonthValue(), ingreso.getMesDePercepcion().getMonthValue());
		assertEquals("Concepto 1", ingreso.getConcepto());
		assertEquals(20d, ingreso.montoPercibido());
	}
	
	@Test
	void testUnIngresoConoceSuMontoImponible() {
		assertEquals(ingreso.montoPercibido(), ingreso.montoImponible());
	}

}
