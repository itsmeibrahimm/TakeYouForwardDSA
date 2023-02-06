package com.ibrahim.dsa.day2;

import java.util.*;

//Pair class.
class Pair {
	int start;
	int end;

	public Pair(int start, int end) {
		this.start = start;
		this.end = end;

	}
}

public class MergeOverlappingSubintervals01 {

	public static List<Pair> merge(List<Pair> intervals) {

		int n = intervals.size();
		Collections.sort(intervals, (a, b) -> Integer.compare(a.start, b.start));
		List<Pair> ans = new ArrayList<>();

		for (int i = 0; i < n; i++) {

			Pair temp = intervals.get(i);
			int start = temp.start;
			int end = temp.end;

			if (!ans.isEmpty()) {
				if (start <= ans.get(ans.size() - 1).end) {
					continue;
				}
			}

			for (int j = i + 1; j < n; j++) {
				if (intervals.get(j).start <= end) {
					end = Math.max(end, intervals.get(j).end);
				}
			}

			end = Math.max(end, intervals.get(i).end);

			ans.add(new Pair(start, end));
		}

		return ans;

	}

	public static void main(String[] args) {

		List<Pair> input = new ArrayList<>();
		input.add(new Pair(1, 3));
		input.add(new Pair(2, 4));
		input.add(new Pair(2, 6));
		input.add(new Pair(8, 9));
		input.add(new Pair(8, 10));
		input.add(new Pair(9, 11));
		input.add(new Pair(15, 18));
		input.add(new Pair(16, 17));

		List<Pair> output = merge(input);

		for (Pair result : output) {
			System.out.println(result.start + " " + result.end);
		}
	}
}
/*
 * Output:
 * 
 * Merged Overlapping Intervals are 1 6 8 11 15 18
 * 
 * Time Complexity: O(NlogN)+O(N*N). O(NlogN) for sorting the array, and O(N*N)
 * because we are checking to the right for each index which is a nested loop.
 * 
 * Space Complexity: O(N), as we are using a separate data structure.
 */