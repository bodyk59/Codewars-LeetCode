package com.bogdan.kurchak;

import java.util.stream.IntStream;

/*
 * https://www.codewars.com/kata/5412509bd436bd33920011bc/java
 *
 * Usually when you buy something, you're asked whether your credit card number, phone number or answer
 * to your most secret question is still correct. However, since someone could look over your shoulder,
 * you don't want that shown on your screen. Instead, we mask it.
 * Your task is to write a function maskify, which changes all but the last four characters into '#'.
 */
/**
 * @author Bogdan Kurchak
 */
public class Maskify {
    public static String maskify(String str) {
        if (str.length() <= 4)
            return str;

        int length = str.length();
        return IntStream.range(0, length - 4)
                .mapToObj(i -> "#")
                .collect(StringBuilder::new, StringBuilder::append, StringBuilder::append)
                .toString()
                .concat(str.substring(length - 4, length));
    }

//    public static String maskify(String str) {
//        return str.replaceAll(".(?=.{4})", "#");
//    }
}
