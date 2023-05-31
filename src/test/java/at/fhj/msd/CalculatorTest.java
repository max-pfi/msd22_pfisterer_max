package at.fhj.msd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    Calculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }

    @DisplayName("Testing add() with two positive numbers")
    @Test
    void testAddPositiveNumbers() {
        assertEquals(8, calculator.add(2,6));
    }

    @DisplayName("Testing add() with negative and positive number")
    @Test
    void testAddPositiveAndNegativeNumber() {
        assertEquals(2, calculator.add(-4,6));
    }

    @DisplayName("Testing add() with two negative numbers")
    @Test
    void testAddNegativeNumbers() {
        assertEquals(-6, calculator.add(-4,-2));
    }

    @DisplayName("Testing minus() with two positive numbers")
    @Test
    void testMinusPositiveNumbers() {
        assertEquals(-3, calculator.minus(3,6));
    }

    @DisplayName("Testing minus() with negative and positive number")
    @Test
    void testMinusPositiveAndNegativeNumber() {
        assertEquals(-10, calculator.minus(-4,6));
    }

    @DisplayName("Testing minus() with two negative numbers")
    @Test
    void testMinusNegativeNumbers() {
        assertEquals(2, calculator.minus(-4,-6));
    }

    @DisplayName("Testing multiply() by 0")
    @Test
    void testMultiplyZero() {
        assertEquals(0, calculator.multiply(10,0));
    }

    @DisplayName("Testing multiply() with positive numbers")
    @Test
    void testMultiplyPositiveNumbers() {
        assertEquals(30, calculator.multiply(5,6));
    }

    @DisplayName("Testing multiply() with positive and negative number")
    @Test
    void testMultiplyNegativeAndPositiveNumber() {
        assertEquals(-30, calculator.multiply(5,-6));
    }


    @DisplayName("Testing divide() with numerator 0")
    @Test
    void testDivideNumeratorZero() {
        assertEquals(0, calculator.divide(0,6));
    }


    @DisplayName("Testing divide() with denominator 0")
    @Test
    void testDivideDenominatorZero() {
        Assertions.assertThrows(ArithmeticException.class, () -> calculator.divide(6,0));
    }

    @DisplayName("Testing divide() with one negative number")
    @Test
    void testDivideNegativeAndPositiveNumber() {
        assertEquals(-2, calculator.divide(-12,6));
    }

    @DisplayName("Testing factorial() with 0")
    @Test
    void testFactorialWithZero() {
        assertEquals(1, calculator.factorial(0));
    }

    @DisplayName("Testing factorial() with positive number")
    @Test
    void testFactorialWithPositiveNumber() {
        assertEquals(120, calculator.factorial(5));
    }

    @DisplayName("Testing factorial() with number one as input")
    @Test
    void testFactorialWithOne() {
        assertEquals(1, calculator.factorial(1));
    }








}
