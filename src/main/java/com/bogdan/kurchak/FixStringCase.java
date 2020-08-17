package com.bogdan.kurchak

import static java.lang.Character.*;

/*
 * https://www.codewars.com/kata/5b180e9fedaa564a7000009a/java
 *
 * In this Kata, you will be given a string that may have mixed uppercase and lowercase letters 
 * and your task is to convert that string to either lowercase only or uppercase only based on:
 * - make as few changes as possible.
 * - if the string contains equal number of uppercase and lowercase letters, convert the string to lowercase.
 */

public class Solution {
    public static String solve(String str) {
        int middle = str.length() / 2;
        int counter = 0;
        
        for (char letter : str.toCharArray()) {
            if (isUpperCase(letter)) {
                counter++;
            }
        }

        return counter < middle || counter == middle ? str.toLowerCase() : str.toUpperCase();
    }
}
