package com.ibrahim.dsa.day4;

import java.util.*;

public class LongeatConsecutiveSequence02 {
	public static int longestConsecutive(int[] nums) {
		Set<Integer> hashSet = new HashSet<Integer>();
		for (int num : nums) {
			hashSet.add(num);
		}

		int longestStreak = 0;

		for (int num : nums) {
			if (!hashSet.contains(num - 1)) {
				int currentNum = num;
				int currentStreak = 1;

				while (hashSet.contains(currentNum + 1)) {
					currentNum += 1;
					currentStreak += 1;
				}

				longestStreak = Math.max(longestStreak, currentStreak);
			}
		}

		return longestStreak;
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
 * Time Complexity: The time complexity of the above approach is O(N) because we
 * traverse each consecutive subsequence only once. (assuming hashset takes O(1)
 * to search) Space Complexity: The space complexity of the above approach is
 * O(N) because we are maintaining a HashSet.
 */