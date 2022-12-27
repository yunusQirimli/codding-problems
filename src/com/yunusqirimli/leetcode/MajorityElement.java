package com.yunusqirimli.leetcode;

// Majority Element
// https://leetcode.com/problems/majority-element/

public class MajorityElement {

  public int majorityElement(int[] nums) {
    int counter = 0;
    int candidate = 0;
    for (int num : nums) {
      if (counter == 0) {
        candidate = num;
      }
      counter += (num == candidate) ? 1 : -1;
    }
    return candidate;
  }

}
