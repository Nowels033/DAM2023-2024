
public class empleado {
	double salario;
	
	empleado(double salario){
		this.salario=salario;
	}
	
	double obtenerSalarioNeto(double extras,IRPFBaseService irpf) {
		double brutoTotal=salario + extras;
		return brutoTotal- irpf.calcularIrpf(brutoTotal);
	}

}
