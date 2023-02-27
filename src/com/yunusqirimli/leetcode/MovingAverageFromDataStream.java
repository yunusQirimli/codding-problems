package com.yunusqirimli.leetcode;

// Moving Average from Data Stream
// https://leetcode.com/problems/moving-average-from-data-stream

import java.util.LinkedList;
import java.util.Queue;

public class MovingAverageFromDataStream {

  public static void main(String[] args) {

  }

}

class MovingAverage {

  private final int windowSize;
  private double curSum = 0;
  private final Queue<Integer> values;

  public MovingAverage(int size) {
    this.windowSize = size;
    this.values = new LinkedList<>();
  }

  public double next(int val) {
    curSum += val;

    values.offer(val);
    if (values.size() > windowSize) {
      int polled = values.poll();
      curSum -= polled;
    }

    return curSum / values.size();
  }
}

/**
 * Your MovingAverage object will be instantiated and called as such:
 * MovingAverage obj = new MovingAverage(size);
 * double param_1 = obj.next(val);
 */