package com.ibrahim.dsa.day1;

import java.util.*;

public class StockBuyAndSell01 {
	public static void main(String[] args) {
		int arr[] = { 7, 1, 5, 3, 6, 4 };
		int maxPro = maxProfit(arr);
		System.out.println("Max profit is: " + maxPro);
	}

	static int maxProfit(int[] arr) {
		int maxPro = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] > arr[i]) {
					maxPro = Math.max(arr[j] - arr[i], maxPro);
				}
			}
		}
		return maxPro;
	}
}
/*
 * Output:
 * 
 * Max profit is: 5
 * 
 * Time complexity: O(n^2)
 * 
 * Space Complexity: O(1)
 */
