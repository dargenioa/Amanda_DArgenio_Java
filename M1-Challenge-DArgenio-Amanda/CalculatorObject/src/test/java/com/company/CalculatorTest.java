package com.company;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {
    private Calculator calculator;

    @Before
    public void setCalculator() {
        calculator = new Calculator();
    }

    @Test
    public void shouldAddTwoIntsAndReturnSum() {
        assertEquals(2, calculator.add(1, 1));
        assertEquals(1, calculator.add(-1, 2));
        assertEquals(40, calculator.add(10, 30));
        assertEquals(-1, calculator.add(-50, 49));

    }

    @Test
    public void shouldSubtractTwoIntsAndReturnDifference() {
        assertEquals(-29, calculator.subtract(23, 52));
        assertEquals(20, calculator.subtract(35, 15));
        assertEquals(-30, calculator.subtract(20, 50));
        assertEquals(10, calculator.subtract(100, 90));
    }

    @Test
    public void shouldMultiplyTwoIntsAndReturnProduct() {
        assertEquals(68, calculator.multiply(34, 2));
        assertEquals(49, calculator.multiply(7, 7));
        assertEquals(45, calculator.multiply(5, 9));
        assertEquals(2000, calculator.multiply(100, 20));

    }

    @Test
    public void shouldDivideTwoIntsAndReturnQuotient() {
        assertEquals(4, calculator.divide(12, 3));
        assertEquals(1, calculator.divide(12, 7));
        assertEquals(2, calculator.divide(10, 5));
        assertEquals(0, calculator.divide(5, 10));


    }

    @Test
    public void shouldAddTwoDoublesAndReturnSum() {
        assertEquals(5.7, calculator.add(3.4, 2.3), 1);
        assertEquals(14.7, calculator.add(7.4, 7.3), 1);
        assertEquals(11.1, calculator.add(10.1, 1.0), 1);
        assertEquals(20.09, calculator.add(20, .09), 1);


    }

    @Test
    public void shouldSubtractTwoDoublesAndReturnDifference() {
        assertEquals(5.0, calculator.subtract(5.5, .5), 1);
        assertEquals(.01, calculator.subtract(11.01, 11), 1);
        assertEquals(110.0, calculator.subtract(110.05, .5), 1);
        assertEquals(20.1, calculator.subtract(20.11, .01), 1);

    }

    @Test
    public void shouldMultiplyTwoDoublesAndReturnProduct() {
        assertEquals(29.48, calculator.multiply(6.7, 4.4), 1);
        assertEquals(389.05, calculator.multiply(55.5, 7.01), 1);
        assertEquals(633.87, calculator.multiply(35.02, 18.1), 1);
        assertEquals(2477.47, calculator.multiply(50.05, 49.5), 1);

    }

    @Test
    public void shouldDivideTwoDoublesAndReturnQuotient() {
        assertEquals(4.91, calculator.divide(10.8, 2.2), 1);
        assertEquals(7.75, calculator.divide(15.5, 2.0), 1);
        assertEquals(0.50, calculator.divide(20.03, 40.0), 1);
        assertEquals(.90, calculator.divide(81.05, 90.02), 1);
    }

}