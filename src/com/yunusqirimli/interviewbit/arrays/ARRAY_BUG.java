package com.yunusqirimli.interviewbit.arrays;

import java.util.ArrayList;
import java.util.Scanner;

// https://www.interviewbit.com/problems/arraybug/
public class ARRAY_BUG {

  public static void main(String[] args) {
    final Scanner scanner = new Scanner(System.in);

    String[] array = scanner.nextLine().split(" ");
    int B = scanner.nextInt();

    ArrayList<Integer> A = new ArrayList<>();
    for (String s : array) {
      A.add(Integer.parseInt(s));
    }

    System.out.println(rotateArray(A, B));
  }

  public static ArrayList<Integer> rotateArray(ArrayList<Integer> A, int B) {
    ArrayList<Integer> ret = new ArrayList<Integer>();
      B = B % A.size();
      for (int i  = B; i < A.size(); i++) {
        ret.add(A.get(i));
      }
      int n = A.size() - ret.size();
      for (int i = 0; i < n; i++) {
        ret.add(A.get(i));
      }
      return ret;
  }


}
