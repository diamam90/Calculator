package calculatorModel;
import java.util.Scanner;
public class InteractRunner {
	private int a,b;
	private int start, end;
	public static void main(String[] args) {
		
		
		InteractRunner ir = new InteractRunner();
		Scanner scan = new Scanner(System.in);
		int operation = ir.inputOperation(scan);
		
		Calculator calc1 = new Calculator();
		
		int number1 = ir.inputNumber(scan);
		int number2 = ir.inputNumber(scan);
		ir.calcMethod(operation, calc1, number1,number2);
	}

	
	
	public void calcMethod(int operationId,Calculator calc,int number1,int number2) {
		
		switch (operationId) {
		case 1: 
			calc.addition(number1, number2);
			break;
		case 2: 
			calc.subtraction(number1, number2);
			break;
		case 3: 
			calc.multiplication(number1, number2);
			break;
		case 4: 
			calc.division(number1, number2);
			break;}
	}
	
	public int inputOperation(Scanner scan) {
		System.out.println("Выберите операцию калькулятора");
		System.out.println("1 - Сложение \n2 - Вычитание \n3 - Умножение \n4 - Деление \n5 - Произвести операцию с полученным результатом \n6 - Очистить \n7 - Выйти из калькулятора");
		int choice=0;
		while (scan.hasNext()) {
			if (scan.hasNextInt()) {
				choice=scan.nextInt();
				if (choice>=1 && choice<=7) {
					break;
				}
			}
		scan.nextLine();	
		}
		System.out.println("Вы выбрали: " +choice);
		return choice;
	}
		
	public int inputNumber(Scanner scan) {
		System.out.println("Введите целое число");
		int number=0;
		while (scan.hasNext()) {
			if (scan.hasNextInt()) {
				number=scan.nextInt();
				break;
			}
		scan.nextLine();
		}
		System.out.println("Введенное число: " + number);
		return number;
	}
	

	}
	

