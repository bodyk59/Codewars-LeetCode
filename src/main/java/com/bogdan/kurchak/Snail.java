package com.bogdan.kurchak;

import java.util.*;
import java.util.stream.*;

/*
 * https://www.codewars.com/kata/521c2db8ddc89b9b7a0000c1/java
 */

public class Snail {
    public static int[] snail(int[][] array) {
      int initialRow = 0;
      int initialColumn = 0;
      int lastRow = array.length - 1;
      int lastColumn = array[0].length - 1;
      
      List<Integer> list = new ArrayList<>();
      
      while (initialRow <= lastRow && initialColumn <= lastColumn) {
        for (int i = initialColumn; i <= lastColumn; i++) {
          list.add(array[initialRow][i]);
        }
        initialRow++;
        
        for (int i = initialRow; i <= lastRow; i++) {
            list.add(array[i][lastColumn]);
        }
        lastColumn--;
        
        if (initialRow <= lastRow) {
            for (int i = lastColumn; i >= initialColumn; i--) {
                list.add(array[lastRow][i]);
            }
            lastRow--;
        }
        
        if (initialColumn <= lastColumn) {
            for (int i = lastRow; i >= initialRow; i--) {
                list.add(array[i][initialColumn]);
            }
            initialColumn++;
        }
      }
      
      return list.stream()
                .mapToInt(i -> i)
                .toArray();
   } 
}
