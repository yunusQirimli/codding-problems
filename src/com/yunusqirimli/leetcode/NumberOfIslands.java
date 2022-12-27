package com.yunusqirimli.leetcode;

// Number of Islands
// https://leetcode.com/problems/number-of-islands

public class NumberOfIslands {
  private final char LAND = '1';
  private final char EXPLORED_LAND = 'e';

  public int numIslands(char[][] grid) {
    int islandsCounter = 0;
    for (int i = 0; i < grid.length; i++) {
      for (int j = 0; j < grid[i].length; j++) {
        if (grid[i][j] == LAND) {
          explore(grid, i, j);
          islandsCounter++;
        }
      }
    }
    return islandsCounter;
  }

  private void explore(char[][] grid, int veriticalStartIndex, int horizontalStartIndex) {
    if ((veriticalStartIndex >= 0 && veriticalStartIndex < grid.length)
        && (horizontalStartIndex >= 0 && horizontalStartIndex < grid[veriticalStartIndex].length)) {
      if (grid[veriticalStartIndex][horizontalStartIndex] == LAND) {
        grid[veriticalStartIndex][horizontalStartIndex] = EXPLORED_LAND;
        // explore one land up
        explore(grid, veriticalStartIndex - 1, horizontalStartIndex);
        // explore one land right
        explore(grid, veriticalStartIndex, horizontalStartIndex + 1);
        // explore one land down
        explore(grid, veriticalStartIndex + 1, horizontalStartIndex);
        // explore one land left
        explore(grid, veriticalStartIndex, horizontalStartIndex - 1);
      }
    }
  }

}
