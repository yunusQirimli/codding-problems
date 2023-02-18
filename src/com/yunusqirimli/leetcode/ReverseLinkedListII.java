package com.yunusqirimli.leetcode;

// Reverse Linked List II
// https://leetcode.com/problems/reverse-linked-list-ii

public class ReverseLinkedListII {

  public static void main(String[] args) {
    ListNode head = new ListNode(1);
    head.next = new ListNode(2);
    head.next.next = new ListNode(3);
    new ReverseLinkedListII().reverseBetween(head, 3, 3);
  }

  public ListNode reverseBetween(ListNode head, int left, int right) {
    if (head.next == null) {
      return head;
    }

    int counter = 1;

    // find the left node
    ListNode leftN = head;
    ListNode prev = null;
    while (leftN.next != null && counter < left) {
      prev = leftN;
      leftN = leftN.next;
      counter++;
    }
    // find the right node
    ListNode rightN = leftN;
    while (rightN.next != null && counter < right) {
      rightN = rightN.next;
      counter++;
    }

    // head of reversed part
    ListNode reversedHead = reverse(leftN, rightN);

    // if list was reversed from first element
    if (prev == null) {
      return reversedHead;
    }

    prev.next = reversedHead;
    return head;
  }

  private ListNode reverse(ListNode leftN, ListNode rightN) {
    ListNode cur = leftN;
    ListNode prev = rightN.next;
    ListNode next = null;

    while (prev != rightN) {
      next = cur.next;
      cur.next = prev;
      prev = cur;
      cur = next;
    }

    return prev;
  }

}
