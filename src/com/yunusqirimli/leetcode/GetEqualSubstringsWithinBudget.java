package com.yunusqirimli.leetcode;

// Get Equal Substrings Within Budget
// https://leetcode.com/problems/get-equal-substrings-within-budget

public class GetEqualSubstringsWithinBudget {

  public int equalSubstring(String s, String t, int maxCost) {
    int left = 0;
    int sum = 0;
    int res = 0;

    for (int right = 0; right < s.length(); right++) {
      sum += Math.abs(s.charAt(right) - t.charAt(right));

      while (left <= right && sum > maxCost) {
        sum -= Math.abs(s.charAt(left) - t.charAt(left));
        left++;
      }

      res = Math.max(res, right - left + 1);
    }

    return res;
  }

}
