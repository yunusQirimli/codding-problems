package com.yunusqirimli.interviewbit.arrays;

import java.util.ArrayList;
import java.util.List;

// https://www.interviewbit.com/problems/spiral-order-matrix-i/
public class SpiralOrderMatrixI {
  public static void main(String[] args) {

    ArrayList<Integer> row1 = new ArrayList<>() {{add(1); add(2); add(3); }};
    ArrayList<Integer> row2 = new ArrayList<>() {{add(4); add(5); add(6);}};
    ArrayList<Integer> row3 = new ArrayList<>() {{add(7); add(8); add(9);}};

    ArrayList<Integer> spiral = spiralOrder(List.of(
        row1,
        row2,
        row3
    ));

    System.out.println(spiral);
  }

  // DO NOT MODIFY THE LIST
  public static ArrayList<Integer> spiralOrder(final List<ArrayList<Integer>> A) {
    ArrayList<Integer> result = new ArrayList<>();
    // Populate result;
    int m, n;

    m = A.size();
    n = A.get(0).size();

    if (m == 0) return result;

    int dir = 0; // right
    int row, col, layer;
    row = col = layer = 0;

    result.add(A.get(0).get(0));

    for (int step = 1; step < m * n; step++) {

      switch (dir) {
          // Go right
        case 0:
          if (col == n - layer - 1) {
            dir = 1;
            row++;
          } else {
            col++;
          }
          break;

          // Go down
        case 1:
          if (row == m - layer - 1) {
            dir = 2;
            col--;
          } else {
            row++;
          }
          break;

          // Go left
        case 2:
          if (col == layer) {
            dir = 3;
            row--;
          } else {
            col--;
          }
          break;

          // Go up
        case 3:
          if (row == layer + 1) {
            dir = 0;
            col++;
            layer++;
          } else {
            row--;
          }
          break;
      }
      result.add(A.get(row).get(col));
    }

    return result;
  }
}
