package com.yunusqirimli.leetcode;

// Find Players With Zero or One Losses
// https://leetcode.com/problems/find-players-with-zero-or-one-losses

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindPlayersWithZeroOrOneLosses {

  public List<List<Integer>> findWinners(int[][] matches) {
    final Map<Integer, Integer> winnersMap = new HashMap<>();
    final Map<Integer, Integer> losersMap = new HashMap<>();

    for (int[] match : matches) {
      winnersMap.put(match[0], winnersMap.getOrDefault(match[0], 0) + 1);
      losersMap.put(match[1], losersMap.getOrDefault(match[1], 0) + 1);
    }

    final List<Integer> winners = new ArrayList<>();
    for (int winner : winnersMap.keySet()) {
      if (!losersMap.containsKey(winner)) {
        winners.add(winner);
      }
    }
    Collections.sort(winners);

    final List<Integer> losers = new ArrayList<>();
    for (Map.Entry<Integer, Integer> loserEntry : losersMap.entrySet()) {
      if (loserEntry.getValue() == 1) {
        losers.add(loserEntry.getKey());
      }
    }
    Collections.sort(losers);

    return List.of(winners, losers);
  }

}
