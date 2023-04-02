package com.yunusqirimli.leetcode;

// 973. K Closest Points to Origin
// https://leetcode.com/problems/k-closest-points-to-origin

import java.util.Comparator;
import java.util.PriorityQueue;

public class KClosestPointsToOrigin {

  public static void main(String[] args) {
    int[][] points = {{3, 3}, {5, -1}, {-2, 4}};
    int k = 2;
    new KClosestPointsToOrigin().kClosest(points, k);
  }

  public int[][] kClosest(int[][] points, int k) {
    PriorityQueue<Point> heap = new PriorityQueue<>(Comparator.reverseOrder());
    for (int[] point : points) {
      heap.add(new Point(point));
      if (heap.size() > k) {
        heap.remove();
      }
    }

    int[][] ans = new int[k][2];
    for (int i = 0; i < k; i++) {
      Point point = heap.remove();
      ans[i][0] = point.getX();
      ans[i][1] = point.getY();
    }

    return ans;
  }

}

class Point implements Comparable<Point> {
  private int x;
  private int y;
  private Double distance;

  public Point(int[] point) {
    x = point[0];
    y = point[1];
    distanceToOrigin();
  }

  public double distanceToOrigin() {
    if (distance == null) {
      distance = Math.sqrt(Math.pow((x), 2) + Math.pow((y), 2));
    }
    return distance;
  }

  public int getX() {
    return x;
  }

  public int getY() {
    return y;
  }

  @Override
  public int compareTo(Point p) {
    return this.distance.compareTo(p.distance);
  }
}
