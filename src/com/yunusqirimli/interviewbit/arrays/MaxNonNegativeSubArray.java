package com.yunusqirimli.interviewbit.arrays;

// Max Non Negative SubArray
//https://www.interviewbit.com/problems/max-non-negative-subarray/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

public class MaxNonNegativeSubArray {

  public static void main(String[] args) {
    ArrayList<Integer> A = new ArrayList<>(Arrays.asList(1967513926, 1540383426, -1303455736, -521595368));
    System.out.println(maxset(A));
  }

  public static ArrayList<Integer> maxset(ArrayList<Integer> A) {
    if (A.size() == 0)
      return new ArrayList<>();

    final Map<ArrayList<Integer>, Long> sumAndSubArr = new LinkedHashMap<>();
    long sum = 0;

    // get all sub arrays and their sums
    for (int i = 0; i < A.size(); i++) {
      if (A.get(i) >= 0) {
        ArrayList<Integer> subArray = new ArrayList<>();
        while (i < A.size() && A.get(i) >= 0) {
          subArray.add(A.get(i));
          i++;
        }
        // calculate the sum of sub array
        for (int j = 0; j < subArray.size(); j++) {
          sum += subArray.get(j);
        }
        sumAndSubArr.put(subArray, sum);
        sum = 0;
      }
    }

    // compare sums and remove less entries
    long highestSum = 0;
    for(Long subArrSum : sumAndSubArr.values()) {
      if (subArrSum > highestSum)
        highestSum = subArrSum;
    }
    long finalHighestSum = highestSum;
    sumAndSubArr.entrySet().removeIf(entry -> entry.getValue() < finalHighestSum);

    // define Max Non-Negative SubArray
    if (sumAndSubArr.size() == 1)
      return sumAndSubArr.entrySet().stream().findFirst().get().getKey();
    else if (sumAndSubArr.size() > 1) {
      // compare their sizes
      int maxSize = 0;
      // index of subArray with max length
      int index = -1;
      // get index of max size sub array
      for(ArrayList<Integer> subArr : sumAndSubArr.keySet()) {
        if (subArr.size() > maxSize) {
          maxSize = subArr.size();
          index++;
        }
      }
      // find and return sub array with max size
      int iterator = 0;
      for(Map.Entry<ArrayList<Integer>, Long> entry : sumAndSubArr.entrySet()) {
        if (iterator == index) {
          return entry.getKey();
        }
        iterator++;
      }
    } else if (sumAndSubArr.size() != 0) {
      return sumAndSubArr.entrySet().iterator().next().getKey();
    }

    return new ArrayList<>();
  }
}

