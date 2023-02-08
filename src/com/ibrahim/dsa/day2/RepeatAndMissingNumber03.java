package com.ibrahim.dsa.day2;

import java.util.*;

public class RepeatAndMissingNumber03 {
	static int x, y;

	static void getTwoElements(int arr[], int n) {
		/*
		 * Will hold xor of all elements and numbers from 1 to n
		 */
		int xor1;

		/* Will have only single set bit of xor1 */
		int set_bit_no;

		int i;
		x = 0;
		y = 0;

		xor1 = arr[0];

		/* Get the xor of all array elements */
		for (i = 1; i < n; i++)
			xor1 = xor1 ^ arr[i];

		/*
		 * XOR the previous result with numbers from 1 to n
		 */
		for (i = 1; i <= n; i++)
			xor1 = xor1 ^ i;

		/* Get the rightmost set bit in set_bit_no */
		set_bit_no = xor1 & ~(xor1 - 1);

		/*
		 * Now divide elements into two sets by comparing rightmost set bit of xor1 with
		 * the bit at the same position in each element. Also, get XORs of two sets. The
		 * two XORs are the output elements. The following two for loops serve the
		 * purpose
		 */
		for (i = 0; i < n; i++) {
			if ((arr[i] & set_bit_no) != 0)
				/* arr[i] belongs to first set */
				x = x ^ arr[i];

			else
				/* arr[i] belongs to second set */
				y = y ^ arr[i];
		}
		for (i = 1; i <= n; i++) {
			if ((i & set_bit_no) != 0)
				/* i belongs to first set */
				x = x ^ i;

			else
				/* i belongs to second set */
				y = y ^ i;
		}

		// at last do a linear check which amont x and y is missing or repeating

		/* *x and *y hold the desired output elements */
	}
}
/*
 * Note: This method doesn’t cause overflow, but it doesn’t tell which one
 * occurs twice and which one is missing. We can add one more step that checks
 * which one is missing and which one is repeating by iterating over the array.
 * This can be easily done in O(N) time.
 * 
 * Time Complexity: O(N)
 * 
 * Space Complexity: O(1) As we are NOT USING EXTRA SPACE
 */