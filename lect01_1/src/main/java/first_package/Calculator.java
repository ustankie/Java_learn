package first_package;

public class Calculator {
    private final String[] inputValues;
    public Calculator(String[] inputValues){
        this.inputValues=inputValues;
    }

    public double calculate(){
        if (inputValues.length<2){
            return 0;
        }

        String operator=inputValues[0];

        if(operator.equals("/")){
            for(String val: inputValues){
                if (val.equals("0")){
                    return 0;
                }
            }
        }
        double result=Integer.parseInt(inputValues[1]);

        for(int i=2;i<inputValues.length;i++){
            int num=Integer.parseInt(inputValues[i]);

            switch (operator){
                case "+"-> result+=num;
                case "*" -> result*=num;
                case "-" -> result-=num;
                case "/" -> result/=num;
            }
        }

        return result;
    }

    public void printValues(){
        for(String val : inputValues){
            System.out.println(val);
        }

    }
}
