package com.ibrahim.dsa.day2;

import java.util.*;

public class FindTheDuplicateAnArrayOfNPlus1Integers02 {
	static int findDuplicate(int[] arr) {
		int n = arr.length;
		int freq[] = new int[n + 1];
		for (int i = 0; i < n; i++) {
			if (freq[arr[i]] == 0) {
				freq[arr[i]] += 1;
			} else {
				return arr[i];
			}
		}
		return 0;
	}

	public static void main(String args[]) {
		int arr[] = { 1, 3, 4, 2, 3 };
		System.out.println("The duplicate element is " + findDuplicate(arr));
	}
}
/*
 * Output: The duplicate element is 3
 * 
 * Time Complexity: O(N), as we are traversing through the array only once.
 * 
 * Space Complexity: O(N), as we are using extra space for frequency array.
 */