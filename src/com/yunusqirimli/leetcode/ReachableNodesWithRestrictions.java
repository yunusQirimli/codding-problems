package com.yunusqirimli.leetcode;

// 2368. Reachable Nodes With Restrictions
// https://leetcode.com/problems/reachable-nodes-with-restrictions

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ReachableNodesWithRestrictions {

  private Map<Integer, List<Integer>> graph = new HashMap<>();
  private Set<Integer> restrictedSet = new HashSet<>();
  private Set<Integer> seen = new HashSet<>();

  public int reachableNodes(int n, int[][] edges, int[] restricted) {
    for (int i = 0; i < n; i++) {
      graph.put(i, new ArrayList<>());
    }
    for (int edge[] : edges) {
      graph.get(edge[0]).add(edge[1]);
      graph.get(edge[1]).add(edge[0]);
    }

    for (int node : restricted) {
      restrictedSet.add(node);
    }

    return dfs(0);
  }

  private int dfs(int node) {
    if (restrictedSet.contains(node)) {
      return 0;
    }
    if (seen.contains(node)) {
      return 0;
    }

    seen.add(node);

    int nodeCounter = 1;
    for (int neighbor : graph.get(node)) {
      nodeCounter += dfs(neighbor);
    }

    return nodeCounter;
  }

}
