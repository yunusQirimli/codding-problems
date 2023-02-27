package com.yunusqirimli.leetcode;

// Daily Temperatures
// https://leetcode.com/problems/daily-temperatures

import java.util.Stack;

public class DailyTemperatures {

  public int[] dailyTemperatures(int[] temperatures) {
    Stack<Integer> stack = new Stack<>();
    int[] ans = new int[temperatures.length];

    for (int i = 0; i < temperatures.length; i++) {
      while (!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]) {
        int j = stack.pop();
        ans[j] = i - j;
      }

      stack.push(i);
    }

    return ans;
  }

}
