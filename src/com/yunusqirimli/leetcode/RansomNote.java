package com.yunusqirimli.leetcode;

// Ransom Note
// https://leetcode.com/problems/ransom-note/

import java.util.HashMap;
import java.util.Map;

public class RansomNote {

  public boolean canConstruct(String ransomNote, String magazine) {
    Map<Character, Integer> ransomNoteMap = new HashMap<>();
    for (char c : ransomNote.toCharArray()) {
      ransomNoteMap.put(c, ransomNoteMap.getOrDefault(c, 0) + 1);
    }

    Map<Character, Integer> magazineMap = new HashMap<>();
    for (char c : magazine.toCharArray()) {
      magazineMap.put(c, magazineMap.getOrDefault(c, 0) + 1);
    }

    for (char key : ransomNoteMap.keySet()) {
      if (!magazineMap.containsKey(key)) {
        return false;
      }

      if (magazineMap.get(key) < ransomNoteMap.get(key)) {
        return false;
      }
    }

    return true;
  }

}
