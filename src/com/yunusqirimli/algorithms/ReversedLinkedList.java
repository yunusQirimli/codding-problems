package com.yunusqirimli.algorithms;

public class ReversedLinkedList {

  public static void main(String[] args) {

  }

  public ListNode reversed(ListNode head) {
    ListNode prev = null;
    ListNode cur = head;
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

class ListNode {
  int val;
  ListNode next;
  ListNode() {}
  ListNode(int val) { this.val = val; }
  ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

