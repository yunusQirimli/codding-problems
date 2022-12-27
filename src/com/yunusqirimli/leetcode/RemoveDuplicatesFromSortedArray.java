package com.yunusqirimli.leetcode;

// Remove Duplicates from Sorted Array
// https://leetcode.com/problems/remove-duplicates-from-sorted-array/

public class RemoveDuplicatesFromSortedArray {

  public int removeDuplicates(int[] nums) {
    int insertIndex = 1;
    for (int i = 1; i < nums.length; i++) {
      if (nums[i] != nums[i-1]) {
        nums[insertIndex] = nums[i];
        insertIndex++;
      }
    }
    return insertIndex;
  }

}
