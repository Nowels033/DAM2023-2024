package Retos;


import java.util.Scanner;

public class Empleado {
	public static float calculaSalarioBruto(int tipoEmpleado, float ventasMes, float horasExtra) {
        if (tipoEmpleado != 1 && tipoEmpleado != 2 || ventasMes < 0 || horasExtra < 0) {
            throw new IllegalArgumentException("ERROR EN LOS DATOS");
        }

        float salarioBase = (tipoEmpleado == 1) ? 1000 : 1500;
        float prima = (ventasMes <= 1000) ? 100 : 200;
        float salarioHoraExtra = horasExtra * 20;

        return salarioBase + prima + salarioHoraExtra;
    }
    public float calculaSalarioNeto(float salarioBruto) {
        if (salarioBruto < 0) {
            throw new IllegalArgumentException("ERROR EL SALARIO NETO DEBE SER POSITIVO");
        }

        float retencion;
        if (salarioBruto < 1000) {
            retencion = 0;
        } else if (salarioBruto < 1500) {
            retencion = 0.16f;
        } else {
            retencion = 0.19f;
        }

        float salarioNeto = salarioBruto * (1 - retencion);
        return salarioNeto;
    }

}
