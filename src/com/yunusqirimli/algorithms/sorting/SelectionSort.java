package com.yunusqirimli.algorithms.sorting;

import java.util.Arrays;

public class SelectionSort {

  public static void main(String[] args) {
    final int[] arr = new int[]{5,2,7,3,5,4};
    new SelectionSort().sort(arr);
    System.out.println(Arrays.toString(arr));
  }

  public void sort(int[] arr) {
    int minValueIndex;
    int tmpValue;
    for (int i = 0; i < arr.length - 1; i++) {
      minValueIndex = i;
      for (int j = i; j < arr.length; j++) {
        if (arr[j] < arr[minValueIndex]) {
          minValueIndex = j;
        }
      }
      tmpValue = arr[i];
      arr[i] = arr[minValueIndex];
      arr[minValueIndex] = tmpValue;
    }
  }
}
