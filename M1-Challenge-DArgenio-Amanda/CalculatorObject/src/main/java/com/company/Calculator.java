package com.company;

public class Calculator implements com.company.interfaces.Arithmetic {

    public Calculator() {
    }

    @Override
    public int addInt(int x, int y) {
        int sum = 0;
        sum = (x + y);
        System.out.println(x + " + " + y + " = " + sum);
        return sum;
    }

    @Override
    public int subtractInt(int x, int y) {
        int difference = 0;
        difference = (x - y);
        System.out.println(x + " - " + y + " = " + difference);
        return difference;
    }

    @Override
    public int multiplyInt(int x, int y) {
        int product = 0;
        product = (x * y);
        System.out.println(x + " * " + y + " = " + product);
        return product;    }

    @Override
    public int divideInt(int x, int y) {
        int quotient = 0;
        quotient = (x / y);
        System.out.println(x + " / " + y + " = " + quotient);
        return quotient;
    }

    @Override
    public double addDouble(double x, double y) {
        double result = 0;
        result = (x + y);
        System.out.println(x + " + " + y + " = " + result);
        return result;
    }

    @Override
    public double subtractDouble(double x, double y) {
        double result = 0;
        result = (x - y);
        System.out.println(x + " - " + y + " = " + result);
        return result;
    }

    @Override
    public double multiplyDouble(double x, double y) {
        double result = 0;
        result = (x * y);
        System.out.println(x + " * " + y + " = " + result);
        return result;
    }

    @Override
    public double divideDouble(double x, double y) {
        double result = 0;
        result = (x / y);
        System.out.println(x + " / " + y + " = " + result);
        return result;
    }
}
