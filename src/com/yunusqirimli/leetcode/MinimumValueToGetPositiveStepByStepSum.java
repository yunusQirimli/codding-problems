package com.yunusqirimli.leetcode;

// Minimum Value to Get Positive Step by Step Sum
// https://leetcode.com/problems/minimum-value-to-get-positive-step-by-step-sum

public class MinimumValueToGetPositiveStepByStepSum {

  public int minStartValue(int[] nums) {
    int minVal = nums[0];

    for (int i = 1; i < nums.length; i++) {
      nums[i] = nums[i - 1] + nums[i];
      minVal = Math.min(nums[i], minVal);
    }

    if (minVal < 0) {
      return minVal * -1 + 1;
    }
    return 1;
  }

}
