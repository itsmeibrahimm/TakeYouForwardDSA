package com.ibrahim.dsa.day4;

import java.util.*;

public class LongeatConsecutiveSequence01 {
	public static int longestConsecutive(int[] nums) {
		if (nums.length == 0 || nums == null) {
			return 0;
		}

		Arrays.sort(nums);

		int ans = 1;
		int prev = nums[0];
		int cur = 1;

		for (int i = 1; i < nums.length; i++) {
			if (nums[i] == prev + 1) {
				cur++;
			} else if (nums[i] != prev) {
				cur = 1;
			}
			prev = nums[i];
			ans = Math.max(ans, cur);
		}
		return ans;
	}

	public static void main(String args[]) {
		int arr[] = { 100, 200, 1, 2, 3, 4 };
		int lon = longestConsecutive(arr);
		System.out.println("The longest consecutive sequence is " + lon);

	}
}
/*
 * Output:
 * 
 * The longest consecutive sequence is 4
 * 
 * Time Complexity: We are first sorting the array which will take O(N * log(N))
 * time and then we are running a for loop which will take O(N) time. Hence, the
 * overall time complexity will be O(N * log(N)). Space Complexity: The space
 * complexity for the above approach is O(1) because we are not using any
 * auxiliary space
 */