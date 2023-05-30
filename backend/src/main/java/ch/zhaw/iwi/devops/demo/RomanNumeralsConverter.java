package ch.zhaw.iwi.devops.demo;

public class RomanNumeralsConverter {
    // Define arrays for Roman numerals and their corresponding values
    private static final String[] romanNumerals = {
        "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"
    };
    
    private static final int[] values = {
        1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1
    };
    
    public static String convertToRoman(int number) {
        if (number <= 0 || number > 3999) {
            throw new IllegalArgumentException("Number out of range. Please provide a number between 1 and 3999.");
        }
        
        StringBuilder result = new StringBuilder();
        
        // Iterate through the values and build the Roman numeral string
        for (int i = 0; i < values.length; i++) {
            while (number >= values[i]) {
                result.append(romanNumerals[i]);
                number -= values[i];
            }
        }
        
        return result.toString();
    }
}
    

