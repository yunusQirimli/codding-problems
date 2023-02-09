package com.yunusqirimli.leetcode;

// Remove Duplicates from Sorted List
// https://leetcode.com/problems/remove-duplicates-from-sorted-list

public class RemoveDuplicatesFromSortedList {

  public static void main(String[] args) {
    ListNode head = new ListNode(1);
    head.next = new ListNode(1);
    head.next.next = new ListNode(1);
    head.next.next.next = new ListNode(2);
    head.next.next.next.next = new ListNode(3);
    new RemoveDuplicatesFromSortedList().deleteDuplicates(head);
  }

  public ListNode deleteDuplicates(ListNode head) {
    ListNode current = head;
    while (current != null && current.next != null) {
      if (current.next.val == current.val) {
        current.next = current.next.next;
      } else {
        current = current.next;
      }
    }
    return head;
  }

}


class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
