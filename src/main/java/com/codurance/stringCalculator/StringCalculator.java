package com.codurance.stringCalculator;

public class StringCalculator {

    public static final String DEFAULT_DELIMITER = "[,\n]";

    public int add(String numbers) {
        String customSeparator = DEFAULT_DELIMITER;

        if (numbers.equals("")) {
            return 0;
        }

        if (numbers.startsWith("//")) {
            customSeparator = numbers.substring(2, numbers.indexOf("\n"));
            numbers = numbers.substring(numbers.indexOf("\n") + 1);
        }

        int sum = 0;
        for (String number : numbers.split(customSeparator)) {
            sum += Integer.parseInt(number);
        }
        return sum;
    }
}
