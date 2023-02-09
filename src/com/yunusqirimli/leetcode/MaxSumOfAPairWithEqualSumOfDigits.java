package com.yunusqirimli.leetcode;

// Max Sum of a Pair With Equal Sum of Digits
// https://leetcode.com/problems/max-sum-of-a-pair-with-equal-sum-of-digits

import java.util.HashMap;
import java.util.Map;

public class MaxSumOfAPairWithEqualSumOfDigits {

  public int maximumSum(int[] nums) {
    Map<Integer, Integer> map = new HashMap<>();
    int ans = -1;

    for (int num : nums) {
      int digitSum = digitSum(num);
      if (map.containsKey(digitSum)) {
        ans = Math.max(ans, map.get(digitSum) + num);
      }
      map.put(digitSum, Math.max(map.getOrDefault(digitSum, 0), num));
    }

    return ans;
  }

  private int digitSum(int num) {
    int sum = 0;
    while (num != 0) {
      sum += num % 10;
      num /= 10;
    }
    return sum;
  }

}
