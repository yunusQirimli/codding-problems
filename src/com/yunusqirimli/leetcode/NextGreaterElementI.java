package com.yunusqirimli.leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

// Next Greater Element I
// https://leetcode.com/problems/next-greater-element-i

public class NextGreaterElementI {

  public static void main(String[] args) {
    int[] arr1 = {4,1,2};
    int[] arr2 = {1,3,4,2};

    new NextGreaterElementI().nextGreaterElement(arr1, arr2);
  }

  public int[] nextGreaterElement(int[] nums1, int[] nums2) {
    Stack<Integer> stack = new Stack<>();
    Map<Integer, Integer> map = new HashMap<>();

    for (int n : nums2) {
      while (!stack.isEmpty() && n > stack.peek()) {
        map.put(stack.pop(), n);
      }
      stack.push(n);
    }

    int[] ans = new int[nums1.length];

    for (int i = 0; i < nums1.length; i++) {
      ans[i] = map.getOrDefault(nums1[i], -1);
    }

    return ans;
  }

}
