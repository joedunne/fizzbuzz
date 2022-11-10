package org.fizzbuzz;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class FizzBuzz {

    /**
     * Output 'Fizz' for multiples of 3, 'Buzz' for multiples of 5, 'FizzBuzz' for multiples of 3 & 5.
     * Otherwise, return the input number as a string.
     *
     * @param number input value
     * @return result
     */
    protected String toFizzBuzz(int number) {
        StringBuilder sb = new StringBuilder();
        if (number % 3 == 0) {
            sb.append("Fizz");
        }
        if (number % 5 == 0) {
            sb.append("Buzz");
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
