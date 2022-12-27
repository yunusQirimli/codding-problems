package com.yunusqirimli.algorithms.search;

public class BinarySearch {

  public static void main(String[] args) {
    int[] arr = {0, 5, 10, 13, 25, 100};
    System.out.println(new BinarySearch().search(arr, 0, 5, 100));
  }

  public int search(int[] arr, int start, int end, int num) {
    if (start > end) {
      return -1;
    }

    int mid = ((end - start) / 2) + start;
    if (arr[mid] > num) {
      return search(arr, start, --mid, num);
    } else if (arr[mid] < num) {
      return search(arr, ++mid, end, num);
    } else {
      return mid;
    }
  }
}
