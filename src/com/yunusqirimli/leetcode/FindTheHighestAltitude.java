package com.yunusqirimli.leetcode;

// Find the Highest Altitude
// https://leetcode.com/problems/find-the-highest-altitude

public class FindTheHighestAltitude {

  public int largestAltitude(int[] gain) {
    int max = 0;
    max = Math.max(max, gain[0]);

    for (int i = 1; i < gain.length; i++) {
      gain[i] = gain[i - 1] + gain[i];
      max = Math.max(max, gain[i]);
    }

    return max;
  }

}
