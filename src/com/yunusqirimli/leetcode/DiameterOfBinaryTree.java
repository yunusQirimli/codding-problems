package com.yunusqirimli.leetcode;

// Diameter of Binary Tree
// https://leetcode.com/problems/diameter-of-binary-tree

public class DiameterOfBinaryTree {

  private int diameter = 0;

  public int diameterOfBinaryTree(TreeNode root) {
    dfs(root);
    return diameter;
  }

  private int dfs(TreeNode root) {
    if (root == null) {
      return 0;
    }

    if (root.left == null && root.right == null) {
      return 0;
    }

    int left = root.left == null ? -1 : dfs(root.left);
    int right = root.right == null ? -1 : dfs(root.right);
    left++;
    right++;
    diameter = Math.max(diameter, left + right);

    return Math.max(left, right);
  }

}
