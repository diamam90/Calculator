package calculatorModel;
import java.util.Scanner;
public class InteractRunner {
	private int number1,number2;
	private Calculator calc;
	private boolean start=true;
	private boolean resultIsEmpty=true;
	private boolean hasPreviousOperation=false;
	InteractRunner(Calculator calc){this.calc=calc;}
	public static void main(String[] args) {
				
		InteractRunner ir = new InteractRunner(new Calculator());
		ir.CalculatorAtWork();
					
	}

	public void CalculatorAtWork() {
		Scanner scan = new Scanner(System.in);
		while (isStart()) {
			int operation = inputOperation(scan);
			if (operation==5) {
				if (hasPreviousOperation) {
					hasPreviousOperation=false;
					continue;
				}
				else {System.out.println("Данная операция недоступна \nВыберите другую операцию");
						operation = inputOperation(scan);					
						continue;
				}
			} 
			if (operation==6) {
				calc.clearResult();
				resultIsEmpty=false;
				continue;
				}
			if (operation>=1 && operation <=4 && !hasPreviousOperation) {
				System.out.println("Введите первое число:");
				number1=inputNumber(scan);
				System.out.println("Введите второе число:");
				number2=inputNumber(scan);
				calcMethod(operation);
				resultIsEmpty=false;
				continue;
				
			}
			if (operation>=1 && operation <=4 && hasPreviousOperation){
				System.out.println("первое число:" +calc.getResult());
				number1=(int)calc.getResult();
				System.out.println("Введите второе число:");
				number2=inputNumber(scan);
				calcMethod(operation);
				resultIsEmpty=true;
				continue;
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

	public void calcMethod(int operationId) {
		
		switch (operationId) {
		case 1: 
			System.out.println("Операция сложение");
			calc.addition(number1, number2);
			break;
		case 2: 
			System.out.println("Операция вычитание");
			calc.subtraction(number1, number2);
			break;
		case 3: 
			System.out.println("Операция умножение");
			calc.multiplication(number1, number2);
			break;
		case 4: 
			System.out.println("Операция деление");
			calc.division(number1, number2);
			break;}
	}
	
	public int inputOperation(Scanner scan) {
		System.out.println("-----------------");
		System.out.println("Выберите операцию");
		System.out.println("-----------------");
		int choice=0;
		if (hasPreviousOperation) {System.out.println("1.Сложение \n2.Вычитание \n3.Умножение \n4.Деление \n5.Операция с предыдущим результатом \n6.Обнулить \n7.Выход из калькулятора");}
		if (!hasPreviousOperation) {System.out.println("1.Сложение \n2.Вычитание \n3.Умножение \n4.Деление \n6.Обнулить \n7.Выход из калькулятора");}
			while (scan.hasNext()) {
				if (scan.hasNextInt()) {
					choice=scan.nextInt();
					if (choice>=1 && choice<=7) {
						break;
					}
					else System.out.println("Выберите одну из операций");
					continue;
				}
				else System.out.println("Введено некорректное значение");
			scan.nextLine();	
			}
		return choice;
	}
	
	public int inputNumber(Scanner scan) {
		int number=0;
		while (scan.hasNext()) {
			if (scan.hasNextInt()) {
				number=scan.nextInt();
				break;
			}
			else System.out.println("Введено некорректное значение");
		scan.nextLine();
		}
		System.out.println("Введенное число: " + number);
		return number;
	}
	

	}
	

