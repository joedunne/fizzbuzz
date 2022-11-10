package org.fizzbuzz;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class FizzBuzz {

    private static final int FIZZ_DIVISOR = 3;
    private static final int BUZZ_DIVISOR = 5;

    private static final String FIZZ = "Fizz";
    private static final String BUZZ = "Buzz";

    /**
     * Output 'Fizz' for multiples of 3, 'Buzz' for multiples of 5, 'FizzBuzz' for multiples of 3 & 5.
     * Otherwise, return the input number as a string.
     *
     * @param number input value
     * @return result
     */
    protected String toFizzBuzz(int number) {
        StringBuilder sb = new StringBuilder();
        if (number % FIZZ_DIVISOR == 0) {
            sb.append(FIZZ);
        }
        if (number % BUZZ_DIVISOR == 0) {
            sb.append(BUZZ);
        }
        if (sb.length() == 0) {
            sb.append(number);
        }
        return sb.toString();
    }

    /**
     * Process FizzBuzz for given range.
     *
     * @param start Inclusive start range.
     * @param end   Inclusive end range.
     * @return List of FizzBuzz results for the given range.
     */
    public List<String> process(int start, int end) {
        List<String> results = new ArrayList<>();
        IntStream.range(start, end + 1).forEach(
                number -> results.add(toFizzBuzz(number))
        );
        return results;
    }

    public static void main(String[] args) {
        FizzBuzz fizzBuzz = new FizzBuzz();
        fizzBuzz.process(1, 100).forEach(System.out::println);
    }
}
