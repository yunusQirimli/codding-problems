package com.yunusqirimli.leetcode;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

public class FindKClosestElements {

  public static void main(String[] args) {
    int[] arr = {1, 2, 3, 4, 5};
    int k = 4;
    int x = 3;
    new FindKClosestElements().findClosestElements(arr, k, x);
  }

    public List<Integer> findClosestElements(int[] arr, int k, int x) {
      Map<Integer, Integer> map = new HashMap<>();
      for (int i : arr) {
        map.put(i, Math.abs(i - x));
      }

      Comparator<Integer> comparator = (i1, i2) -> {
        int dif = map.get(i1) - map.get(i2);
        if (dif == 0) {
          return (i1 - i2) * -1;
        }
        return dif * -1;
      };
      PriorityQueue<Integer> heap = new PriorityQueue<>(comparator);

      for (int i : map.keySet()) {
        heap.add(i);
        if (heap.size() > k) {
          heap.remove();
        }
      }

      List<Integer> ans = new ArrayList<>();
      while (heap.size() > 0) {
        ans.add(heap.remove());
      }
      Collections.sort(ans);

      return ans;
    }

}
