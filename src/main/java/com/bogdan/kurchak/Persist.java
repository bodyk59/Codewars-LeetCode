package com.bogdan.kurchak;

/*
 * https://www.codewars.com/kata/55bf01e5a717a0d57e0000ec/train/java
 * 
 * Write a function, persistence, that takes in a positive parameter num and returns its multiplicative persistence, 
 * which is the number of times you must multiply the digits in num until you reach a single digit.
 */

class Persist {
    private static int counter = 0;
	  public static int persistence(long n) {
        if (n < 10) {
            return 0; 
        }
		    int result = 1;
        while (n != 0) {
            result *= (n % 10);
            n /= 10;
        }
        counter++;
        return result % 10 == result ? counter : persistence(result);
	  }
}
