package com.codurance.stringCalculator;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class StringCalculatorShould {

    private StringCalculator stringCalculator;

    @BeforeEach
    public void setUp() {
        stringCalculator = new StringCalculator();
    }

    @Test
    public void empty_string_returns_0() {
        String number = "";
        assertEquals(0, stringCalculator.add(number));
    }

    @ParameterizedTest
    @CsvSource({
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


    @ParameterizedTest
    @CsvSource(value = {
        "1,2:3",
        "2,3:5",
        "5,6:11",
        "1,2,3,4,5,6,7,8,9:45",
    }, delimiter = ':')
    public void double_digit_string_returns_sum_as_integer(String stringNumber, int number) {
        assertEquals(number, stringCalculator.add(stringNumber));
    }

    @Test
    public void adds_strings_1_2_3_with_different_seperators() {
        assertEquals(6, stringCalculator.add(
            "1\n" +
            "2,3"));
    }

    @Test
    public void adds_strings_1_2_3_5_6_7_8_9_with_different_seperators() {
        assertEquals(45, stringCalculator.add("1\n2,3\n4,5\n6,7\n8,9"));
    }

    @Test
    public void adds_strings_1_2_with_custom_separator() {
        assertEquals(3, stringCalculator.add("//;\n1;2"));
    }

}
