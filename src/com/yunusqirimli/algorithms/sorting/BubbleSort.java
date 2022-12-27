package com.yunusqirimli.algorithms.sorting;

import java.util.Arrays;

public class BubbleSort {

  public static void main(String[] args) {
    final int[] arr = new int[]{5,2,7,3,5,4};
    new BubbleSort().sort(arr);
    System.out.println(Arrays.toString(arr));
  }

  public void sort(int[] arr) {
    int tmpValue;
    for (int i = arr.length - 1; i > 0; i--) {
      for (int j = 0; j < i; j++) {
        if (arr[j] > arr[j+1]) {
          tmpValue = arr[j];
          arr[j] = arr[j+1];
          arr[j+1] = tmpValue;
        }
      }
    }
  }
}
