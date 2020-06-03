package com.bogdan.kurchak;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/*
 * https://www.codewars.com/kata/56a5d994ac971f1ac500003e/java
 *
 * You are given an array strarr of strings and an integer k.
 * Your task is to return the first longest string consisting of k consecutive strings taken in the array.
 * Example:
 * longest_consec(["zone", "abigail", "theta", "form", "libe", "zas", "theta", "abigail"], 2) --> "abigailtheta"
 * n being the length of the string array, if n = 0 or k > n or k <= 0 return "".
 * Note
 * consecutive strings : follow one after another without an interruption
 */

/**
 * @author Bogdan Kurchak
 */
public class LongestConsec {
    public static String longestConsec(String[] strarr, int k) {
        if (k <= 0) {
            return "";
        }

        return IntStream.rangeClosed(0, strarr.length - k)
                .mapToObj(i -> Arrays.stream(strarr, i, i + k).collect(Collectors.joining()))
                .max(Comparator.comparingInt(String::length))
                .orElse("");
    }
}
