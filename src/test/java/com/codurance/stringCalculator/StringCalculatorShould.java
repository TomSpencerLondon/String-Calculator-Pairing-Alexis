package com.codurance.stringCalculator;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;

@RunWith(JUnitParamsRunner.class)
public class StringCalculatorShould {

    private StringCalculator stringCalculator;

    @Before
    public void setUp() {
        stringCalculator = new StringCalculator();
    }

    @Test
    public void empty_string_returns_0() {
        String number = "";
        assertEquals(0, stringCalculator.add(number));
    }

    @Test
    @Parameters({
        "4,4",
        "5,5",
        "6,6"
    })
    public void single_digit_string_returns_integer(int number, String stringNumber) {
        assertEquals(number, stringCalculator.add(stringNumber));
    }

    @Test
    public void adds_strings_1_2_to_return_3() {
        String stringNumbers = "1,2";
        assertEquals(3, stringCalculator.add(stringNumbers));
    }

    @Test
    public void adds_strings_2_3_to_return_5() {
        String stringNumbers = "2,3";
        assertEquals(5, stringCalculator.add(stringNumbers));
    }

    @Test
    public void adds_strings_5_6_to_return_11() {
        String stringNumbers = "5,6";
        assertEquals(11, stringCalculator.add(stringNumbers));
    }


}
