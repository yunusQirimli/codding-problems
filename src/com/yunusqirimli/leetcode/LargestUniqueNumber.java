package com.yunusqirimli.leetcode;

// Largest Unique Number
// https://leetcode.com/problems/largest-unique-number

import java.util.HashMap;
import java.util.Map;

public class LargestUniqueNumber {

  public int largestUniqueNumber(int[] nums) {
    final Map<Integer, Integer> numsMap = new HashMap<>();

    for (int num : nums) {
      numsMap.put(num, numsMap.getOrDefault(num, 0) + 1);
    }

    int largest = -1;
    for (Map.Entry<Integer, Integer> entry : numsMap.entrySet()) {
      if (entry.getValue() == 1) {
        largest = Math.max(largest, entry.getKey());
      }
    }

    return largest;
  }

}
