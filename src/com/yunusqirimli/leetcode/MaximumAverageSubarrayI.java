package com.yunusqirimli.leetcode;

// Maximum Average Subarray I
// https://leetcode.com/problems/maximum-average-subarray-i

public class MaximumAverageSubarrayI {

  public static void main(String[] args){
    int[] nums = {0, 4, 0, 3, 2};
    System.out.println(new MaximumAverageSubarrayI().findMaxAverage(nums, 1));
  }

  public double findMaxAverage(int[] nums, int k) {
    double curr = 0;

    for (int i = 0; i < k; i++) {
      curr += nums[i];
    }

    double ans = curr / k;

    for (int i = k; i < nums.length; i++) {
      curr += nums[i] - nums[i - k];
      ans = Math.max(ans, curr / k);
    }

    return ans;
  }

}
