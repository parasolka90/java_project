package com.kodilla.stream.array;

import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.stream.IntStream;

public interface ArrayOperations {
    static double getAverage(int[] numbers) {
        OptionalDouble average = IntStream.range(0, numbers.length)
                .map(n -> {
                    System.out.println(numbers[n]);
                    return numbers[n];
                }).average();
        return average.getAsDouble();
    }
}
