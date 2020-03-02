package com.codurance.stringCalculator;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StringCalculatorShould {
  StringCalculator stringCalculator;

  @Before
  public void setUp() throws Exception {
    stringCalculator = new StringCalculator();
  }

  @Test
  public void empty_string_returns_0(){
    String number = "";
    assertEquals(0, stringCalculator.add(number));
  }

  @Test
  public void string_4_returns_4() {
    String number = "4";
    assertEquals(4, stringCalculator.add(number));
  }

  @Test
  public void string_5_returns_5() {
    String number = "5";
    assertEquals(5, stringCalculator.add(number));
  }
}
