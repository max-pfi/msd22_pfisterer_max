package at.fhj.msd;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Calculator {

    private static Logger logger = LogManager.getLogger();


    /**
     * Calculates the summation result of two input numbers and returns it.
     *
     * @author Max Pfisterer
     * @param number1 first input number for calculation
     * @param number2 second input number for calculation
     * @return the result of adding number1 and number2
     */
    public double add(double number1, double number2) {
        logger.debug("add(): Input number 1: " + number1 + ", input number 2: " + number2);
        return number1 + number2;
    }

    /**
     * Calculates the subtraction result of two input numbers and returns it.
     *
     * @author Max Pfisterer
     * @param number1 base number from which something is subtracted
     * @param number2 number which gets subtracted
     * @return the result of subtracting number2 from number1
     */
    public double minus(double number1, double number2) {
        logger.debug("minus(): Input number 1: " + number1 + ", input number 2: " + number2);
        return number1 - number2;
    }

    /**
     * Calculates the division result of two input numbers and returns it.
     *
     * @author Max Pfisterer
     * @param number1 numerator
     * @param number2 denominator
     * @return the result of the division
     * @throws ArithmeticException for division by 0
     */
    public double divide(double number1, double number2) {
        logger.debug("divide(): Input number 1: " + number1 + ", input number 2: " + number2);

        if (number2 == 0) {
            logger.error("division by 0");
            throw new ArithmeticException();
        }
        return number1 / number2;
    }

    /**
     * Calculates the multiplication result of two input numbers and returns it.
     *
     * @author Max Pfisterer
     * @param number1 first input number for multiplication
     * @param number2 second input number for multiplication
     * @return the result of the multiplication
     */
    public double multiply(double number1, double number2) {
        logger.debug("multiply(): Input number 1: " + number1 + ", input number 2: " + number2);
        return number1 * number2;
    }

    /**
     * Calculates the factorial of a given number
     *
     * @author Max Pfisterer
     * @param  number for which the factorial is calculated
     * @return the result
     */
    public long factorial(long number) {
        logger.debug("factorial(): Input number: " + number);

        if (number < 0) {
            return 0;
        } else if (number == 0) {
            return 1;
        }
        int result = 1;
        for (long i = number; i > 1; i--) {
            result *= i;
        }
        return result;

    }


}
