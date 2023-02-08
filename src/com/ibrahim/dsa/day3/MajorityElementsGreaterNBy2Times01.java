package com.ibrahim.dsa.day3;

import java.util.*;

public class MajorityElementsGreaterNBy2Times01 {
	public int majorityElement(int[] nums) {
		int count = 0;
		int candidate = 0;

		for (int num : nums) {
			if (count == 0) {
				candidate = num;
			}
			if (num == candidate)
				count += 1;
			else
				count -= 1;
		}

		return candidate;
	}
}
/*
 * Time Complexity: O(N)
 * 
 * Space Complexity: O(1)
 * 
 * Follow-up question you can try: Given an integer array of size n, find all
 * elements that appear more than  n/3 times.
 * 
 */