package com.yunusqirimli.leetcode;

// Richest Customer Wealth
// https://leetcode.com/problems/richest-customer-wealth/description/

public class RichestCustomerWealth {
  public int maximumWealth(int[][] accounts) {
    int maxWealth = 0;
    int customerWealth = 0;
    for (int i = 0; i < accounts.length; i++) {
      for (int j = 0; j < accounts[i].length; j++) {
        customerWealth += accounts[i][j];
      }
      if (customerWealth > maxWealth) {
        maxWealth = customerWealth;
      }
      customerWealth = 0;
    }
    return maxWealth;
  }
}
