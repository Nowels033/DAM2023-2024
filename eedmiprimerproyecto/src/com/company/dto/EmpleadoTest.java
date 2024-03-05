package Retos;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class EmpleadoTest {

//	@Test
//	void testCalculaSalarioBrutoTipo1() {
//		Empleado empleado = new Empleado();
//		float salarioBruto = empleado.calculaSalarioBruto(1, 1000, 20);
//		assertEquals(1500, salarioBruto);
//	}
//}
//
//	@Test
//	void testCalculaSalarioBrutoTipo2() {
//		Empleado empleado = new Empleado();
//		float salarioBruto = empleado.calculaSalarioBruto(2, 1200, 10);
//		assertEquals(1900, salarioBruto);
//	}
//	}

//	@Test
//	void testCalculaSalarioBrutoDatosInvalidos() {
//		Empleado empleado = new Empleado();
//		assertThrows(IllegalArgumentException.class, () -> {
//			empleado.calculaSalarioBruto(3, 500, 5);
//		});
//	}
//
//	// (Tests para calculaSalarioBruto)
//
//	@Test
//	void testCalculaSalarioNetoMenorA1000() {
//		Empleado empleado = new Empleado();
//		float salarioNeto = empleado.calculaSalarioNeto(800);
//		assertEquals(800, salarioNeto);
//	}
//
//	@Test
//	void testCalculaSalarioNetoEntre1000Y1500() {
//		Empleado empleado = new Empleado();
//		float salarioNeto = empleado.calculaSalarioNeto(1200);
//		assertEquals(1008.0, salarioNeto);
//	}
//}
//
	@Test
	void testCalculaSalarioNetoMayorA1500() {
		Empleado empleado = new Empleado();
		float salarioNeto = empleado.calculaSalarioNeto(1600);
		assertEquals(1458, salarioNeto);
	}
}
//
//	@Test
//	void testCalculaSalarioNetoDatosInvalidos() {
//		Empleado empleado = new Empleado();
//		assertThrows(IllegalArgumentException.class, () -> {
//			empleado.calculaSalarioNeto(-500);
//		});
//	}
//}
