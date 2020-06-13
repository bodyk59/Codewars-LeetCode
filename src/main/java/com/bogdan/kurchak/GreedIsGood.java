package com.bogdan.kurchak;

import java.util.*;

/*
 * https://www.codewars.com/kata/5270d0d18625160ada0000e4/train/java
 *
 * Greed is a dice game played with five six-sided dice.
 * Your mission, should you choose to accept it, is to score a throw according to these rules.
 * You will always be given an array with five six-sided dice values.
 * Three 1's => 1000 points
 * Three 6's =>  600 points
 * Three 5's =>  500 points
 * Three 4's =>  400 points
 * Three 3's =>  300 points
 * Three 2's =>  200 points
 * One   1   =>  100 points
 * One   5   =>   50 point
 * A single die can only be counted once in each roll.
 * For example, a "5" can only count as part of a triplet (contributing to the 500 points) or as a single 50 points,
 * but not both in the same roll.
 *  Throw       Score
 * ---------   ------------------
 * 5 1 3 4 1   50 + 2 * 100 = 250
 * 1 1 1 3 1   1000 + 100 = 1100
 * 2 4 4 5 4   400 + 50 = 450
 */

/**
 * @author Bogdan Kurchak
 */
public class GreedIsGood {
    public static int greedy(int[] dice){
        HashMap<Integer, Integer> integerHashMap = new HashMap<>();

        Integer[] newDice = Arrays.stream(dice)
                .boxed()
                .toArray(Integer[]::new);

        List<Integer> list = Arrays.asList(newDice);

        for (int i = 1; i <= 6; i++) {
            integerHashMap.put(i, Collections.frequency(list, i));
        }

        int result = 0;

        for (Map.Entry<Integer, Integer> entry : integerHashMap.entrySet()) {
            switch (entry.getKey()) {
                case 1:
                    result += countResult(entry.getValue(), 100, 1000);
                    break;
                case 2:
                    result += countResult(entry.getValue(), 200);
                    break;
                case 3:
                    result += countResult(entry.getValue(), 300);
                    break;
                case 4:
                    result += countResult(entry.getValue(), 400);
                    break;
                case 5:
                    result += countResult(entry.getValue(), 50, 500);
                    break;
                case 6:
                    result += countResult(entry.getValue(), 600);
                    break;
            }
        }

        return result;
    }

    private static int countResult(int value, int pointsPerThree) {
        return value < 3 ? 0 : pointsPerThree;
    }

    private static int countResult(int value, int pointsPerOne, int pointsPerThree) {
        return value < 3 ?
                value * pointsPerOne :
                pointsPerThree + ((value - 3) * pointsPerOne);
    }
}
