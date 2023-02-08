package com.ibrahim.dsa.day6;

import java.util.*;

public class FindIntersectionPointOfYLinkedList03 {
	class Node {
		int num;
		Node next;

		Node(int val) {
			num = val;
			next = null;
		}
	}

class TUF{
//utility function to insert node at the end of the linked list
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
 static int getDifference(Node head1,Node head2) {
     int len1 = 0,len2 = 0;
        while(head1 != null || head2 != null) {
            if(head1 != null) {
                ++len1; head1 = head1.next;
            }
            if(head2 != null) {
                ++len2; head2 = head2.next;
            }
            
        }
        return len1-len2;//if difference is neg-> length of list2 > length of list1 else vice-versa
}
//utility function to check presence of intersection
static Node intersectionPresent(Node head1,Node head2) {
   int diff = getDifference(head1,head2);
        if(diff < 0) 
            while(diff++ != 0) head2 = head2.next; 
        else while(diff-- != 0) head1 = head1.next;
        while(head1 != null) {
            if(head1 == head2) return head1;
            head2 = head2.next;
            head1 = head1.next;
        }
        return head1;

}

//utility function to print linked list created
static void printList(Node head) {
    while(head.next != null) {
    System.out.print(head.num+"->");
        head = head.next;
    }
    System.out.println(head.num);
}

public static void main(String args[]) {
    // creation of both lists 
    Node head = null;
    head=insertNode(head,1);
    head=insertNode(head,3);
    head=insertNode(head,1);
    head=insertNode(head,2);
    head=insertNode(head,4);
    Node head1 = head;
    head = head.next.next.next;
    Node headSec = null;
    headSec=insertNode(headSec,3);
    Node head2 = headSec;
    headSec.next = head;
    //printing of the lists
    System.out.print("List1: "); printList(head1);
    System.out.print("List2: "); printList(head2);
    //checking if intersection is present
    Node answerNode = intersectionPresent(head1,head2);
    if(answerNode == null)  
    System.out.println("No intersection\n");
    else
    System.out.println("The intersection point is "+answerNode.num);
    
}
}
/*
 * Output:
 * 
 * List1: 1->3->1->2->4 List2: 3->2->4 The intersection point is 2
 * 
 * Time Complexity:
 * 
 * O(2max(length of list1,length of list2))+O(abs(length of list1-length of
 * list2))+O(min(length of list1,length of list2))
 * 
 * Reason: Finding the length of both lists takes max(length of list1, length of
 * list2) because it is found simultaneously for both of them. Moving the head
 * pointer ahead by a difference of them. The next one is for searching.
 * 
 * Space Complexity: O(1)
 * 
 * Reason: No extra space is used.
 */