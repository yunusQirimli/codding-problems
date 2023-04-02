package com.yunusqirimli.leetcode;

// 1167. Minimum Cost to Connect Sticks
// https://leetcode.com/problems/minimum-cost-to-connect-sticks

import java.util.PriorityQueue;

public class MinimumCostToConnectSticks {
  public int connectSticks(int[] sticks) {
    PriorityQueue<Integer> heap = new PriorityQueue<>();
    for (int stick : sticks) {
      heap.add(stick);
    }

    int minCost = 0;
    while (heap.size() > 1) {
      int cost = heap.remove() + heap.remove();
      heap.add(cost);
      minCost += cost;
    }

    return minCost;
  }
}
