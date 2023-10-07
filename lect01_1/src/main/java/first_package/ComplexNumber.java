package first_package;

public class ComplexNumber {
    private final double real;
    private final double imaginary;

    public ComplexNumber(double real,double imaginary){
        this.real=real;
        this.imaginary=imaginary;
    }

    public ComplexNumber add(ComplexNumber other){
        return new ComplexNumber(this.real+other.real,
                this.imaginary+other.imaginary);
    }

    public double mod(){
        double squareSum=real*real+imaginary*imaginary;
        return Math.sqrt(squareSum);
    }
    public void print_compl(){
        System.out.println(this.real+" "+this.imaginary);
    }
}
