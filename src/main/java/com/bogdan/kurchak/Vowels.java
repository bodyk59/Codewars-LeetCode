package com.bogdan.kurchak;

import java.util.stream.*;

//https://www.codewars.com/kata/54ff3102c1bad923760001f3/java

public class Vowels {
  public static int getCount(String str) {
    return (int) str.chars()
      .filter(c -> (char) c == 'a' || (char) c == 'e' || (char) c == 'i' ||
             (char) c == 'o' || (char) c == 'u')
      .count();
  }
}
