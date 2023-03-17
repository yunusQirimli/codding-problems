package com.yunusqirimli.leetcode;

// 270. Closest Binary Search Tree Value
// https://leetcode.com/problems/closest-binary-search-tree-value

public class ClosestBinarySearchTreeValue {

  private int closest = Integer.MAX_VALUE;

  public int closestValue(TreeNode root, double target) {
    dfs(root, target);
    return closest;
  }

  private void dfs(TreeNode root, double target) {
    if (root == null) {
      return;
    }

    closest = Math.abs(closest - target) < Math.abs(root.val - target)
        ? closest : root.val;

    dfs(root.left, target);
    dfs(root.right, target);
  }

}
