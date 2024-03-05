package Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Cal.Calculadora;

class CalculadoraTest {
	private Calculadora calc;

	@BeforeEach
	public void crearCalculadora() {
		calc =new Calculadora (100,10);
	}
	@BeforeAll
	void borrarCalculadora() {
		calc=null;
	}
	@Test
	void testSumar() {
		Calculadora calc = new Calculadora(100,10);
		int valorEsperado = 110;
		int valorReal=calc.sumar();
		assertEquals (valorEsperado,valorReal);
		
	}

	@Test
	void testResta() {
		Calculadora calc = new Calculadora(100,10);
		int valorEsperado = 90;
		int valorReal=calc.resta();
		assertEquals (valorEsperado,valorReal);
	}

	@Test
	void testMultiplicar() {
		Calculadora calc = new Calculadora(100,10);
		int valorEsperado = 1000;
		int valorReal=calc.multiplicar();
		assertEquals (valorEsperado,valorReal);
	}

	@Test
	void testDividir() {
		Calculadora calc = new Calculadora(100,0);
		int valorEsperado = 10;
		int valorReal=calc.dividir();
		assertEquals (valorEsperado,valorReal);
	}

}
