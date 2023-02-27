package com.yunusqirimli.leetcode;

import java.util.Stack;

public class MakeTheStringGreat {

  public static void main(String[] args) {
    new MakeTheStringGreat().makeGood("Pp");
  }

  public String makeGood(String s) {
    Stack<Character> stack = new Stack<>();

    for (char c : s.toCharArray()) {
      if (!stack.isEmpty() && Math.abs(stack.lastElement() - c) == 32) {
          stack.pop();
          continue;
      }

      stack.push(c);
    }

    StringBuilder sb = new StringBuilder();
    while (!stack.isEmpty()) {
      sb.append(stack.pop());
    }

    return sb.reverse().toString();
  }

}
