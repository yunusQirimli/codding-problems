package com.yunusqirimli.leetcode;

// 515. Find Largest Value in Each Tree Row
// https://leetcode.com/problems/find-largest-value-in-each-tree-row

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class FindLargestValueInEachTreeRow {
  public List<Integer> largestValues(TreeNode root) {
    if (root == null) {
      return Collections.emptyList();
    }

    List<Integer> ans = new ArrayList<>();
    Queue<TreeNode> queue = new LinkedList<>();

    queue.add(root);
    while (!queue.isEmpty()) {
      int levelSize = queue.size();
      int maxValue = Integer.MIN_VALUE;

      for (int i = 0; i < levelSize; i++) {
        TreeNode curNode = queue.remove();
        maxValue = Math.max(maxValue, curNode.val);

        if (curNode.left != null) {
          queue.add(curNode.left);
        }
        if (curNode.right != null) {
          queue.add(curNode.right);
        }
      }

      ans.add(maxValue);
    }

    return ans;
  }
}


