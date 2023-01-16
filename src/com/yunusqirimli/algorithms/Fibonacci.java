package com.yunusqirimli.algorithms;

public class Fibonacci {

  public static void main(String[] args) {
    new Fibonacci().recursive(30, 0, 1);
  }

  private void iterative(int border) {
    int prev = 0;
    int current = 1;
    int next = 1;
    System.out.print(prev + ", " + current);
    for (int i = 0; current <= border; i++) {
      next = prev + current;
      System.out.print(", " + next);
      prev = current;
      current = next;
    }
  }

  private void recursive(int border, int prev, int current) {
    if (prev == 0) {
      System.out.print(prev + ", " + current);
    } else if (current >= border) {
      return;
    }

    int next = prev + current;
    System.out.print(", " + next);
    prev = current;
    current = next;
    recursive(border, prev, current);
  }

}
