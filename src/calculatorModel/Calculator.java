package calculatorModel;

public class Calculator<T extends Number> {
	private double result;

	public double addition(int a, int b) {
		result = a + b;
		System.out.println("��������� �������� ����� "+a+" � "+b+ " : "+result);
		return result;
	}

	public double subtraction(int a, int b) {
		result = a - b;
		System.out.println("��������� ��������� ����� "+a+" � "+b+ " : "+result);
		return result;
	}

	public double division(int a, int b) {
		if (b != 0) {
			result = a / b;
			System.out.println("��������� ������� ����� "+a+" � "+b+ " : "+result);
			return result;
		} else {
			System.out.println("�� ���� ������ ������!");
			return -1;
		}
	}

	public double multiplication(int a, int b) {
		result = a * b;
		System.out.println("��������� ��������� ����� "+a+" � "+b+ " : "+result);
		return result;
	}
	public double getResult() {
		return result;
	}
}
