package com.ibrahim.dsa.day3;

import java.util.*;

public class PowXN01 {
	public static double myPow(double x, int n) {
		double ans = 1.0;
		for (int i = 0; i < n; i++) {
			ans = ans * x;
		}
		return ans;
	}

	public static void main(String args[]) {
		System.out.println(myPow(2, 10));
	}
}
/*
 * Output: 1024.0
 * 
 * Time Complexity: O(N)
 * 
 * Space Complexity: O(1)
 */