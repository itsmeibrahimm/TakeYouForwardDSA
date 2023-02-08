package com.ibrahim.dsa.day4;

import java.util.*;

public class LargestSubarrayWith0Sum01 {
	static int solve(int[] a) {
		int max = 0;
		for (int i = 0; i < a.length; ++i) {
			int sum = 0;
			for (int j = i; j < a.length; ++j) {
				sum += a[j];
				if (sum == 0) {
					max = Math.max(max, j - i + 1);
				}
			}
		}
		return max;
	}

	public static void main(String args[]) {
		int a[] = { 9, -3, 3, -1, 6, -5 };
		System.out.println(solve(a));
	}
}
/*
 * Time Complexity: O(N^2) as we have two loops for traversal
 * 
 * Space Complexity : O(1) as we aren’t using any extra space.
 * 
 * Can this be done in single traversal? Let’s check
 */