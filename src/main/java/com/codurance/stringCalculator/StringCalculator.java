package com.codurance.stringCalculator;

public class StringCalculator {

    public static final String DELIMITER = ",";

    public int add(String numbers) {
        if (numbers.equals("")) {
            return 0;
        }

        int sum = 0;
        for (String number : numbers.split(DELIMITER)) {
            sum += Integer.parseInt(number);
        }
        return sum;
    }
}
