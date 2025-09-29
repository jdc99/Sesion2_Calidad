/**
 * 
 */
package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import pkg.Calculadora;

/**
 * 
 */
class CalculadoraTest {

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("Before all");
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("After all");
	}

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	void setUp() throws Exception {
		System.out.println("Before each");
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterEach
	void tearDown() throws Exception {
		System.out.println("After each");
	}

	/**
	 * Test method for {@link pkg.Calculadora#suma(int, int)}.
	 */
	@Test
	void testSuma() {
		int valorEsperado = 3;
		int valorReal = Calculadora.suma(1, 2);
		
		assertEquals(valorEsperado, valorReal);
	}

	/**
	 * Test method for {@link pkg.Calculadora#resta(int, int)}.
	 */
	@Test
	void testResta() {
		int valorEsperado = 3;
		int valorReal = Calculadora.resta(5,2);
		
		assertEquals(valorEsperado, valorReal);
	}

	/**
	 * Test method for {@link pkg.Calculadora#multiplicacion(int, int)}.
	 */
	@Test
	void testMultiplicacion() {
		int valorEsperado = 3;
		int valorReal = Calculadora.multiplicacion(1, 3);
		
		assertEquals(valorEsperado, valorReal);
	}

	/**
	 * Test method for {@link pkg.Calculadora#division(int, int)}.
	 */
	@Test
	void testDivision() {
		int valorEsperado = 3;
		int valorReal = Calculadora.division(6, 2);
		
		assertEquals(valorEsperado, valorReal);
	}

	/**
	 * Test method for {@link pkg.Calculadora#division(int, int)}.
	 */
	@Test
	void testDivisionPorCero() {
		int valorEsperado = -1;
		int valorReal = Calculadora.division(6, 0);
		
		assertEquals(valorEsperado, valorReal);
	}
}
