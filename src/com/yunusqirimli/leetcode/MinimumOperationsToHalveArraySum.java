package com.yunusqirimli.leetcode;

// 2208. Minimum Operations to Halve Array Sum
// https://leetcode.com/problems/minimum-operations-to-halve-array-sum

import java.util.Comparator;
import java.util.PriorityQueue;

public class MinimumOperationsToHalveArraySum {

  public int halveArray(int[] nums) {
    PriorityQueue<Double> heap = new PriorityQueue<>(Comparator.reverseOrder());
    double curSum = 0;

    for (int num : nums) {
      curSum += num;
      heap.add((double) num);
    }


    double targetSum = curSum / 2;
    int counter = 0;

    while(curSum > targetSum) {
      double devided = heap.remove() / 2;
      heap.add(devided);
      curSum -= devided;
      counter++;
    }

    return counter;
  }

}
