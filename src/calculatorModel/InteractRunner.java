package calculatorModel;
import java.util.Scanner;
public class InteractRunner {
	private int number1,number2;
	private Calculator calc;
	private boolean start=true;
	private boolean hasResult =false;
	private boolean chosenPrevOp =false;
	private UI ui;

	public InteractRunner(Calculator calc, UI ui){
		this.calc=calc;
		this.ui=ui;}

	public void CalculatorAtWork() {
		while (isStart()) {
			int operation = inputOperation();
			if (operation==5 && hasResult) {
				if (!chosenPrevOp) {
					chosenPrevOp = true;
					continue;
				}
				else {
					System.out.println("Данная операция недоступна.");
					continue;
				}
			}
			if (operation ==5 && !hasResult){
				System.out.println("Данная операция недоступна.");
						//operation = inputOperation(scan);
						continue;
			}

			if (operation==6) {
				calc.clearResult();
				hasResult =false;
				continue;
			}
			if ((operation>=1 && operation <=4) && (!chosenPrevOp | !hasResult) ){
				System.out.println("Введите первое число:");
				number1=ui.read();
				System.out.println("Введите второе число:");
				number2=ui.read();
				calcMethod(operation);
				hasResult =true;
				continue;
				
			}
			if (operation>=1 && operation <=4 && chosenPrevOp){
				System.out.println("первое число:" +calc.getResult());
				number1=(int)calc.getResult();
				System.out.println("Введите второе число:");
				number2=ui.read();;
				calcMethod(operation);
				hasResult =true;
				chosenPrevOp=false;
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

	public UI getUi() {
		return ui;
	}

	public void setUi(UI ui) {
		this.ui = ui;
	}

	public void calcMethod(int operationId) {
		
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
	
	public int inputOperation() {
		boolean check=false;
		System.out.println("-----------------");
		System.out.println("Выберите операцию");
		System.out.println("-----------------");
		if (hasResult && !chosenPrevOp) {System.out.println("1.Сложение \n2.Вычитание \n3.Умножение \n4.Деление \n5.Операция с предыдущим результатом \n6.Обнулить \n7.Выход из калькулятора");}
		if (!hasResult | chosenPrevOp) {System.out.println("1.Сложение \n2.Вычитание \n3.Умножение \n4.Деление \n6.Обнулить \n7.Выход из калькулятора");}
		int number=0;
		while (!check) {
			number=ui.read();
			if (number>=1 && number<=7){
					switch (number){
							case 1: System.out.println("Вы выбрали операцию сложение");
							break;
							case 2: System.out.println("Вы выбрали операцию вычитание");
								break;
							case 3: System.out.println("Вы выбрали операцию умножение");
								break;
							case 4: System.out.println("Вы выбрали операцию деление");
								break;
							case 5: System.out.println("Вы выбрали операцию с предыдущим результатом");
								break;
							case 6: System.out.println("Вы выбрали операцию обнуление калькулятора");
								break;
							case 7: System.out.println("Вы выбрали выход из калькулятора");
								break;

						}
						break;
			}
			else System.out.println("Введено некорректное значение");

			}
		return number;
	}
}
	

