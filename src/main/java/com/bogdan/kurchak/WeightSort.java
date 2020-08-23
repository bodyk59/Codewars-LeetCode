import com.bogdan.kurchak;

import java.util.*;
import java.util.stream.*;

// https://www.codewars.com/kata/55c6126177c9441a570000cc/java
 
public class WeightSort {
	public static String orderWeight(String strng) {
    if (strng.isEmpty()) {
      return strng;
    }
    
		return Arrays.stream(strng.split("\\s+"))
      .sorted()
      .map(Long::parseLong)
      .sorted(Comparator.comparing(number -> String.valueOf(number)
                                   .chars()
                                   .map(Character::getNumericValue)
                                   .sum()))
      .map(String::valueOf)
      .collect(Collectors.joining(" "));
	}
}
