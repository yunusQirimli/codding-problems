package com.yunusqirimli.leetcode;

// Reverse Words in a String III
// https://leetcode.com/problems/reverse-words-in-a-string-iii

public class ReverseWordsInAStringIII {

  public static void main(String[] args){
    System.out.println(new ReverseWordsInAStringIII().reverseWords("Let's go"));
  }

  public String reverseWords(String s) {
    if (s.isEmpty()) {
      return s;
    }

    int index = -1;
    int left, right;
    final char[] result = s.toCharArray();

    while (index < s.length()) {
      left = index + 1;
      do {
        index++;
      } while (index != s.length() && s.charAt(index) != ' ');
      right = index - 1;
      while (left < right) {
        result[left] = s.charAt(right);
        result[right] = s.charAt(left);
        left++;
        right--;
      }
    }
    return new String(result);
  }
}
