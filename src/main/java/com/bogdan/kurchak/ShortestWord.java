package com.bogdan.kurchak;

import java.util.Arrays;

/*
 * https://www.codewars.com/kata/57cebe1dc6fdc20c57000ac9/solutions/java
 *
 * Simple, given a string of words, return the length of the shortest word(s).
 * String will never be empty and you do not need to account for different data types.
 */

/**
 * @author Bogdan Kurchak
 */
public class ShortestWord {
    public static int findShort(String s) {
        return Arrays.stream(s.split("\\W"))
                .mapToInt(String::length)
                .min()
                .getAsInt();
    }
}