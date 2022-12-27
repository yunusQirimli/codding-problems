package com.yunusqirimli.leetcode;

// Two Sum II - Input Array Is Sorted
// https://leetcode.com/problems/two-sum-ii-input-array-is-sorted

public class TwoSumIIInputArrayIsSorted {

  public int[] twoSum(int[] numbers, int target) {
    int devided;
    for (int i = 0; i < numbers.length; i++) {
      devided = target - numbers[i];
      for (int j = i + 1; j < numbers.length; j++) {
        if (numbers[j] == devided && j != i) {
          return new int[] {i + 1, j + 1};
        }
      }
    }
    return new int[0];
  }

}
