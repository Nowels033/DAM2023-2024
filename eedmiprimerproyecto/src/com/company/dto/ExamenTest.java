package Retos;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ExamenTest {

	@Test
	void testSumar() {
		int resultadoEsperado = 1000;
		int resultado = Examen.Sumar(5040, 5100);
		assertEquals (resultadoEsperado, resultado);
	}

}
