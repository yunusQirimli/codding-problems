package com.yunusqirimli.interviewbit.arrays;

import java.util.ArrayList;
import java.util.Arrays;

// Minimum Lights to Activate
// https://www.interviewbit.com/problems/minimum-lights-to-activate/

public class MinimumLightsToActivate {
  public static void main(String[] args) {
    ArrayList<Integer> A = new ArrayList<>(Arrays.asList(0, 0, 1, 1, 1, 0, 0, 1));

    int B = 3;

    System.out.println(new MinimumLightsToActivate().solve(A, B));
  }

  public int solve(ArrayList<Integer> A, int B) {
    int lightRange = B - 1;
    int areaLeftIndex;
    int areaRightIndex;
    int lightedLambsCounter = 0;
    boolean areaIsLighted = false;

    int i = 0;
    while (i < A.size()) {
      areaLeftIndex = i - lightRange;
      areaRightIndex = i + lightRange;
      if (areaLeftIndex < 0) areaLeftIndex = 0;
      if (areaRightIndex >= A.size()) areaRightIndex = A.size() - 1;

      for (int j = areaRightIndex; j >= areaLeftIndex; j--) {
        if (A.get(j) == 1) {
          lightedLambsCounter++;
          i = j + lightRange;
          areaIsLighted = true;
          break;
        }
      }
      if (!areaIsLighted) {
        return -1;
      }
      areaIsLighted = false;

      i++;
    }
    return lightedLambsCounter;
  }
}



