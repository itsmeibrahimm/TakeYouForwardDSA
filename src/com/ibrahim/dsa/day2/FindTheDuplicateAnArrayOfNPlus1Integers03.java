package com.ibrahim.dsa.day2;

import java.util.*;

public class FindTheDuplicateAnArrayOfNPlus1Integers03 {
	public static int findDuplicate(int[] nums) {
		int slow = nums[0];
		int fast = nums[0];
		do {
			slow = nums[slow];
			fast = nums[nums[fast]];
		} while (slow != fast);

		fast = nums[0];
		while (slow != fast) {
			slow = nums[slow];
			fast = nums[fast];
		}
		return slow;
	}

	public static void main(String args[]) {
		int arr[] = { 1, 3, 4, 2, 3 };
		System.out.println("The duplicate element is " + findDuplicate(arr));
	}
}
/*
 * Output:
 * 
 * The duplicate element is 3
 * 
 * Time complexity: O(N). Since we traversed through the array only once.
 * 
 * Space complexity: O(1).
 */
