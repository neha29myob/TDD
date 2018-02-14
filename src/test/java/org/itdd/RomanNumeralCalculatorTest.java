package org.itdd;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class RomanNumeralCalculatorTest {
    @Test
    public void whenNumeralOneThenReturnI() {
        RomanNumeralCalculator romanNumeralCalculator = new RomanNumeralCalculator();
        String result = romanNumeralCalculator.convert(1);
        assertThat(result).isEqualTo("I");

    }

    @Test
    public void whenNumeralTwoThenReturnII() {
        RomanNumeralCalculator romanNumeralCalculator = new RomanNumeralCalculator();
        String result = romanNumeralCalculator.convert(2);
        assertThat(result).isEqualTo("II");
    }

    @Test
    public void whenNumeralSixThenReturnVI() {
        RomanNumeralCalculator romanNumeralCalculator = new RomanNumeralCalculator();
        String result = romanNumeralCalculator.convert(6);
        assertThat(result).isEqualTo("VI");
    }

    @Test
    public void whenNumeral11ThenReturnXI() {
        RomanNumeralCalculator romanNumeralCalculator = new RomanNumeralCalculator();
        String result = romanNumeralCalculator.convert(11);
        assertThat(result).isEqualTo("XI");
    }

    @Test
    public void whenNumeralFourThenReturnIV() {
        RomanNumeralCalculator romanNumeralCalculator = new RomanNumeralCalculator();
        String result = romanNumeralCalculator.convert(4);
        assertThat(result).isEqualTo("IV");
    }

    @Test
    public void whenNumeral48ThenReturnXLVIII() {
        RomanNumeralCalculator romanNumeralCalculator = new RomanNumeralCalculator();
        String result = romanNumeralCalculator.convert(48);
        assertThat(result).isEqualTo("XLVIII");
    }

    @Test
    public void whenNumeral53ThenReturnLIII() {
        RomanNumeralCalculator romanNumeralCalculator = new RomanNumeralCalculator();
        String result = romanNumeralCalculator.convert(53);
        assertThat(result).isEqualTo("LIII");
    }

    @Test
    public void whenNumeral199ThenReturnCXCIX() {
        RomanNumeralCalculator romanNumeralCalculator = new RomanNumeralCalculator();
        String result = romanNumeralCalculator.convert(199);
        assertThat(result).isEqualTo("CXCIX");
    }

}