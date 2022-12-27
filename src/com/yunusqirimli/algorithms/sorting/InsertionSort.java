package com.yunusqirimli.algorithms.sorting;

import java.util.Arrays;

public class InsertionSort {

  public static void main(String[] args) {
    final int[] arr = new int[]{5,2,7,3,5,4};
    new InsertionSort().sort(arr);
    System.out.println(Arrays.toString(arr));
  }

  public void sort(final int[] arr) {
    int tmpVal;
    int j;
    for (int i = 1; i < arr.length; i++) {
      tmpVal = arr[i];
      j = i-1;
      while (j >= 0 && arr[j] > tmpVal) {
        arr[j+1] = arr[j];
        j--;
      }
      arr[j+1] = tmpVal;
    }
  }
}
