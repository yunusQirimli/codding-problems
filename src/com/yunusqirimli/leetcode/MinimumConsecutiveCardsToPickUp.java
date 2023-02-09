package com.yunusqirimli.leetcode;

// Minimum Consecutive Cards to Pick Up
// https://leetcode.com/problems/minimum-consecutive-cards-to-pick-up

import java.util.HashMap;
import java.util.Map;

public class MinimumConsecutiveCardsToPickUp {

  public static void main(String[] args) {
    int[] card = {70,37,70,41,1,62,71,49,38,50,29,76,29,41,22,66,88,18,85,53};
    System.out.println(new MinimumConsecutiveCardsToPickUp().minimumCardPickup(card));
  }

  public int minimumCardPickup(int[] cards) {
    int left = 0;
    int ans = Integer.MAX_VALUE;
    Map<Integer, Integer> map = new HashMap<>();

    int curNum;
    for (int right = 0; right < cards.length; right++) {
      curNum = cards[right];
      map.put(curNum, map.getOrDefault(curNum, 0) + 1);

      while (left < right && map.get(curNum) > 1) {
        ans = Math.min(ans, right - left + 1);
        map.put(cards[left], map.get(cards[left]) - 1);
        if (map.get(cards[left]) == 0) {
         map.remove(cards[left]);
        }
        left++;
      }
    }

    return ans == Integer.MAX_VALUE ? -1 : ans;
  }

}
