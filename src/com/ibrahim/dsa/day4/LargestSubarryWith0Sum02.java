package com.ibrahim.dsa.day4;

import java.util.*;

public class LargestSubarryWith0Sum02 {
	int maxLen(int A[], int n) {
		// Your code here
		HashMap<Integer, Integer> mpp = new HashMap<Integer, Integer>();

		int maxi = 0;
		int sum = 0;

		for (int i = 0; i < n; i++) {

			sum += A[i];

			if (sum == 0) {
				maxi = i + 1;
			} else {
				if (mpp.get(sum) != null) {

					maxi = Math.max(maxi, i - mpp.get(sum));
				} else {

					mpp.put(sum, i);
				}
			}
		}
		return maxi;
	}
}
/*
 * Time Complexity: O(N), as we are traversing the array only once
 * 
 * Space Complexity: O(N), in the worst case we would insert all array elements
 * prefix sum into our hashmap
 */