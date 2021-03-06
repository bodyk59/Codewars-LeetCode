package com.bogdan.kurchak;

import java.util.Arrays;

/*
 * https://www.codewars.com/kata/52c31f8e6605bcc646000082/train/java
 *
 * Write a function that takes an array of numbers (integers for the tests) and a target number.
 * It should find two different items in the array that, when added together, give the target value.
 * The indices of these items should then be returned in a tuple like so: (index1, index2).
 * For the purposes of this kata, some tests may have multiple answers; any valid solutions will be accepted.
 * The input will always be valid
 * (numbers will be an array of length 2 or greater, and all of the items will be numbers;
 * target will always be the sum of two different items from that array).
 */

/**
 * @author Bogdan Kurchak
 */
public class TwoSum {
    public static int[] twoSum(int[] numbers, int target) {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; i != j && j < numbers.length; j++) {
                if (numbers[i] + numbers[j] == target) {
                    return new int[]{j, i};
                }
            }
        }
        return new int[]{};
    }
}
