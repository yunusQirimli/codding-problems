package com.yunusqirimli.leetcode;

// 1971. Find if Path Exists in Graph
// https://leetcode.com/problems/find-if-path-exists-in-graph

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class FindIfPathExistsInGraph {

  private Map<Integer, List<Integer>> graph = new HashMap<>();
  private Set<Integer> seen = new HashSet<>();
  private boolean ans = false;

  public boolean validPath(int n, int[][] edges, int source, int destination) {
    for (int i = 0; i < n; i++) {
      graph.put(i, new ArrayList<>());
    }

    for (int[] edge : edges) {
      int u = edge[0];
      int v = edge[1];
      graph.get(u).add(v);
      graph.get(v).add(u);
    }

    seen.add(source);
    dfs(source, source, destination);
    return ans;
  }

  private void dfs(int node, int source, int destination) {
    if (node == destination) {
      ans = true;
      return;
    }

    for (int neighbor : graph.get(node)) {
      if (seen.contains(neighbor)) {
        continue;
      }
      seen.add(neighbor);
      dfs(neighbor, source, destination);
    }
  }

}
