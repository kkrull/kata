package com.here.romannumerals;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RomanNumeralTest {
  @Test
  public void convert1ToI() {
    assertEquals("I", RomanNumeral.convert(1));
  }
}