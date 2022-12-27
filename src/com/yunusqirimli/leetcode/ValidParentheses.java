package com.yunusqirimli.leetcode;

// Valid Parentheses
// https://leetcode.com/problems/valid-parentheses

import java.util.Map;
import java.util.Stack;

public class ValidParentheses {

  final Map<Character, Character> map = Map.of('(', ')',
      '[', ']',
      '{', '}');

  public boolean isValid(String s) {
    Stack<Character> openBrackets = new Stack<>();
    char open;
    for (char c : s.toCharArray()) {
      if (map.containsKey(c)) {
        openBrackets.push(c);
      } else {
        if (openBrackets.isEmpty()) {
          return false;
        }
        open = openBrackets.pop();
        if (map.get(open) != c) {
          return false;
        }
      }
    }
    return openBrackets.isEmpty();
  }

}
