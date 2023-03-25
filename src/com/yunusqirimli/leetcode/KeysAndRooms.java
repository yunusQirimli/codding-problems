package com.yunusqirimli.leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

// 841. Keys and Rooms
// https://leetcode.com/problems/keys-and-rooms

public class KeysAndRooms {

  public static void main(String[] args) {
    List<List<Integer>> rooms = new ArrayList<>();
    rooms.add(new ArrayList<>(){{add(1);}});
    rooms.add(new ArrayList<>(){{add(2);}});
    rooms.add(new ArrayList<>(){{add(3);}});
    rooms.add(new ArrayList<>());

    new KeysAndRooms().canVisitAllRooms(rooms);
  }

  private final Set<Integer> visitedRooms = new HashSet<>();

  public boolean canVisitAllRooms(List<List<Integer>> rooms) {
    visitedRooms.add(0);
    dfs(0, rooms);
    return visitedRooms.size() == rooms.size();
  }

  private void dfs(int node, List<List<Integer>> graph) {
    for (int neighbor : graph.get(node)) {
      if (!visitedRooms.contains(neighbor)) {
        visitedRooms.add(neighbor);
        dfs(neighbor, graph);
      }
    }
  }

}
