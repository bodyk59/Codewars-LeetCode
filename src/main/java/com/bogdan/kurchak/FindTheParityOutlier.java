package com.bogdan.kurchak;

import java.util.Arrays;

/*
 * https://www.codewars.com/kata/5526fc09a1bbd946250002dc/train/java
 *
 * You are given an array (which will have a length of at least 3, but could be very large) containing integers.
 * The array is either entirely comprised of odd integers or entirely comprised of even integers except
 * for a single integer N. Write a method that takes the array as an argument and returns this "outlier" N.
 */

/**
 * @author Bogdan Kurchak
 */
public class FindTheParityOutlier {
    static int find(int[] integers){
        long amount = Arrays.stream(integers).filter(n -> n % 2 == 0).count();
        return Arrays.stream(integers).filter(n -> (amount == 1) == (n % 2 == 0)).findFirst().getAsInt();
    }
}
