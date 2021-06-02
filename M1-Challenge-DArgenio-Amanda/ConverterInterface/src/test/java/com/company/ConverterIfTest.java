package com.company;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ConverterIfTest {

    @Test
    public void shouldTakeAnIntBetween1And12AndReturnTheNameOfMonth() {
        ConverterIf converter = new ConverterIf();
        String failMessage = "Please enter a valid number between 1 and 12.";

        String whatIExpect = "December";

        int whatIGot = 12;
        String result = converter.convertMonth(whatIGot);

        assertEquals(failMessage, whatIExpect, result);

    }

    @Test
    public void shouldTakeAnIntBetween1And7AndReturnTheNameOfDay() {
        ConverterIf converter = new ConverterIf();
        String failMessage = "Please enter a valid number between 1 and 7.";

        String whatIExpect = "Thursday";

        int whatIGot = 5;
        String result = converter.convertDay(whatIGot);

        assertEquals(failMessage, whatIExpect, result);

    }

}