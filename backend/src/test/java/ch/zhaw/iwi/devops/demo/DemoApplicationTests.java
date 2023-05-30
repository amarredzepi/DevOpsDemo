package ch.zhaw.iwi.devops.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {

	@Test
    void testConvertToRoman_1() {
        int number = 1;
        String expectedRomanNumeral = "I";
        String actualRomanNumeral = RomanNumeralsConverter.convertToRoman(number);
        Assertions.assertTrue(expectedRomanNumeral.equals(actualRomanNumeral), "Conversion failed for number: " + number);
    }

}
