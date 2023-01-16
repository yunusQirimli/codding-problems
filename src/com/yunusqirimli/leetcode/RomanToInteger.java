package com.yunusqirimli.leetcode;

// Roman to Integer
// https://leetcode.com/problems/roman-to-integer

import java.util.Map;

public class RomanToInteger {

  private final Map<Character, Integer> romanToInt = Map.of(
      'I', 1,
      'V', 5,
      'X', 10,
      'L', 50,
      'C', 100,
      'D', 500,
      'M', 1000
  );

  public int romanToInt(String s) {
    int[] ints = new int[s.length()];
    for (int i = 0; i < s.length(); i++) {
      ints[i] = romanToInt.get(s.charAt(i));
    }
    return sum(ints);
  }

  private int sum(int[] ints) {
    int sum = 0;
    for (int i = 0; i < ints.length; i++) {
      if (i + 1 < ints.length && ints[i] < ints[i + 1]) {
        sum += ints[i + 1] - ints[i];
        i++;
      } else {
        sum += ints[i];
      }
    }
    return sum;
  }

}
