package org.itdd;

public class RomanNumeralCalculator {
    public String convert(int i) {
        String result = "";
        while (i >= 100) {
            result += "C";
            i = i - 100;
        }
        if(i >= 90 && i <= 99) {
            result += "XC";
            i = i - 90;
        }
        while (i >= 50) {
            result += "L";
            i = i - 50;
        }
        if( i >= 40 && i <= 49) {
            result += "XL";
            i = i-40;
        }
        while (i >= 10) {
            result += "X";
            i = i -10;
        }
        if ( i == 9) {
            result += "IX";
            i = i - 9;
        }
        while (i >= 5) {
            result += "V";
            i = i -5;
        }

        if(i == 4) {
            result += "IV";
            i = i - 4;
        }

        while (i >= 1) {
            result += "I";
            i = i - 1;
        }

        return result;
    }
}
