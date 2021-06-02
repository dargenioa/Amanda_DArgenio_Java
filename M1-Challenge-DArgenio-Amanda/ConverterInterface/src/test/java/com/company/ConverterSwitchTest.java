package com.company;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ConverterSwitchTest {
    ConverterSwitch converter = new ConverterSwitch();

    @Test
    public void shouldTakeAnIntBetween1And12AndReturnNameOfMonth() {
        String failMessage = "Please enter a valid number between 1 and 12.";

        String whatIExpect = "October";

        int whatIGot = 10;
        String result = converter.convertMonth(whatIGot);

        assertEquals(failMessage, whatIExpect, result);

    }

    @Test
    public void shouldTakeAnIntBetween1And7AndReturnTheNameOfDay() {
        String failMessage = "Please enter a valid number between 1 and 7.";

        String whatIExpect = "Thursday";

        int whatIGot = 5;
        String result = converter.convertDay(whatIGot);

        assertEquals(failMessage, whatIExpect, result);

    }

}