package com.bogdan.kurchak;

/*
 * Link: https://leetcode.com/problems/single-number/
 * Task: Given a non-empty array of integers, every element appears twice except for one. Find that single one.
 */

/**
 * @author Bogdan Kurchak
 */
public class SingleNumber {
    public int singleNumber(int[] nums) {
        int result = 0;
        int counter = 1;

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (i != j && nums[i] == nums[j]) {
                    counter++;
                }
            }

            if (counter == 2) {
                counter = 1;
            } else {
                result = nums[i];
                break;
            }
        }

        return result;
    }
}

/*
 * a ^ 0 = a
 * a ^ a = 0
 * a ^ b ^ a = (a ^ a) ^ b = 0 ^ b = b
 */

class SingleNumberSecond {
    public int singleNumber(int[] nums) {
        int a = 0;
        for (int i : nums) {
            a ^= i;
        }
        return a;
    }
}
