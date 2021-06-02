package com.company;

import java.util.Objects;

public class ConverterIf implements com.company.interfaces.Converter{

    private String month;
    private String day;


    public ConverterIf(String month, String day) {
        this.month = month;
        this.day = day;
    }

    public ConverterIf() {
    }

    @Override
    public String convertMonth(int monthNumber) {

        if (monthNumber == 1) {
            setMonth("January");
        } else if (monthNumber == 2) {
            setMonth("February");
        } else if (monthNumber == 3) {
            setMonth("March");
        } else if (monthNumber == 4) {
            setMonth("April");
        } else if (monthNumber == 5) {
            setMonth("May");
        } else if (monthNumber == 6) {
            setMonth("June");
        } else if (monthNumber == 7) {
            setMonth("July");
        } else if (monthNumber == 8) {
            setMonth("August");
        } else if (monthNumber == 9 ) {
            setMonth("September");
        } else if (monthNumber == 10) {
            setMonth("October");
        } else if (monthNumber == 11) {
            setMonth("November");
        } else if (monthNumber == 12) {
            setMonth("December");
        } else {
            System.out.println("Please enter a valid number between 1 and 12.");
        }
        return this.month;
    }

    @Override
    public String convertDay(int dayNumber) {
        if(dayNumber == 1) {
            setDay("Sunday");
        } else if (dayNumber == 2) {
            setDay("Monday");
        } else if (dayNumber == 3) {
            setDay("Tuesday");
        } else if (dayNumber == 4) {
            setDay("Wednesday");
        } else if (dayNumber == 5) {
            setDay("Thursday");
        } else if (dayNumber == 6) {
            setDay("Friday");
        } else if (dayNumber == 7) {
            setDay("Saturday");
        } else {
            System.out.println("Please enter a valid number between 1 and 7.");
        }

        return this.day;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ConverterIf that = (ConverterIf) o;
        return Objects.equals(month, that.month) && Objects.equals(day, that.day);
    }

    @Override
    public int hashCode() {
        return Objects.hash(month, day);
    }

    @Override
    public String toString() {
        return "ConverterIf{" +
                "month='" + month + '\'' +
                ", day='" + day + '\'' +
                '}';
    }
}
