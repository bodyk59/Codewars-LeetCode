package com.bogdan.kurchak;

//https://www.codewars.com/kata/529bf0e9bdf7657179000008/java

public class SudokuValidator {
    public static boolean check(int[][] table) {
        int maxNum = table.length;
        int n = (int) Math.sqrt(maxNum);
        boolean solved = true;

        for (int row = 0; row < maxNum; row++) {
            for (int col = 0; col < maxNum; col++) {
                if (table[row][col] <= 0 || table[row][col] > maxNum) {
                    solved = false;
                }

                for (int i = 0; i < maxNum; i++) {
                    if (row != i && table[row][col] == table[i][col]) {
                        solved = false;
                    }

                    if (col != i && table[row][col] == table[row][i]) {
                        solved = false;
                    }
                }

                int startRow = row - (row % n);
                int startCol = col - (col % n);

                for (int r = startRow; r < startRow + n; r++) {
                    for (int c = startCol; c < startCol + n; c++) {
                        if ((row != r || col != c) && table[row][col] == table[r][c]) {
                            solved = false;
                        }
                    }
                }
            }
        }

        return solved;
    }
}
