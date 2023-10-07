package first_package;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calculator=new Calculator(args);

        calculator.printValues();

        double result= calculator.calculate();
        System.out.println(result);
    }
}
