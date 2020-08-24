package com.bogdan.kurchak;

/*
 * https://www.codewars.com/kata/59f0f9e127402fb0c4000110/java
 */
 
public class Reverser {
  public static int[] reverse(int[] a) {
    return java.util.stream.IntStream.range(0, a.length)
      .map(i -> a[a.length - 1 - i])
      .toArray();
  }
}
