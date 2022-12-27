package com.yunusqirimli.interviewbit.arrays;

// Min Steps in Infinite Grid
// https://www.interviewbit.com/problems/min-steps-in-infinite-grid/

import java.util.ArrayList;
import java.util.Arrays;

public class MinStepsInInfiniteGrid {
  public static void main(String[] args) {
    ArrayList<Integer> A = new ArrayList<>(Arrays.asList(-7, -13));
    ArrayList<Integer> B = new ArrayList<>(Arrays.asList(1, -5));

    System.out.println(new Solution().coverPoints(A, B));
  }
}

class Solution {
  public int coverPoints(ArrayList<Integer> A, ArrayList<Integer> B) {
    if(A.size() == 0)
      return 0;

    ArrayList<Integer> pointsAbs = new ArrayList<>();
    int absX;
    int absY;

    for (int i = 0; i < A.size() - 1; i++) {
      absX = Math.abs(A.get(i) - A.get(i+1));
      absY = Math.abs(B.get(i) - B.get(i+1));
      pointsAbs.add(Math.max(absX, absY));
    }
    return pointsAbs.stream().reduce(0, Integer::sum);
  }
}