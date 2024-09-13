package tp4.test;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import tp4.IngresoPorHorasExtras;

class IngresoPorHorasExtraTest {

	//Variable de instancia
	private IngresoPorHorasExtras ingresoPorHorasExtras;
	
	@BeforeEach
	void setUp() throws Exception {
		//Constructor
		ingresoPorHorasExtras = new IngresoPorHorasExtras(LocalDate.now() ,"Horas extras", 1000d, 10);
				// new IngresoPorHorasExtras("Enero","Horas extras",1000d, 10);
	}

	@Test
	void testIngresoPorHorasExtras() {
		assertEquals(0d,ingresoPorHorasExtras.montoImponible());
		
	}
}
