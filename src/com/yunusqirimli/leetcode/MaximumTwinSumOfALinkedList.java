package com.yunusqirimli.leetcode;

// Maximum Twin Sum of a Linked List
// https://leetcode.com/problems/maximum-twin-sum-of-a-linked-list

public class MaximumTwinSumOfALinkedList {

  public int pairSum(ListNode head) {
    ListNode reversedHead = reverse(getMidNode(head));

    int maxSum = -1;
    ListNode s = head, f = reversedHead;
    while (f != null) {
      maxSum = Math.max(maxSum, s.val + f.val);
      s = s.next;
      f = f.next;
    }

    return maxSum;
  }

  private ListNode getMidNode(ListNode head) {
    ListNode s = head, f = head;
    while (f != null) {
      s = s.next;
      f = f.next.next;
    }
    return s;
  }

  private ListNode reverse(ListNode head) {
    ListNode cur = head;
    ListNode prev = null;
    ListNode next;
    while (cur != null) {
      next = cur.next;
      cur.next = prev;
      prev = cur;
      cur = next;
    }
    return prev;
  }
}
