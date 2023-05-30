package ch.zhaw.iwi.devops.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RomanNumeralsConverterTest {

    @Test
    public void testConvertToRoman_1() {
        int number = 1;
        String expectedRomanNumeral = "I";
        String actualRomanNumeral = RomanNumeralsConverter.convertToRoman(number);
        Assertions.assertTrue(expectedRomanNumeral.equals(actualRomanNumeral), "Conversion failed for number: " + number);
    }
 // Bewusst falscher Test
    @Test
    public void testConvertToRoman_falsch() {
        int number = 2;
        String expectedRomanNumeral = "M";
        String actualRomanNumeral = RomanNumeralsConverter.convertToRoman(number);
        Assertions.assertTrue(expectedRomanNumeral.equals(actualRomanNumeral), "Conversion failed for number: " + number);
    }
    
    @Test
    public void testConvertToRoman_2() {
        int number = 10;
        String expectedRomanNumeral = "X";
        String actualRomanNumeral = RomanNumeralsConverter.convertToRoman(number);
        Assertions.assertTrue(expectedRomanNumeral.equals(actualRomanNumeral), "Conversion failed for number: " + number);
    }
    
    @Test
    public void testConvertToRoman_3() {
        int number = 50;
        String expectedRomanNumeral = "L";
        String actualRomanNumeral = RomanNumeralsConverter.convertToRoman(number);
        Assertions.assertTrue(expectedRomanNumeral.equals(actualRomanNumeral), "Conversion failed for number: " + number);
    }
    
    @Test
    public void testConvertToRoman_4() {
        int number = 67;
        String expectedRomanNumeral = "LXVII";
        String actualRomanNumeral = RomanNumeralsConverter.convertToRoman(number);
        Assertions.assertTrue(expectedRomanNumeral.equals(actualRomanNumeral), "Conversion failed for number: " + number);
    }

    @Test
    public void testConvertToRoman_5() {
        int number = 234;
        String expectedRomanNumeral = "CCXXXIV";
        String actualRomanNumeral = RomanNumeralsConverter.convertToRoman(number);
        Assertions.assertTrue(expectedRomanNumeral.equals(actualRomanNumeral), "Conversion failed for number: " + number);
    }

    @Test
    public void testConvertToRoman_6() {
        int number = 541;
        String expectedRomanNumeral = "DXLI";
        String actualRomanNumeral = RomanNumeralsConverter.convertToRoman(number);
        Assertions.assertTrue(expectedRomanNumeral.equals(actualRomanNumeral), "Conversion failed for number: " + number);
    }

    @Test
    public void testConvertToRoman_7() {
        int number = 1003;
        String expectedRomanNumeral = "MIII";
        String actualRomanNumeral = RomanNumeralsConverter.convertToRoman(number);
        Assertions.assertTrue(expectedRomanNumeral.equals(actualRomanNumeral), "Conversion failed for number: " + number);
    }

    @Test
    public void testConvertToRoman_8() {
        int number = 1467;
        String expectedRomanNumeral = "MCDLXVII";
        String actualRomanNumeral = RomanNumeralsConverter.convertToRoman(number);
        Assertions.assertTrue(expectedRomanNumeral.equals(actualRomanNumeral), "Conversion failed for number: " + number);
    }

    @Test
    public void testConvertToRoman_9() {
        int number = 1809;
        String expectedRomanNumeral = "MDCCCIX";
        String actualRomanNumeral = RomanNumeralsConverter.convertToRoman(number);
        Assertions.assertTrue(expectedRomanNumeral.equals(actualRomanNumeral), "Conversion failed for number: " + number);
    }
    
    @Test
    public void testConvertToRoman_10() {
        int number = 3999;
        String expectedRomanNumeral = "MMMCMXCIX";
        String actualRomanNumeral = RomanNumeralsConverter.convertToRoman(number);
        Assertions.assertTrue(expectedRomanNumeral.equals(actualRomanNumeral), "Conversion failed for number: " + number);
    }
}