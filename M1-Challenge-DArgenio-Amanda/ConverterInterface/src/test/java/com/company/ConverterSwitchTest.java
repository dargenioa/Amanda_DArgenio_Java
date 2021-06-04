package com.company;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ConverterSwitchTest {
    ConverterSwitch converter = new ConverterSwitch();

    @Test
    public void shouldTakeIn1AndReturnJanuary() {
        String failMessage = "Please enter a valid number between 1 and 12.";

        String whatIExpect = "January";

        int whatIGot = 1;
        String result = converter.convertMonth(whatIGot);

        assertEquals(failMessage, whatIExpect, result);

    }
    @Test
    public void shouldTakeIn2AndReturnFebruary() {
        String failMessage = "Please enter a valid number between 1 and 12.";

        String whatIExpect = "February";

        int whatIGot = 2;
        String result = converter.convertMonth(whatIGot);

        assertEquals(failMessage, whatIExpect, result);

    }

    @Test
    public void shouldTakeIn3AndReturnMarch() {
        String failMessage = "Please enter a valid number between 1 and 12.";

        String whatIExpect = "March";

        int whatIGot = 3;
        String result = converter.convertMonth(whatIGot);

        assertEquals(failMessage, whatIExpect, result);

    }

    @Test
    public void shouldTakeIn4AndReturnApril() {
        String failMessage = "Please enter a valid number between 1 and 12.";

        String whatIExpect = "April";

        int whatIGot = 4;
        String result = converter.convertMonth(whatIGot);

        assertEquals(failMessage, whatIExpect, result);

    }

    @Test
    public void shouldTakeIn5AndReturnMay() {
        String failMessage = "Please enter a valid number between 1 and 12.";

        String whatIExpect = "May";

        int whatIGot = 5;
        String result = converter.convertMonth(whatIGot);

        assertEquals(failMessage, whatIExpect, result);

    }

    @Test
    public void shouldTakeIn6AndReturnJune() {
        String failMessage = "Please enter a valid number between 1 and 12.";

        String whatIExpect = "June";

        int whatIGot = 6;
        String result = converter.convertMonth(whatIGot);

        assertEquals(failMessage, whatIExpect, result);

    }

    @Test
    public void shouldTakeIn7AndReturnJuly() {
        String failMessage = "Please enter a valid number between 1 and 12.";

        String whatIExpect = "July";

        int whatIGot = 7;
        String result = converter.convertMonth(whatIGot);

        assertEquals(failMessage, whatIExpect, result);

    }

    @Test
    public void shouldTakeIn8AndReturnAugust() {
        String failMessage = "Please enter a valid number between 1 and 12.";

        String whatIExpect = "August";

        int whatIGot = 8;
        String result = converter.convertMonth(whatIGot);

        assertEquals(failMessage, whatIExpect, result);

    }

    @Test
    public void shouldTakeIn9AndReturnSeptember() {
        String failMessage = "Please enter a valid number between 1 and 12.";

        String whatIExpect = "September";

        int whatIGot = 9;
        String result = converter.convertMonth(whatIGot);

        assertEquals(failMessage, whatIExpect, result);

    }

    @Test
    public void shouldTakeIn10AndReturnOctober() {
        String failMessage = "Please enter a valid number between 1 and 12.";

        String whatIExpect = "October";

        int whatIGot = 10;
        String result = converter.convertMonth(whatIGot);

        assertEquals(failMessage, whatIExpect, result);

    }

    @Test
    public void shouldTakeIn11AndReturnNovember() {
        String failMessage = "Please enter a valid number between 1 and 12.";

        String whatIExpect = "November";

        int whatIGot = 11;
        String result = converter.convertMonth(whatIGot);

        assertEquals(failMessage, whatIExpect, result);

    }

    @Test
    public void shouldTakeIn12AndReturnDecember() {
        String failMessage = "Please enter a valid number between 1 and 12.";

        String whatIExpect = "December";

        int whatIGot = 12;
        String result = converter.convertMonth(whatIGot);

        assertEquals(failMessage, whatIExpect, result);

    }


    @Test
    public void shouldTakeAnIn1AndReturnSunday() {
        String failMessage = "Please enter a valid number between 1 and 7.";

        String whatIExpect = "Sunday";

        int whatIGot = 1;
        String result = converter.convertDay(whatIGot);

        assertEquals(failMessage, whatIExpect, result);

    }

    @Test
    public void shouldTakeAnIn2AndReturnMonday() {
        String failMessage = "Please enter a valid number between 1 and 7.";

        String whatIExpect = "Monday";

        int whatIGot = 2;
        String result = converter.convertDay(whatIGot);

        assertEquals(failMessage, whatIExpect, result);

    }

    @Test
    public void shouldTakeAnIn3AndReturnTuesday() {
        String failMessage = "Please enter a valid number between 1 and 7.";

        String whatIExpect = "Tuesday";

        int whatIGot = 3;
        String result = converter.convertDay(whatIGot);

        assertEquals(failMessage, whatIExpect, result);

    }

    @Test
    public void shouldTakeAnIn4AndReturnWednesday() {
        String failMessage = "Please enter a valid number between 1 and 7.";

        String whatIExpect = "Wednesday";

        int whatIGot = 4;
        String result = converter.convertDay(whatIGot);

        assertEquals(failMessage, whatIExpect, result);

    }

    @Test
    public void shouldTakeAnIn5AndReturnThursday() {
        String failMessage = "Please enter a valid number between 1 and 7.";

        String whatIExpect = "Thursday";

        int whatIGot = 5;
        String result = converter.convertDay(whatIGot);

        assertEquals(failMessage, whatIExpect, result);

    }


    @Test
    public void shouldTakeAnIn6AndReturnFriday() {
        String failMessage = "Please enter a valid number between 1 and 7.";

        String whatIExpect = "Friday";

        int whatIGot = 6;
        String result = converter.convertDay(whatIGot);

        assertEquals(failMessage, whatIExpect, result);

    }

    @Test
    public void shouldTakeAnIn7AndReturnSaturday() {
        String failMessage = "Please enter a valid number between 1 and 7.";

        String whatIExpect = "Saturday";

        int whatIGot = 7;
        String result = converter.convertDay(whatIGot);

        assertEquals(failMessage, whatIExpect, result);

    }


}