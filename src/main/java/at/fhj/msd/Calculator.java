package at.fhj.msd;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Calculator {

    private static Logger logger = LogManager.getLogger();


    public double add(double number1, double number2){
        logger.debug("add(): Input number 1: " + number1 + ", input number 2: " + number2);
        return number1 + number2;
    }

    public double minus(double number1, double number2){
        logger.debug("minus(): Input number 1: " + number1 + ", input number 2: " + number2);
        return number1 - number2;
    }

    public double divide(double number1, double number2){
        logger.debug("divide(): Input number 1: " + number1 + ", input number 2: " + number2);

        if(number2 == 0) {
            logger.error("division by 0");
            throw new ArithmeticException();
        }
        return number1 / number2;
    }

    public double multiply(double number1, double number2){
        logger.debug("multiply(): Input number 1: " + number1 + ", input number 2: " + number2);
        return number1 * number2;
    }

    public long factorial(long number) {
        logger.debug("factorial(): Input number: " + number);

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
