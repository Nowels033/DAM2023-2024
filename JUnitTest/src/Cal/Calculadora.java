package Cal;

public class Calculadora {
	int num1;
	int num2;
	
	public Calculadora(int a, int b) {
		num1=a;
		num2=b;
	}
	public int sumar() {
		return num1 + num2;
	}
	
	public int resta() {
		return num1 - num2;
	}
	public int multiplicar() {
		return num1 * num2;
	}
	public int dividir() {
		return num1 / num2;
	}

}
