package Retos;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class EmpleadoTest2 {

	@Test
	void testCalculaSalarioBruto() {
		int salarioEsperado = 1100;
		double empleado=Empleado.calculaSalarioBruto(1, 0, 0);
		assertEquals(salarioEsperado, empleado);
		
	}

//	@Test
//	void testCalculaSalarioNeto() {
//		fail("No implementado aun");
//	}

}
