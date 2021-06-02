package com.company;

public class ConverterApplication {
    public static void main(String[] args) {

        //Instantiate ConverterIf and Converter Switch
        ConverterIf converterIf = new ConverterIf();
        ConverterSwitch converterSwitch = new ConverterSwitch();

        //ConverterIf convertMonth method
        System.out.println(converterIf.convertMonth(1));
        System.out.println(converterIf.convertMonth(2));
        System.out.println(converterIf.convertMonth(3));
        System.out.println(converterIf.convertMonth(4));
        System.out.println(converterIf.convertMonth(5));
        System.out.println(converterIf.convertMonth(6));
        System.out.println(converterIf.convertMonth(7));
        System.out.println(converterIf.convertMonth(8));
        System.out.println(converterIf.convertMonth(9));
        System.out.println(converterIf.convertMonth(10));
        System.out.println(converterIf.convertMonth(11));
        System.out.println(converterIf.convertMonth(12));


        //ConverterIf convertDay method
        System.out.println(converterIf.convertDay(1));
        System.out.println(converterIf.convertDay(2));
        System.out.println(converterIf.convertDay(3));
        System.out.println(converterIf.convertDay(4));
        System.out.println(converterIf.convertDay(5));
        System.out.println(converterIf.convertDay(6));
        System.out.println(converterIf.convertDay(7));

        //ConverterSwitch convertMonth method
        System.out.println(converterSwitch.convertMonth(1));
        System.out.println(converterSwitch.convertMonth(2));
        System.out.println(converterSwitch.convertMonth(3));
        System.out.println(converterSwitch.convertMonth(4));
        System.out.println(converterSwitch.convertMonth(5));
        System.out.println(converterSwitch.convertMonth(6));
        System.out.println(converterSwitch.convertMonth(7));
        System.out.println(converterSwitch.convertMonth(8));
        System.out.println(converterSwitch.convertMonth(9));
        System.out.println(converterSwitch.convertMonth(10));
        System.out.println(converterSwitch.convertMonth(11));
        System.out.println(converterSwitch.convertMonth(12));


        //ConverterSwitch convertDay method
        System.out.println(converterSwitch.convertDay(1));
        System.out.println(converterSwitch.convertDay(2));
        System.out.println(converterSwitch.convertDay(3));
        System.out.println(converterSwitch.convertDay(4));
        System.out.println(converterSwitch.convertDay(5));
        System.out.println(converterSwitch.convertDay(6));
        System.out.println(converterSwitch.convertDay(7));




    }
}
