package com.yunusqirimli.leetcode;

// Merge Sorted Array
// https://leetcode.com/problems/merge-sorted-array/

public class MergeSortedArray {

  public void merge(int[] nums1, int m, int[] nums2, int n) {
    int[] nums1Coppy = new int[m];
    System.arraycopy(nums1, 0, nums1Coppy, 0, m);
    int i = 0;
    int j = 0;
    int k = 0;

    while (i < m && j < n) {
      if (nums1Coppy[i] < nums2[j]) {
        nums1[k] = nums1Coppy[i];
        i++;
      } else if (nums1Coppy[i] > nums2[j]) {
        nums1[k] = nums2[j];
        j++;
      } else {
        nums1[k] = nums1Coppy[i];
        k++;
        nums1[k] = nums2[j];
        i++;
        j++;
      }
      k++;
    }

    while (i < m) {
      nums1[k] = nums1Coppy[i];
      i++;
      k++;
    }
    while (j < n) {
      nums1[k] = nums2[j];
      j++;
      k++;
    }

  }

}
