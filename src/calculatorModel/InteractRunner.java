package calculatorModel;
import java.util.Scanner;
public class InteractRunner {
	private int a,b;
	private Calculator calc;
	private int start, end;
	public static void main(String[] args) {
		
		
		InteractRunner ir = new InteractRunner();
		ir.calc = new Calculator();
		Scanner scan = new Scanner(System.in);
		int operation = ir.inputOperation(scan);
		if (operation>=1 && operation<=4) {
			int number1 = ir.inputNumber(scan);
			int number2 = ir.inputNumber(scan);
			ir.calcMethod(operation, number1,number2);
		}
		else if (operation==5){
			int number1=(int) ir.calc.getResult();
			int number2 = ir.inputNumber(scan);
			int operationId=ir.inputOperation(scan);
			ir.calcMethod(operationId, number1, number2);
		}
			
	}

	
	
	public void calcMethod(int operationId,int number1,int number2) {
		
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
		
		switch (choice) {
		case 1: System.out.println("�������� ��������");
			break;
		case 2: System.out.println("�������� ���������");
		break;
		case 3: System.out.println("�������� ���������");
		break;
		case 4: System.out.println("�������� �������");
		break;
		case 5: System.out.println("�������� � ���������� �����������");
		break;
		case 6: System.out.println("���������");
		break;
		case 7: System.out.println("���������� ������������");
		break;
			
		}
		
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
	

