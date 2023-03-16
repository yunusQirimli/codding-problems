package com.yunusqirimli.leetcode;

// 1302. Deepest Leaves Sum
// https://leetcode.com/problems/deepest-leaves-sum

import java.util.LinkedList;
import java.util.Queue;

public class DeepestLeavesSum {

  public int deepestLeavesSum(TreeNode root) {
    if (root == null) {
      return 0;
    }

    int sum = 0;
    Queue<TreeNode> queue = new LinkedList<>();
    queue.add(root);

    while (!queue.isEmpty()) {
      int levelSize = queue.size();
      int leefCounter = 0;

      for (int i = 0; i < levelSize; i++) {
        TreeNode curNode = queue.remove();

        if (curNode.left == null && curNode.right == null) {
          leefCounter++;
          sum += curNode.val;
        }

        if (curNode.left != null) {
          queue.add(curNode.left);
        }
        if (curNode.right != null) {
          queue.add(curNode.right);
        }
      }

      if (leefCounter != levelSize) {
        sum = 0;
      }
    }

    return sum;
  }

}
