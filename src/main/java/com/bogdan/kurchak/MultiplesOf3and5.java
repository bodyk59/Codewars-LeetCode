package com.bogdan.kurchak;

import java.util.stream.IntStream;

/*
 * https://www.codewars.com/kata/514b92a657cdc65150000006/java
 *
 * If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9.
 * The sum of these multiples is 23.
 * Finish the solution so that it returns the sum of all the multiples of 3 or 5 below the number passed in.
 */

/**
 * @author Bogdan Kurchak
 */
public class MultiplesOf3and5 {
    public int solution(int number) {
        return IntStream.range(0, number)
                .filter(element -> element % 3 == 0 || element % 5 == 0)
                .sum();
    }
}
