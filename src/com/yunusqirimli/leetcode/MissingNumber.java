package com.yunusqirimli.leetcode;

// Missing Number
// https://leetcode.com/problems/missing-number

import java.util.HashSet;
import java.util.Set;

public class MissingNumber {

  public int missingNumber(int[] nums) {
    final Set<Integer> numsSet = new HashSet<>();
    for (int num : nums) {
      numsSet.add(num);
    }

    int counter = -1;
    while (counter <= nums.length) {
      counter++;
      if (!numsSet.contains(counter)) {
        return counter;
      }
    }
    return -1;
  }

}
