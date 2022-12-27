package com.yunusqirimli.algorithms.sorting;

import java.util.Arrays;

public class QuickSort {

  public static void main(String[] args) {
    //final int[] arr = new int[]{5,2,7,3,5,4};
    final int[] arr = new int[]{3,1,9,6,5};
    new QuickSort().sort(arr, 0, arr.length - 1);
    System.out.println(Arrays.toString(arr));
  }

  public void sort(int[] arr, int start, int end) {
    int pIndex;
    if (start < end) {
      pIndex = partition(arr, start, end);
      sort(arr, start, pIndex - 1);
      sort(arr, pIndex + 1, end);
    }
  }

  private int partition(int[] arr, int start, int end) {
    int pivot = arr[end];
    int partitionIndex = start;
    for (int i = start; i < end; i++) {
      if (arr[i] <= pivot) {
        swap(arr, i, partitionIndex);
        partitionIndex++;
      }
    }
    swap(arr, partitionIndex, end);
    return partitionIndex;
  }

  private void swap(int[] arr, int index1, int index2) {
    int tmpValue = arr[index1];
    arr[index1] = arr[index2];
    arr[index2] = tmpValue;
  }

}
