import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp3.Counter;


public class CounterTestCase {
	private Counter counter;
	/**
	 * Crea un escenario de test básico, que consiste en un contador
	 * con 10 enteros
	 *
	 * @throws Exception
	 */
	@BeforeEach
	public void setUp() throws Exception {
		//Se crea el contador
		counter = new Counter();
		ArrayList<Integer> arrayTest = new ArrayList<Integer>();
		//Se agregan los numeros. Un solo par y nueve impares
		counter.addNumber(1);
		counter.addNumber(3);
		counter.addNumber(5);
		counter.addNumber(7);
		counter.addNumber(9);
		counter.addNumber(1);
		counter.addNumber(1);
		counter.addNumber(1);
		counter.addNumber(1);
		counter.addNumber(4);
		arrayTest.add(1111); arrayTest.add(2222); arrayTest.add(24688); arrayTest.add(2468888); 
		}
	/**
	* Verifica la cantidad de pares
	*/
	@Test
	public void testCantidadDePares() {
		// Getting the even occurrences
		int amount = counter.cantidadDePares();
		System.out.println("El valor es " + amount);
		// I check the amount is the expected one
		assertEquals(1, amount);
	}
	@Test
	public void testCantidadDeImpares() {
		// Getting the even occurrences
		int amount = counter.cantidadDeImpares();
		System.out.println("El valor es " + amount);
		// I check the amount is the expected one
		assertEquals(9, amount);
	}
	@Test
	public void testLaCantidadDeMultiplos() {
		int amount = counter.esMultiplo(2);
		assertEquals(amount, 1);
	}
	
	//Test del ejercicio 2 Desarmando numeros

	@Test
	public void contadorDeDigitos() {
		assertEquals(6, counter.cantidadDeDigitosDe(123456));
	}


	@Test
	public void mayorCantidadDeParesEntreDosNumeros() {
		assertEquals(2234,counter.numerosConMasParesEntre(1112, 2234));
	}

	@Test
	public void digitoSinPares() {
		Counter desarmar = new Counter();
		int sinPares = desarmar.numerosParesEn(1111);
		assertEquals(0,sinPares);
	}


	@Test
	public void numeroConMasParesEnElArray() {
		assertEquals(2468888, counter.desarmarNumeros(arrayTest));
	}
	
	//Test del ejercicio 3 Múltiplos
	@Test
	public void multiplosEntreDosNumeros() {
		assertEquals(999, counter.multiploEntre(3, 9));
	}
	@Test
	public void sonMultiplos() {
		assertTrue(counter.sonMultiplos(3, 9,999));
	}
}