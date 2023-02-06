package com.ibrahim.dsa.day2;

import java.util.*;

public class MergeOverlapingSubintervals02 {
	static ArrayList<List<Integer>> merge(ArrayList<List<Integer>> intervals) {

		Collections.sort(intervals, (a, b) -> a.get(0) - b.get(0));
		ArrayList<List<Integer>> merged = new ArrayList<>();

		for (int i = 0; i < intervals.size(); i++) {
			if (merged.isEmpty() || merged.get(merged.size() - 1).get(1) < intervals.get(i).get(0)) {
				ArrayList<Integer> v = new ArrayList<>();
				v.add(intervals.get(i).get(0));
				v.add(intervals.get(i).get(1));

				merged.add(v);
			} else {

				merged.get(merged.size() - 1).set(1,
						Math.max(merged.get(merged.size() - 1).get(1), intervals.get(i).get(1)));
			}
		}

		return merged;
	}

	public static void main(String args[]) {
		ArrayList<List<Integer>> arr = new ArrayList<>();
		arr.add(Arrays.asList(new Integer[] { 1, 3 }));
		arr.add(Arrays.asList(new Integer[] { 2, 4 }));
		arr.add(Arrays.asList(new Integer[] { 2, 6 }));
		arr.add(Arrays.asList(new Integer[] { 8, 9 }));
		arr.add(Arrays.asList(new Integer[] { 8, 10 }));
		arr.add(Arrays.asList(new Integer[] { 9, 11 }));
		arr.add(Arrays.asList(new Integer[] { 15, 18 }));
		arr.add(Arrays.asList(new Integer[] { 16, 17 }));
		ArrayList<List<Integer>> ans = merge(arr);
		System.out.println("Merged Overlapping Intervals are ");
		for (List<Integer> it : ans) {
			System.out.println(it.get(0) + " " + it.get(1));
		}
	}
}
/*
 * Output:
 * 
 * Merged Overlapping Intervals are 1 6 8 11 15 18
 * 
 * Time Complexity: O(NlogN) + O(N). O(NlogN) for sorting and O(N) for
 * traversing through the array.
 * 
 * Space Complexity: O(N) to return the answer of the merged intervals.
 */