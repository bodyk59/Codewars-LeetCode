package com.bogdan.kurchak;

import java.util.stream.IntStream;

/*
 * https://www.codewars.com/kata/5a908da30025e995880000e3/train/java
 *
 * Consider a sequence made up of the consecutive prime numbers. This infinite sequence would start with:
 * "2357111317192329313741434753596167717379..."
 * You will be given two numbers: a and b,
 * and your task will be to return b elements starting from index a in this sequence.
 * For example:
 * solve(10,5) == `19232` Because these are 5 elements from index 10 in the sequence.
 * Tests go up to about index 20000.
 * More examples in test cases. Good luck!
 */

/**
 * @author Bogdan Kurchak
 */
public class SimplePrimeStreaming {
    public static String solve(int a, int b) {
        return IntStream.iterate(2, i -> i + 1)
                .filter(SimplePrimeStreaming::isPrime)
                .limit((long)a + b)
                .collect(StringBuilder::new, StringBuilder::append, StringBuilder::append)
                .substring(a, a + b);
    }

    public static boolean isPrime(int num) {
        return num >= 0 && java.math.BigInteger.valueOf(num).isProbablePrime(10);
    }
}
