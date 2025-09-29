package pkg;

public class Calculadora {

	public int suma(int operador1, int operador2) {
		return operador1+operador2;
	}
	
	
	public int resta(int operador1, int operador2) {
		return operador1-operador2;
	}
	
	public int multiplicacion(int operador1, int operador2) {
		return operador1*operador2;
	}
	
	public int division(int operador1, int operador2) {
		if (operador2 == 0) {
			return 0;
		}
		return operador1/operador2;
	}
}
