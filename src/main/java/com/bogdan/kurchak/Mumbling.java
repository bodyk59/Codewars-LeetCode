package com.bogdan.kurchak;

import java.util.stream.*;
import java.util.*;

//https://www.codewars.com/kata/5667e8f4e3f572a8f2000039/java

public class Accumul {
    public static String accum(String s) {
      String[] result = s.toLowerCase().split("");
      result[0] = result[0].toUpperCase();
      for (int i = 1; i < result.length; i++) {
        StringBuilder sb = new StringBuilder();
        for (int j = 0; j < i; j++) {
          if (j == 0 ) {
            sb.append(result[i].toUpperCase());
          }
          sb.append(result[i]);
        }
        result[i] = sb.toString();
      }
      return Arrays.stream(result).collect(Collectors.joining("-"));
    }
}
