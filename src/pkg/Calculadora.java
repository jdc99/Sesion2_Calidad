package pkg;

public class Calculadora {

	public static int suma(int operador1, int operador2) {
		return operador1+operador2;
	}
	
	
	public static int resta(int operador1, int operador2) {
		return operador1-operador2;
	}
	
	public static int multiplicacion(int operador1, int operador2) {
		return operador1*operador2;
	}
	
	public static int division(int operador1, int operador2) {
		if (operador2 == 0) {
			return -1;
		}
		return operador1/operador2;
	}
}
