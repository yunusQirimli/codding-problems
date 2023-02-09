package com.yunusqirimli.leetcode;

// Group Anagrams
// https://leetcode.com/problems/group-anagrams

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagrams {

  public List<List<String>> groupAnagrams(String[] strs) {
    Map<String, List<String>> groupMap = new HashMap<>();

    for (String s : strs) {
      char[] chars = s.toCharArray();
      Arrays.sort(chars);
      String sorted = new String(chars);
      if (!groupMap.containsKey(sorted)) {
        groupMap.put(sorted, new ArrayList<>());
      }
      groupMap.get(sorted).add(s);
    }

    return new ArrayList<>(groupMap.values());
  }

}
