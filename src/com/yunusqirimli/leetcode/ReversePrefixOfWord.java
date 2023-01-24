package com.yunusqirimli.leetcode;

// Reverse Prefix of Word
// https://leetcode.com/problems/reverse-prefix-of-word

public class ReversePrefixOfWord {
  public String reversePrefix(String word, char ch) {
    int firstOccurance = 0;

    for (int i = 0; i < word.length(); i++) {
      if (word.charAt(i) == ch) {
        firstOccurance = i;
        break;
      }
    }

    char[] chars = word.toCharArray();

    for (int i = 0; i < firstOccurance; i++) {
      chars[i] = word.charAt(firstOccurance);
      chars[firstOccurance] = word.charAt(i);
      firstOccurance--;
    }

    return new String(chars);
  }
}
