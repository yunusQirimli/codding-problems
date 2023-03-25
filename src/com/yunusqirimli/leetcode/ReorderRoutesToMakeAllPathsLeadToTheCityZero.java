package com.yunusqirimli.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ReorderRoutesToMakeAllPathsLeadToTheCityZero {

  public static void main(String[] args) {
    int[][] connections = new int[][] {{0,1}, {1,3}, {2,3}, {4,0}, {4,5}};
    int n = 6;
    new ReorderRoutesToMakeAllPathsLeadToTheCityZero().minReorder(n, connections);
  }

  private Map<Integer, List<Integer>> graph;
  private boolean[] seen;
  int ans = 0;

  public int minReorder(int n, int[][] connections) {
    graph = new HashMap<>();
    for (int[] connection : connections) {
      int x = connection[0];
      int y = connection[1];
      if (!graph.containsKey(x)) {
        graph.put(x, new ArrayList<>());
      }
      if (!graph.containsKey(y)) {
        graph.put(y, new ArrayList<>());
      }
      graph.get(x).add(y);
      graph.get(y).add(x);
    }

    seen = new boolean[n];
    for (int i = 0; i < n-1; i++) {
      if (!seen[i]) {
        seen[i] = true;
        dfs(i, connections);
      }
    }

    return ans;
  }

  private void dfs(int node, int[][] connections) {
    for (int neighbor : graph.get(node)) {
      if (!seen[neighbor]) {
        seen[neighbor] = true;
        if (connections[node][0] == node && connections[node][1] == neighbor) {
          ans++;
        }
        dfs(neighbor, connections);
      }
    }
  }

}
