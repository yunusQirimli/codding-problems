package com.yunusqirimli.leetcode;

// 323. Number of Connected Components in an Undirected Graph
// https://leetcode.com/problems/number-of-connected-components-in-an-undirected-graph

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class NumberOfConnectedComponentsInAnUndirectedGraph {

  private Map<Integer, List<Integer>> graph = new HashMap<>();
  private Set<Integer> seen = new HashSet<>();

  public int countComponents(int n, int[][] edges) {
    for (int i = 0; i < n; i++) {
      graph.put(i, new ArrayList<>());
    }

    for (int[] edge : edges) {
      graph.get(edge[0]).add(edge[1]);
      graph.get(edge[1]).add(edge[0]);
    }

    int ans = 0;
    for (int i = 0; i < n; i++) {
      if (!seen.contains(i)) {
        ans++;
        seen.add(i);
        dfs(i);
      }
    }

    return ans;
  }

  private void dfs(int node) {
    for (int neighbor : graph.get(node)) {
      if (!seen.contains(neighbor)) {
        seen.add(neighbor);
        dfs(neighbor);
      }
    }
  }

}
