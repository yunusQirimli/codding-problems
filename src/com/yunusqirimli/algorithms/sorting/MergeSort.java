package com.yunusqirimli.algorithms.sorting;

import java.util.Arrays;

public class MergeSort {

  public static void main(String[] args) {
    final int[] arr = new int[]{5,2,7,3,5,4};
    new MergeSort().sort(arr);
    System.out.println(Arrays.toString(arr));
  }

  public void sort(final int[] arr) {
    int arrLength = arr.length;
    if (arrLength <= 1) {
      return;
    }

    int mid = arrLength / 2;
    int[] left = new int[mid];
    System.arraycopy(arr, 0, left, 0, mid);
    int[] right = new int[arrLength - mid];
    System.arraycopy(arr, mid, right, 0, arrLength - mid);

    sort(left);
    sort(right);
    merge(left, right, arr);
  }

  private void merge(int[] left, int[] right, int[] arr) {
    int leftLen = left.length;
    int rightLen = right.length;
    int i, j, k;
    i = j = k = 0;

    while(i < leftLen && j < rightLen) {
      if (left[i] <= right[j]) {
        arr[k] = left[i];
        i++;
      } else {
        arr[k] = right[j];
        j++;
      }
      k++;
    }

    while (i < leftLen) {
      arr[k] = left[i];
      i++;
      k++;
    }
    while (j < rightLen) {
      arr[k] = right[j];
      j++;
      k++;
    }
  }

}
