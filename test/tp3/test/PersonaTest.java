package tp3.test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import ar.edu.unq.po2.tp3.Persona;
import java.time.LocalDate;
import org.junit.jupiter.api.BeforeEach;


class PersonaTestCase {

	Persona persona1;
	Persona persona2;
	LocalDate fecha1;
	LocalDate fecha2;
	
	
	@BeforeEach
	void setUp() throws Exception {
		fecha1 = LocalDate.of(1996, 6, 17);
		fecha2 = LocalDate.of(2002, 2, 15);
		persona1 = new Persona("Nahuel", fecha1);
		persona2 = new Persona("Marcos", fecha2);
		
	}

	@Test
	void testUnaPersonaConoceSuNombre() {
		assertEquals("Nahuel", persona1.getNombre());
	}

	
	@Test
	void testUnaPersonaConoceSuEdad() {
		assertEquals(28, persona1.edad());
	}

	
	@Test
	void testUnaPersonaEsMenorQueLaOtra() {
		assertTrue(persona2.menorQue(persona1));
	}

}