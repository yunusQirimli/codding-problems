package com.yunusqirimli.leetcode;

// Maximum Number of Vowels in a Substring of Given Length
// https://leetcode.com/problems/maximum-number-of-vowels-in-a-substring-of-given-length

public class MaximumNumberOfVowelsInASubstringOfGivenLength {

  public int maxVowels(String s, int k) {
    int left = 0;
    int sum = 0;
    int res = 0;

    for (int right = 0; right < s.length(); right++) {
      sum += isVowel(s.charAt(right)) ? 1 : 0;

      if ((right - left + 1) > k) {
        sum -= isVowel(s.charAt(left)) ? 1 : 0;
        left++;
      }

      res = Math.max(res, sum);
    }

    return res;

  }

  private boolean isVowel(char c) {
    return c == 'a' || c == 'e' || c == 'i'
        || c == 'o' || c == 'u';
  }

}
