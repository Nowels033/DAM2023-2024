import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class empleadoTest {

	@Test
	void testObtenerSalarioNeto() {
	IRPFBaseService irpfMock = Mockito.mock(IRPFBaseService.class);
	when(irpfMock.calcularIrpf(2000)).thenReturn(100.0);
	empleado empleado = new empleado (1500);
	 double resultado = empleado.obtenerSalarioNeto(500, irpfMock);
	 
	 assertEquals(resultado,1900);
	 
	}

}
