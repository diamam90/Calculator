package calculatorModel;
import java.util.Scanner;
public class ConsoleUI implements UI{
    Scanner scan = new Scanner(System.in);
    int number;
    public void print(){System.out.println(number);}
    public int read(){
        while (scan.hasNext()){
            if (scan.hasNextInt()) {
                 return number =scan.nextInt();
            }
            else {
                System.out.println("Введено неверное значение. Пожалуйста, введите целое число");
                scan.nextLine();
                continue;}

        }
    return -1;}
}
