package com.yunusqirimli.leetcode;

// Move Zeroes
// https://leetcode.com/problems/move-zeroes

public class MoveZeroes {
  public void moveZeroes(int[] nums) {
    int zeroPointer = 0;
    int numPointer = 0;

    while (zeroPointer < nums.length && numPointer < nums.length) {
      while (zeroPointer < nums.length && nums[zeroPointer] != 0) {
        zeroPointer++;
      }

      while (numPointer < nums.length &&
          (nums[numPointer] == 0 || numPointer < zeroPointer)) {
        numPointer++;
      }

      if (zeroPointer < nums.length && numPointer < nums.length) {
        nums[zeroPointer] = nums[numPointer];
        nums[numPointer] = 0;
      }
    }
  }
}
