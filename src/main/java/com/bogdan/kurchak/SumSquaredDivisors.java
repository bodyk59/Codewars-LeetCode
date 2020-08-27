package com.bogdan.kurchak;

//https://www.codewars.com/kata/55aa075506463dac6600010d/java

public class SumSquaredDivisors {
	public static String listSquared(long m, long n) {
	   StringBuilder result = new StringBuilder("[");
        for (long number = m; number <= n; number++) {
            int sum = 0;
            for (long num = 1; num <= number; num++) {
                if (number % num == 0) {
                    sum += (long) Math.pow(num, 2);
                }
            }

            long sqrt = (long) Math.sqrt(sum);

            if ((long) Math.pow(sqrt, 2) == sum) {
                result.append("[")
                .append(String.valueOf(number))
                .append(", ")
                .append(String.valueOf(sum))
                .append("], ");
            }
            
        }
        return result.length() == 1 ? 
          "[]" : 
          result.deleteCharAt(result.length() - 1)
            .deleteCharAt(result.length() - 1)
            .append("]").toString();
	}
}
