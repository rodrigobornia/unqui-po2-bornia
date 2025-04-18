package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
	
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
	}
	/**
	* Verifica la cantidad de pares
	*/
	@Test
	public void testEvenNumbers() {
	// Getting the even occurrences
	int pares = counter.cantidadDePares();
	int impares= counter.cantidadDeImpares();
	int multiltipos = counter.cantidadDeMultiplosDe(2);
	// I check the amount is the expected one
	assertEquals(pares, 1);
	assertEquals(impares, 9);
	assertEquals(multiltipos, 1);
	}
	
	@Test
	public void testStringExpresionNueve() {
		// Se obtiene el valor de ejecutar el metodo
		boolean amount = counter.pruebaDeStringsNueve();
		System.out.println("El valor es " + amount);
		// Se verifica que el resultado es el esperado
		assertEquals(true, amount);
	}
	@Test
	public void testStringExpresionDiez() {
		// Se obtiene el valor de ejecutar el metodo
		boolean amount = counter.pruebaDeStringsDiez();
		System.out.println("El valor es " + amount);
		// Se verifica que el resultado es el esperado
		assertEquals(true, amount);
	}
	
	//Pruebas punto 5
	@Test
	public void testValorPredeterminadoInt() {
		// Se obtiene el valor de ejecutar el metodo
		int amount = counter.getX();
		System.out.println("El valor es " + amount);
		// Se verifica que el resultado es el esperado
		assertEquals(0, amount);
	}
	@Test
	public void testValorPredeterminadoInteger() {
		// Se obtiene el valor de ejecutar el metodo
		Integer amount = counter.getY();
		System.out.println("El valor es " + amount);
		// Se verifica que el resultado es el esperado
		assertEquals(null, amount);
	}
	
	@Test
	public void testValorPredeterminadoIntDos() {
		// Se obtiene el valor de ejecutar el metodo
		Integer amount = counter.getX();
		System.out.println("El valor es " + amount);
		// Se verifica que el resultado es el esperado
		assertEquals(0, amount);
	}
}
