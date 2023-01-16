package com.yunusqirimli.leetcode;

// Reverse String
// https://leetcode.com/problems/reverse-string
public class ReverseString {

  public void reverseString(char[] s) {
    int left = 0;
    int right = s.length - 1;
    char tmp;

    while (left < right) {
      tmp = s[left];
      s[left] = s[right];
      s[right] = tmp;
      left++;
      right--;
    }
  }

}
