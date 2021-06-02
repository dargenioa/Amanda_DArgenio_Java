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
        assertEquals(2, calculator.addInt(1, 1));
        assertEquals(1, calculator.addInt(-1, 2));
        assertEquals(40, calculator.addInt(10, 30));
        assertEquals(-1, calculator.addInt(-50, 49));

    }

    @Test
    public void shouldSubtractTwoIntsAndReturnDifference() {
        assertEquals(-29, calculator.subtractInt(23, 52));
        assertEquals(20, calculator.subtractInt(35, 15));
        assertEquals(-30, calculator.subtractInt(20, 50));
        assertEquals(10, calculator.subtractInt(100, 90));
    }

    @Test
    public void shouldMultiplyTwoIntsAndReturnProduct() {
        assertEquals(68, calculator.multiplyInt(34, 2));
        assertEquals(49, calculator.multiplyInt(7, 7));
        assertEquals(45, calculator.multiplyInt(5, 9));
        assertEquals(2000, calculator.multiplyInt(100, 20));

    }

    @Test
    public void shouldDivideTwoIntsAndReturnQuotient() {
        assertEquals(4, calculator.divideInt(12, 3));
        assertEquals(1, calculator.divideInt(12, 7));
        assertEquals(2, calculator.divideInt(10, 5));
        assertEquals(0, calculator.divideInt(5, 10));


    }

    @Test
    public void shouldAddTwoDoublesAndReturnSum() {
        assertEquals(6.7, calculator.addDouble(3.4, 2.3), 20);
        assertEquals(14.7, calculator.addDouble(7.4, 7.3), 14);
        assertEquals(11.1, calculator.addDouble(10.1, 1.0), 11);
        assertEquals(20.09, calculator.addDouble(20, .09), 20);


    }

    @Test
    public void shouldSubtractTwoDoublesAndReturnDifference() {
        assertEquals(5.0, calculator.subtractDouble(5.5, .5), 20);
        assertEquals(.01, calculator.subtractDouble(11.01, 11), 11);
        assertEquals(110.0, calculator.subtractDouble(110.05, .5), 110);
        assertEquals(20.1, calculator.subtractDouble(20.11, .01), 20);

    }

    @Test
    public void shouldMultiplyTwoDoublesAndReturnProduct() {
        assertEquals(29.48, calculator.multiplyDouble(6.7, 4.4), 30);
        assertEquals(389.05, calculator.multiplyDouble(55.5, 7.01), 400);
        assertEquals(633.87, calculator.multiplyDouble(35.02, 18.1), 650);
        assertEquals(2477.47, calculator.multiplyDouble(50.05, 49.5), 2500);

    }

    @Test
    public void shouldDivideTwoDoublesAndReturnQuotient() {
        assertEquals(4.63, calculator.divideDouble(10.2, 2.2), 5);
        assertEquals(7.75, calculator.divideDouble(15.5, 2.0), 8);
        assertEquals(0.50, calculator.divideDouble(20.03, 40.0), 1);
        assertEquals(.90, calculator.divideDouble(81.05, 90.02), .9);
    }

}