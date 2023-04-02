package com.yunusqirimli.leetcode;

// 703. Kth Largest Element in a Stream
// https://leetcode.com/problems/kth-largest-element-in-a-stream

import java.util.PriorityQueue;

public class KthLargestElementInAStream {

  public static void main(String[] args) {
    int k = 3;
    int[] nums = {4,5,8,2};
    KthLargest kthLargest = new KthLargest(k, nums);
    kthLargest.add(3);
    kthLargest.add(5);
    kthLargest.add(10);

  }

}

class KthLargest {
  private static int k;
  private PriorityQueue<Integer> heap;

  public KthLargest(int k, int[] nums) {
    this.k = k;
    heap = new PriorityQueue<>();

    for (int num: nums) {
      heap.offer(num);
    }

    while (heap.size() > k) {
      heap.poll();
    }
  }

  public int add(int val) {
    heap.offer(val);
    if (heap.size() > k) {
      heap.poll();
    }

    return heap.peek();
  }
}