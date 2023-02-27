package com.yunusqirimli.leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

// Online Stock Span
// https://leetcode.com/problems/online-stock-span
public class OnlineStockSpan {
}

class StockSpanner {

  final Stack<Integer> stack;
  final Map<Integer, Integer> map;

  public StockSpanner() {
    stack = new Stack<>();
    map = new HashMap<>();
  }

  public int next(int price) {
    int days = 1;

    while (!stack.isEmpty() && price >= stack.peek()) {
      days += map.get(stack.pop());
    }

    stack.push(price);
    map.put(price, days);

    return days;
  }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */
