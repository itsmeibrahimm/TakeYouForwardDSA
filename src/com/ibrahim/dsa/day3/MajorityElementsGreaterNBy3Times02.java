package com.ibrahim.dsa.day3;

import java.util.*;

public class MajorityElementsGreaterNBy3Times02 {
	static ArrayList<Integer> majorityElement(int arr[], int n) {
		HashMap<Integer, Integer> mp = new HashMap<>();
		ArrayList<Integer> ans = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			mp.put(arr[i], mp.getOrDefault(arr[i], 0) + 1);
		}

		for (int x : mp.keySet()) {
			if (mp.get(x) > (n / 3))
				ans.add(x);
		}

		return ans;
	}

	public static void main(String args[]) {
		int arr[] = { 1, 2, 2, 3, 2 };
		ArrayList<Integer> majority = majorityElement(arr, 5);
		System.out.print("The majority element is: ");
		HashSet<Integer> s = new HashSet<>(majority);
		for (int it : s) {
			System.out.print(it + " ");
		}
		System.out.println();
	}
}
/*
 * Output:
 * 
 * The majority element is: 2
 * 
 * Time Complexity: O(n)
 * 
 * Space Complexity: O(n)
 */