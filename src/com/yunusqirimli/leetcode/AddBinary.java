package com.yunusqirimli.leetcode;

// Add Binary
// https://leetcode.com/problems/add-binary

public class AddBinary {

  public String addBinary(String a, String b) {
    int maxSize;
    if (a.length() > b.length()) {
      maxSize = a.length();
      b = "0".repeat(maxSize - b.length()) + b;
    } else {
      maxSize = b.length();
      a = "0".repeat(maxSize - a.length()) + a;
    }
    char[] remider = new char[maxSize];
    StringBuilder res = new StringBuilder();
    String currentRes;

    for (int i = maxSize - 1; i >= 0; i--) {
      currentRes = add(a.charAt(i), b.charAt(i));
      if (remider[i] == '1') {
        currentRes = addBinary(currentRes, "1");
      }
      if (currentRes.length() == 2 && i > 0) {
        remider[i-1] = currentRes.charAt(0);
        res.insert(0, currentRes.charAt(1));
      } else {
        res.insert(0, currentRes);
      }
    }
    return res.toString();
  }

  private String add(char a, char b) {
    if (a == '0' && b == '0') {
      return "0";
    } else if ((a == '0' && b == '1') || (a == '1' && b == '0')) {
      return "1";
    } else {
      return "10";
    }
  }
}
