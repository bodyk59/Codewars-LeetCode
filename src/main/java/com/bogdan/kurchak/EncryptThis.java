package com.bogdan.kurchak;

/*
 * https://www.codewars.com/kata/5848565e273af816fb000449/train/java
 *
 * Your message is a string containing space separated words.
 * You need to encrypt each word in the message using the following rules:
 * The first letter needs to be converted to its ASCII code.
 * The second letter needs to be switched with the last letter
 * Keepin' it simple: There are no special characters in input.
 */

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * @author Bogdan Kurchak
 */
public class EncryptThis {
    public static String encryptThis(String text) {
        if (text.isEmpty())
            return text;

        return Arrays.stream(text.split("\\s+"))
                .map(word -> {
                    if (word.length() <= 2)
                        return word;

                    char first = word.charAt(1);
                    char last = word.charAt(word.length() - 1);

                    return word.substring(0, 1)
                            .concat(String.valueOf(last))
                            .concat(word.substring(2, word.length() - 1).concat(String.valueOf(first)));

                })
                .map(word -> (int) word.charAt(0) + word.substring(1))
                .collect(Collectors.joining(" "));
    }
}
