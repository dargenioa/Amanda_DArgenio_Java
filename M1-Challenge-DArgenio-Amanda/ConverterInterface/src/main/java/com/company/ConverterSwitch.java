package com.company;

import java.util.Objects;

public class ConverterSwitch implements com.company.interfaces.Converter{

    private String month;
    private String day;

    public ConverterSwitch(String month, String day) {
        this.month = month;
        this.day = day;
    }

    public ConverterSwitch() {
    }

    @Override
    public String convertMonth(int monthNumber) {
        switch(monthNumber) {
            case 1:
                setMonth("January");
                break;
            case 2:
                setMonth("February");
                break;
            case 3:
                setMonth("March");
                break;
            case 4:
                setMonth("April");
                break;
            case 5:
                setMonth("May");
                break;
            case 6:
                setMonth("June");
                break;
            case 7:
                setMonth("July");
                break;
            case 8:
                setMonth("August");
                break;
            case 9:
                setMonth("September");
                break;
            case 10:
                setMonth("October");
                break;
            case 11:
                setMonth("November");
                break;
            case 12:
                setMonth("December");
                break;
            default:
                System.out.println("Please enter a valid number between 1 and 12.");
        }
        return this.month;
    }

    @Override
    public String convertDay(int dayNumber) {
        switch(dayNumber) {
            case 1:
                setDay("Sunday");
                break;
            case 2:
                setDay("Monday");
                break;
            case 3:
                setDay("Tuesday");
                break;
            case 4:
                setDay("Wednesday");
                break;
            case 5:
                setDay("Thursday");
                break;
            case 6:
                setDay("Friday");
                break;
            case 7:
                setDay("Saturday");
                break;
            default:
                System.out.println("Please enter a valid number between 1 and 7");
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
        ConverterSwitch that = (ConverterSwitch) o;
        return Objects.equals(month, that.month) && Objects.equals(day, that.day);
    }

    @Override
    public int hashCode() {
        return Objects.hash(month, day);
    }

    @Override
    public String toString() {
        return "ConverterSwitch{" +
                "month='" + month + '\'' +
                ", day='" + day + '\'' +
                '}';
    }
}
