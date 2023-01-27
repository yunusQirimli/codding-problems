package com.yunusqirimli.leetcode;

import java.util.HashSet;
import java.util.Set;

// Check if the Sentence is Pangram
// https://leetcode.com/problems/check-if-the-sentence-is-pangram

public class CheckIfTheSentenceIsPangram {

  public boolean checkIfPangram(String sentence) {
    final String alphabet = "abcdefghijklmnopqrstuvwxyz";

    Set<Character> sentenceSet = new HashSet<>();
    for (char c : sentence.toCharArray()) {
      sentenceSet.add(c);
    }

    for (char c : alphabet.toCharArray()) {
      if (!sentenceSet.contains(c)) {
        return false;
      }
    }

    return true;
  }

}
