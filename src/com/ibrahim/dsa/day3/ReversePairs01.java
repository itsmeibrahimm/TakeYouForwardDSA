package com.ibrahim.dsa.day3;

import java.util.*;

public class ReversePairs01 {
	static int reversePairs(int arr[]) {
		int Pairs = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > 2 * arr[j])
					Pairs++;
			}
		}
		return Pairs;
	}

	public static void main(String args[]) {
		int arr[] = { 1, 3, 2, 3, 1 };
		System.out.println("The Total Reverse Pairs are " + reversePairs(arr));
	}
}
/*
 * Output: The Total Reverse Pairs are 2
 * 
 * Time Complexity: O (N^2) ( Nested Loops )
 * 
 * Space Complexity: O(1)
 */