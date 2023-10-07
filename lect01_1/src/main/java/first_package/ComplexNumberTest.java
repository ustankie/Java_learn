package first_package;

public class ComplexNumberTest {
    public static void main(String[]args){
        int real=3;
        double imaginary=3.0;

        ComplexNumber number1=new ComplexNumber(real,imaginary);
        ComplexNumber number2=new ComplexNumber(4, 2);

        ComplexNumber number3=number1.add(number2);

        number3.print_compl();
        System.out.println( number3.mod());

        String message=imaginary==0 ? "rzeczywista" :"zespolona";

        System.out.println(message);

    }
}
