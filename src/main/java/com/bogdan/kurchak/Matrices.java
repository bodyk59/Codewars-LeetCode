package com.bogdan.kurchak;

/*
 *
 */
 
public class Matrices {
  public static int[][] multiply(int[][] a, int[][] b) {
        if (b.length != a[0].length) {
          return null;
        }
    
        int[][] result = new int[a.length][b[0].length];
        
        for (int i = 0; i < a.length; i++) {
            for (int k = 0; k < b[i].length; k++) {
                int temp = 0;
                for (int j = 0; j < b.length; j++) {
                    temp += a[i][j] * b[j][k];
                } 
                result[i][k] = temp;
            }
        }
        
        return result;
        
//        return a[0].length != b.length ? null : java.util.Arrays.stream(a)
//                .map(ints -> java.util.stream.IntStream.range(0, b[0].length)
//                        .map(col -> java.util.stream.IntStream.range(0, b.length)
//                                .map(i -> ints[i] * b[i][col])
//                                .sum()
//                        )
//                        .toArray()
//                )
//                .toArray(int[][]::new);
    }
}
