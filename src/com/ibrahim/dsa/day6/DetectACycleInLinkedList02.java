package com.ibrahim.dsa.day6;

import java.util.*;

public class DetectACycleInLinkedList02 {
	class Node {
		int num;
		Node next;

		Node(int val) {
			num = val;
			next = null;
		}
	}

//utility function to insert node in the list
class TUF{
static Node insertNode(Node head,int val) {
    Node newNode = new Node(val);
    
    if(head == null) {
        head = newNode;
        return head;
    }
    
    Node temp = head;
    while(temp.next != null) temp = temp.next;
    
    temp.next = newNode;
    return head;
}

//utility function to create cycle
static void createCycle(Node head,int a,int b) {
    int cnta = 0,cntb = 0;
    Node p1 = head;
    Node p2 = head;
    while(cnta != a || cntb != b) {
        if(cnta != a) 
        {p1 = p1.next; ++cnta;}
        if(cntb != b) 
        {p2 = p2.next; ++cntb;}
    }
    p2.next = p1;
}

//utility function to detect cycle
static boolean cycleDetect(Node head) {
    if(head == null) return false;
    Node fast = head;
    Node slow = head;
        
    while(fast.next != null && fast.next.next != null) {
        fast = fast.next.next;
        slow = slow.next;
        if(fast == slow) return true;
    }
    return false;
}

public static void main(String args[]) {
    Node head = null;
    head=insertNode(head,1);
    head=insertNode(head,2);
    head=insertNode(head,3);
    head=insertNode(head,4);
    createCycle(head,1,3);//creating cycle in the list
    if(cycleDetect(head) == true)
    System.out.println("Cycle detected");
    else
    System.out.println("Cycle not detected");
    
}
}
/*
 * Output: Cycle detected
 * 
 * Time Complexity: O(N)
 * 
 * Reason: In the worst case, all the nodes of the list are visited.
 * 
 * Space Complexity: O(1)
 * 
 * Reason: No extra data structure is used.
 */