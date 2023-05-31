package at.fhj.msd;

public class Calculator {


    public double add(double number1, double number2){
        return number1 + number2;
    }

    public double minus(double number1, double number2){
        return number1 - number2;
    }

    public double divide(double number1, double number2){
        if(number2 == 0) {
            throw new ArithmeticException();
        }
        return number1 / number2;
    }

    public double multiply(double number1, double number2){
        return number1 * number2;
    }

    public long factorial(long number) {

        if(number < 0) {
            return 0;
        } else if(number == 0) {
            return 1;
        }
        int result = 1;
        for(long i = number; i > 1; i --) {
            result *= i;
        }
        return result;

    }


}
