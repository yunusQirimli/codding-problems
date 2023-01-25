package com.yunusqirimli.leetcode;

// Minimum Size Subarray Sum
// https://leetcode.com/problems/minimum-size-subarray-sum

public class MinimumSizeSubarraySum {

  public static void main(String[] args){
    int[] nums = {1,4,4};
    System.out.println(new MinimumSizeSubarraySum().minSubArrayLen(4, nums));
  }

  public int minSubArrayLen(int target, int[] nums) {
    int left = 0;
    int sum = 0;
    int minLen = Integer.MAX_VALUE;

    for (int right = 0; right < nums.length; right++) {
      sum += nums[right];

      while (sum >= target) {
        minLen = Math.min(minLen, right - left + 1);
        sum -= nums[left];
        left++;
      }
    }

    return minLen == Integer.MAX_VALUE ? 0 : minLen;
  }

}
