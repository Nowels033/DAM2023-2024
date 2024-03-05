package miprimeraprueba;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculadoraTest {

	@Test
	void testSuma() {
	int resultadoEsperado = 5;
	int resultado= Calculadora.suma(2,3);
	assertEquals(resultadoEsperado,resultado);
	}

}
