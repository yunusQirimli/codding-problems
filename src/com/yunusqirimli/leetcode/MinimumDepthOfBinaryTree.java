package com.yunusqirimli.leetcode;

// Minimum Depth of Binary Tree
// https://leetcode.com/problems/minimum-depth-of-binary-tree
public class MinimumDepthOfBinaryTree {

  public int minDepth(TreeNode root) {
    if (root == null) {
      return 0;
    }

    if (root.left == null && root.right == null) {
      return 1;
    }

    int min_depth = Integer.MAX_VALUE;
    if (root.left != null) {
      min_depth = Math.min(min_depth, minDepth(root.left));
    }

    if (root.right != null) {
      min_depth = Math.min(min_depth, minDepth(root.right));
    }

    return ++min_depth;
  }

}
