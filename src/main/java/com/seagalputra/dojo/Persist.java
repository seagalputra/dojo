package com.seagalputra.dojo;

import java.util.stream.Stream;

public class Persist {
    public static int persistence(long number) {
        return persistence(number, 0);
    }

    public static int persistence(long number, int count) {
        if (String.valueOf(number).length() == 1) {
            return count;
        } else {

            String stringNumber = String.valueOf(number);
            String[] numbers = stringNumber.split("");
            Integer result = Stream.of(numbers)
                    .map(Integer::parseInt)
                    .reduce(1, (subtotal, value) -> subtotal * value);

            return persistence(result, count + 1);
        }
    }
}
