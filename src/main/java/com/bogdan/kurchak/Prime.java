package com.bogdan.kurchak;

/*
 * https://www.codewars.com/kata/5262119038c0985a5b00029f/solutions/java/me/best_practice
 *
 * Define a function that takes an integer argument and returns
 * logical value true or false depending on if the integer is a prime.
 * Per Wikipedia, a prime number (or a prime) is a natural number greater than 1
 * that has no positive divisors other than 1 and itself.
 */
/**
 * @author Bogdan Kurchak
 */
public class Prime {
    public static boolean isPrime(int num) {
        return num >= 0 && java.math.BigInteger.valueOf(num).isProbablePrime(1);
        //return num >= 0 && IntStream.range(2, num).noneMatch(i -> num % i == 0);
    }
}
