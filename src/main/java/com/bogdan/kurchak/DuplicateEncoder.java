package com.bogdan.kurchak;

import java.util.*;
import java.util.stream.*;

/*
 * https://www.codewars.com/kata/54b42f9314d9229fd6000d9c/java
 * 
 * The goal of this exercise is to convert a string to a new string where each character in the new string is "(" 
 * if that character appears only once in the original string, or ")" if that character appears more than once in the original string. 
 * Ignore capitalization when determining if a character is a duplicate.
 * Examples:
 * "din"      =>  "((("
 * "recede"   =>  "()()()"
 * "Success"  =>  ")())())"
 * "(( @"     =>  "))(("
 */

public class DuplicateEncoder {
	static String encode(String word){
    List<String> list = Arrays.asList(word.toLowerCase().split(""));
    return list.stream()
      .map(letter -> Collections.frequency(list, letter) == 1 ? "(" : ")")
      .collect(Collectors.joining(""));
  }
}
