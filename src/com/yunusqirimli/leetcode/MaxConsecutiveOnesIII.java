package com.yunusqirimli.leetcode;

// Max Consecutive Ones III
// https://leetcode.com/problems/max-consecutive-ones-iii

public class MaxConsecutiveOnesIII {

  public static void main(String[] args){
    int[] nums = {1,1,1,0,0,0,1,1,1,1,0};
    System.out.println(new MaxConsecutiveOnesIII().longestOnes(nums, 2));
  }

  public int longestOnes(int[] nums, int k) {
    int left = 0, right;
    for (right = 0; right < nums.length; right++) {
      // If we included a zero in the window we reduce the value of k.
      // Since k is the maximum zeros allowed in a window.
      if (nums[right] == 0) {
        k--;
      }
      // A negative k denotes we have consumed all allowed flips and window has
      // more than allowed zeros, thus increment left pointer by 1 to keep the window size same.
      if (k < 0) {
        // If the left element to be thrown out is zero we increase k.
        k += 1 - nums[left];
        left++;
      }
    }
    return right - left;
  }

}
