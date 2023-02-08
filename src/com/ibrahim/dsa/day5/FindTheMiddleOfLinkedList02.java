package com.ibrahim.dsa.day5;

import java.util.*;

public class FindTheMiddleOfLinkedList02 {

	// Definition for singly-linked list.
	public class ListNode {
		int val;
		ListNode next;

		ListNode() {
		}

		ListNode(int val) {
			this.val = val;
		}

		ListNode(int val, ListNode next) {
			this.val = val;
			this.next = next;
		}
	}

	public ListNode middleNode(ListNode head) {
		ListNode slow = head, fast = head;
		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		return slow;
	}
}
/*
 * Time Complexity: O(N)
 * 
 * Space Complexity: O(1)
 * 
 * Follow-up question you can try: Detect and remove Loop in Linked List
 */