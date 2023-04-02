package com.yunusqirimli.leetcode;

// 1962. Remove Stones to Minimize the Total
// https://leetcode.com/problems/remove-stones-to-minimize-the-total

import java.util.Comparator;
import java.util.PriorityQueue;

public class RemoveStonesToMinimizeTheTotal {
  public int minStoneSum(int[] piles, int k) {
    PriorityQueue<Integer> heap = new PriorityQueue<>(Comparator.reverseOrder());
    int total = 0;
    for (int pile : piles) {
      heap.add(pile);
      total += pile;
    }

    for (int i = 0; i < k; i++) {
      int max = heap.remove();
      int remove = max / 2;
      heap.add(max - remove);
      total -= remove;
    }

    return total;
  }
}
