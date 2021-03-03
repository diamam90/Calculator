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
		System.out.println("�������� �������� ������������");
		System.out.println("1 - �������� \n2 - ��������� \n3 - ��������� \n4 - ������� \n5 - ���������� �������� � ���������� ����������� \n6 - �������� \n7 - ����� �� ������������");
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
		System.out.println("�� �������: " +choice);
		return choice;
	}
		
	public int inputNumber(Scanner scan) {
		System.out.println("������� ����� �����");
		int number=0;
		while (scan.hasNext()) {
			if (scan.hasNextInt()) {
				number=scan.nextInt();
				break;
			}
		scan.nextLine();
		}
		System.out.println("��������� �����: " + number);
		return number;
	}
	

	}
	

