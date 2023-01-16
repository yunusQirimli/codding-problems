package com.yunusqirimli.leetcode;

// Integer to Roman
// leetcode.com/problems/integer-to-roman

import java.util.LinkedHashMap;
import java.util.Map;

public class IntegerToRoman {

  public static void main(String[] args) {
    System.out.println(new IntegerToRoman().intToRoman(2000));
  }

  private final int[] ints = {1, 4, 5, 9, 10, 40, 50, 90, 100, 400, 500, 900, 1000};
  private final Map<Integer, String> intToRomanMap;

  public IntegerToRoman() {
    intToRomanMap = new LinkedHashMap<>();
    intToRomanMap.put(1, "I");
    intToRomanMap.put(4, "IV");
    intToRomanMap.put(5, "V");
    intToRomanMap.put(9, "IX");
    intToRomanMap.put(10, "X");
    intToRomanMap.put(40, "XL");
    intToRomanMap.put(50, "L");
    intToRomanMap.put(90, "XC");
    intToRomanMap.put(100, "C");
    intToRomanMap.put(400, "CD");
    intToRomanMap.put(500, "D");
    intToRomanMap.put(900, "CM");
    intToRomanMap.put(1000, "M");
  }

  public String intToRoman(int num) {
    StringBuilder roman = new StringBuilder();
    int division = 10;
    while (num != 0) {
      roman.insert(0, toRoman(num % division));
      num -= num % division;
      division *= 10;
    }
    return roman.toString();
  }

  private String toRoman(int num) {
    StringBuilder roman = new StringBuilder();
    int tmpNum = num;
    int i = 0;
    while (num > 0) {
      if (intToRomanMap.containsKey(num)) {
        roman.append(intToRomanMap.get(num));
      } else {
        while (ints[i] < num && i < ints.length - 1) {
          i++;
        }
        tmpNum = i == ints.length - 1 ? ints[ints.length - 1] : ints[i - 1];
        roman.append(intToRomanMap.get(tmpNum));
        i = 0;
      }
      num -= tmpNum;
    }
    return roman.toString();
  }

}
