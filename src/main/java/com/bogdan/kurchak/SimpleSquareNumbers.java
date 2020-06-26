package com.bogdan.kurchak;

/*
 * https://www.codewars.com/kata/5edc8c53d7cede0032eb6029/train/java
 *
 * In this Kata, you will be given a number n (n > 0) and
 * your task will be to return the smallest square number
 * N (N > 0) such that n + N is also a perfect square.
 * If there is no answer, return -1 (nil in Clojure, Nothing in Haskell).
 */

/**
 * @author Bogdan Kurchak
 */
public class SimpleSquareNumbers {
    public static long solve(int n){
        for(int i = 1, temp = 1; temp < n; i++, temp += 2) {
            long square = (long) Math.pow(i, 2);

            if(Math.sqrt(square + n) % 1 == 0)
                return square;
        }

        return -1;
    }
}
