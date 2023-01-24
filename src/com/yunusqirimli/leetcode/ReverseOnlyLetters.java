package com.yunusqirimli.leetcode;

// Reverse Only Letters
// https://leetcode.com/problems/reverse-only-letters

public class ReverseOnlyLetters {
  public String reverseOnlyLetters(String s) {
    int left = 0;
    int right = s.length() - 1;
    char[] chars = s.toCharArray();

    while(left < right) {
      if (isEngLetter(s.charAt(left)) && isEngLetter(s.charAt(right))) {
        chars[left] = s.charAt(right);
        chars[right] = s.charAt(left);
        left++;
        right--;
      } else if (!isEngLetter(s.charAt(left))) {
        left++;
      } else if (!isEngLetter(s.charAt(right))) {
        right--;
      }
    }
    return new String(chars);
  }

  private boolean isEngLetter(char c) {
    return (c >= 65 && c <= 90) || (c >= 97 && c <= 122);
  }
}
