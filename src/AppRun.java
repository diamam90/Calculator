import calculatorModel.Calculator;
import calculatorModel.ConsoleUI;
import calculatorModel.InteractRunner;

public class AppRun {
    public static void main(String[] args) {
        InteractRunner ir = new InteractRunner(new Calculator(),new ConsoleUI());
        ir.CalculatorAtWork();

    }
}
