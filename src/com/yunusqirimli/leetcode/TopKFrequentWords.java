package com.yunusqirimli.leetcode;

// 692. Top K Frequent Words
// https://leetcode.com/problems/top-k-frequent-words

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

public class TopKFrequentWords {

  public List<String> topKFrequent(String[] words, int k) {
    Map<String, Integer> freqs = new HashMap<>();
    for (String word : words) {
      freqs.put(word, freqs.getOrDefault(word, 0) + 1);
    }

    Comparator<String> comparator1 =
        (s1, s2) -> {
          int dif = freqs.get(s1) - freqs.get(s2);
          if (dif == 0) {
            return s2.compareTo(s1);
          }
          return dif;
        };

    PriorityQueue<String> heap = new PriorityQueue<>(comparator1);
    for (String word : freqs.keySet()) {
      heap.add(word);
      if (heap.size() > k) {
        heap.remove();
      }
    }

    List<String> ans = new ArrayList<>();
    for (int i = 0; i < k; i++) {
      ans.add(heap.remove());
    }

    Comparator<String> comparator2 =
        (s1, s2) -> {
          int dif = freqs.get(s2) - freqs.get(s1);
          if (dif == 0) {
            return s1.compareTo(s2);
          }
          return dif;
        };
    Collections.sort(ans, comparator2);
    return ans;
  }

}
