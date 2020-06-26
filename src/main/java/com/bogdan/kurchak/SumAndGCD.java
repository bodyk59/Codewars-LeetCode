package com.bogdan.kurchak;

import java.util.stream.IntStream;

/*
 * https://www.codewars.com/kata/5dd259444228280032b1ed2a/train/java
 *
 * Given the sum and gcd of two numbers, return those two numbers in ascending order.
 * If the numbers do not exist, return -1,
 * (or NULL in C, tuple (-1,-1) in C#, pair (-1,-1) in C++, array {-1,-1} in Java).
 */

/**
 * @author Bogdan Kurchak
 */
public class SumAndGCD {
    public static int[] solve(int s, int g){
        int[] result = IntStream.range(1, s)
                .filter(i -> i % g == 0 && (s - i) % g == 0)
                .sorted()
                .toArray();

        return result.length == 0 ?
                new int[] {-1, -1} :
                new int[] {result[0], result[result.length - 1]};
    }

    public static void main(String[] args) {
        System.out.println(solve(10, 2).length);
    }
}
