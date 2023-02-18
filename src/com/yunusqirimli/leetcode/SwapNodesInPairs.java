package com.yunusqirimli.leetcode;

// Swap Nodes in Pairs
// https://leetcode.com/problems/swap-nodes-in-pairs

public class SwapNodesInPairs {

  public static void main(String[] args) {
    ListNode head = new ListNode(1);
    head.next = new ListNode(2);
    head.next.next = new ListNode(3);
    head.next.next.next = new ListNode(4);
    head.next.next.next.next = new ListNode(5);
    new SwapNodesInPairs().swapPairs(head);
  }

  public ListNode swapPairs(ListNode head) {
    // Check edge case: linked list has 0 or 1 nodes, just return
    if (head == null || head.next == null) {
      return head;
    }

    ListNode dummy = head.next;     // Step 5
    ListNode prev = null;           // Initialize for step 3
    while (head != null && head.next != null) {
      if (prev != null) {
        prev.next = head.next;  // Step 4
      }
      prev = head;                // Step 3

      // Step 2
      ListNode nextNode = head.next.next;
      head.next.next = head;      // Step 1

      head.next = nextNode;       // Step 6
      head = nextNode;            // Move onto next pair
    }

    return dummy;
  }
}

