package calculatorModel;

public class Calculator<T extends Number> {
	private double result;

	public double addition(int a, int b) {
		return result = a + b;
	}

	public double subtraction(int a, int b) {
		return result = a - b;
	}

	public double division(int a, int b) {
		if (b != 0) {
			return result = a / b;
		} else {
			System.out.println("На ноль делить нельзя!");
			return -1;
		}
	}

	public double multiplication(int a, int b) {
		return result = a * b;
	}

}
