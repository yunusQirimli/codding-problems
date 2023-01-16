package com.yunusqirimli.leetcode;

// Squares of a Sorted Array
// https://leetcode.com/problems/squares-of-a-sorted-array

public class SquaresOfASortedArray {
  public int[] sortedSquares(int[] nums) {
    int left = 0;
    int right = nums.length - 1;
    int[] result = new int[nums.length];
    int i = result.length - 1;

    while (left <= right) {
      if (left == right) {
        result[i] = nums[left] * nums[left];
        break;
      } else if (Math.abs(nums[left]) > Math.abs(nums[right])) {
        result[i] = nums[left] * nums[left];
        left++;
      } else {
        result[i] = nums[right] * nums[right];
        right--;
      }
      i--;
    }
    return result;
  }
}
