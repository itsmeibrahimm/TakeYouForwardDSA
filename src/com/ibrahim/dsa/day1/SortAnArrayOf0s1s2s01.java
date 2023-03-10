package com.ibrahim.dsa.day1;

import java.util.*;

public class SortAnArrayOf0s1s2s01 {
	public void sortColors(int[] nums) {
		int lo = 0;
		int hi = nums.length - 1;
		int mid = 0;
		int temp;
		while (mid <= hi) {
			switch (nums[mid]) {
			case 0: {
				temp = nums[lo];
				nums[lo] = nums[mid];
				nums[mid] = temp;
				lo++;
				mid++;
				break;
			}
			case 1:
				mid++;
				break;
			case 2: {
				temp = nums[mid];
				nums[mid] = nums[hi];
				nums[hi] = temp;
				hi--;
				break;
			}
			}
		}
	}
}
/*
 * Time Complexity: O(N)
 * 
 * Space Complexity: O(1)
 */