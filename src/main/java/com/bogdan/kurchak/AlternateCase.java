package com.bogdan.kurchak

import static java.lang.Character.*;

/*
 * https://www.codewars.com/kata/57a62154cf1fa5b25200031e
 *
 * Write function alternateCase which switch every letter in string from upper to lower and from lower to upper. 
 * E.g: Hello World -> hELLO wORLD
 */
 
 class Kata {
    static String alternateCase(final String string) {
        char[] phrase = string.toCharArray();
        StringBuilder result = new StringBuilder();
        for (char letter : phrase) {
            result.append(isUpperCase(letter) ? toLowerCase(letter) : toUpperCase(letter));
        }
        return result.toString();
    }
}
