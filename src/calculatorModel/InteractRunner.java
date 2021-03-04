package calculatorModel;
import java.util.Scanner;
public class InteractRunner {
	private int number1,number2;
	private Calculator calc;
	private boolean start=true;
	private boolean resultIsEmpty=true;
	InteractRunner(Calculator calc){this.calc=calc;}
	public static void main(String[] args) {
				
		InteractRunner ir = new InteractRunner(new Calculator());
		ir.CalculatorAtWork();
					
	}

	public void CalculatorAtWork() {
		Scanner scan = new Scanner(System.in);
		while (isStart()) {
			int operation = inputOperation(scan);
			if (operation>=1 && operation<=4) {
				setNumber1(inputNumber(scan)); 
				setNumber2(inputNumber(scan)); 
				calcMethod(operation,calc);
			}
			if (operation==5 ){
				System.out.println("Operation = 5");
				resultIsEmpty=false;
				System.out.println(resultIsEmpty);
				int operationId=inputOperation(scan);
				setNumber1((int) calc.getResult());
				setNumber2(inputNumber(scan));
				calcMethod(operationId,calc);
			
			}
			if (operation==7) {
				start=false;
			}
		}
	}
	
	
	public boolean isStart() {return start;	}
	public void setStart(boolean start) {this.start = start;}

	public int getNumber1() {return number1;}
	public void setNumber1(int number1) {this.number1 = number1;}
	public int getNumber2() {return number2;}
	public void setNumber2(int number2) {this.number2 = number2;}



	public void calcMethod(int operationId,Calculator calc) {
		
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
		System.out.println("Выберите операцию");
		int choice=0;
		if (resultIsEmpty) {System.out.println("1.(+) 2.(-) 3.(x) 4.(/) \n5.Операция с предыдущим результатом \n6.Обнулить \n7.Выход из калькулятора");}
		if (!resultIsEmpty) {System.out.println("1.(+) 2.(-) 3.(x) 4.(/) \n6.Обнулить \n7.Выход из калькулятора");}
			while (scan.hasNext()) {
				if (scan.hasNextInt()) {
					choice=scan.nextInt();
					if (choice>=1 && choice<=7) {
						break;
					}
				}
				else System.out.println("Введено некорректное значение");
			scan.nextLine();	
			}
		
		
		switch (choice) {
		case 1: System.out.println("Операция сложение");
			break;
		case 2: System.out.println("Операция вычитание");
		break;
		case 3: System.out.println("Операция умножение");
		break;
		case 4: System.out.println("Операция деление");
		break;
		case 5: System.out.println("Предыдущий результат:" + calc.getResult());
			resultIsEmpty=false;
		break;
		case 6: System.out.println("Обнуление");
				calc.clearResult();
		break;
		case 7: System.out.println("Выход из калькулятора");
		break;
			
		}
		
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
	

