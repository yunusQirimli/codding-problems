package com.yunusqirimli.leetcode;

// 695. Max Area of Island
// https://leetcode.com/problems/max-area-of-island

public class MaxAreaOfIsland {

  public int maxAreaOfIsland(int[][] grid) {
    int ans = 0;
    for (int i = 0; i < grid.length; i++) {
      for (int j = 0; j < grid[0].length; j++) {
        if (grid[i][j] == 1) {
          ans = Math.max(ans, dfs(i, j, grid));
        }
      }
    }

    return ans;
  }

  private int dfs(int i, int j, int[][] grid) {
    if ((i < 0 || i >= grid.length)
        || (j < 0 || j >= grid[0].length)) {
      return 0;
    }
    if (grid[i][j] != 1) {
      return 0;
    }

    grid[i][j] = 2;

    int top = dfs(i-1, j, grid);
    int bottom = dfs(i+1, j, grid);
    int right = dfs(i, j+1, grid);
    int left = dfs(i, j-1, grid);

    return 1 + top + bottom + right + left;
  }

}
