package com.yunusqirimli.leetcode;

// 701. Insert into a Binary Search Tree
// https://leetcode.com/problems/insert-into-a-binary-search-tree

public class InsertIntoABinarySearchTree {

  public TreeNode insertIntoBST(TreeNode root, int val) {
    if (root == null) {
      return new TreeNode(val);
    }
    insert(null, root, val);
    return root;
  }

  private void insert(TreeNode prev, TreeNode cur, int val) {
    if (cur == null) {
      cur = new TreeNode(val);
      if (prev.val > val) {
        prev.left = cur;
      } else {
        prev.right = cur;
      }
      return;
    }

    if (cur.val > val) {
      insert(cur, cur.left, val);
    } else {
      insert(cur, cur.right, val);
    }
  }

}
