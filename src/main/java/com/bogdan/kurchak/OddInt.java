package com.bogdan.kurchak

import java.util.*;
import java.util.stream.*;

/*
 * https://www.codewars.com/kata/54da5a58ea159efa38000836/train/java
 *
 * Given an array of integers, find the one that appears an odd number of times.
 * There will always be only one integer that appears an odd number of times.
 */

public class FindOdd {
  public static int findIt(int[] a) {
    List<Integer> list = Arrays.stream(a)
      .map(Integer::new)
      .boxed()
      .collect(Collectors.toList());
    
    return list.stream()
      .filter(number -> Collections.frequency(list, number) % 2 != 0)
      .findFirst()
      .orElse(0);
  }
}
