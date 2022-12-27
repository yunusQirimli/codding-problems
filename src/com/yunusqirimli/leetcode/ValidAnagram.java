package com.yunusqirimli.leetcode;

// Valid Anagram
// https://leetcode.com/problems/valid-anagram

import java.util.Arrays;

public class ValidAnagram {

  public boolean isAnagram(String s, String t) {
    if (s.length() != t.length()) {
      return false;
    }
    final char[] sArr = s.toCharArray();
    Arrays.sort(sArr);
    final char[] tArr = t.toCharArray();
    Arrays.sort(tArr);
    return Arrays.equals(sArr, tArr);
  }

}
