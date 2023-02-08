package com.ibrahim.dsa.day4;

import java.io.*;

public class CountNumberOfSubarraysWithGivenXorK01 {
	public int solve(int[] A, int B) {
		int c = 0;
		for (int i = 0; i < A.length; i++) {
			int current_xor = 0;
			for (int j = i; j < A.length; j++) {
				current_xor ^= A[j];
				if (current_xor == B)
					c++;
			}
		}
		return c;
	}
}

class TUF {
	public static void main (String[] args) {
		Solution obj = new Solution();
		int[] A = new int[]{4,2,2,6,4};
		int countTotal=obj.solve(A,6);
		System.out.println("The total number of subarrays having a given XOR 
                k is "+countTotal);
	}
}
/*
 * Output:
 * 
 * The total number of subarrays having a given XOR k is 4
 * 
 * Time Complexity: O(N2)
 * 
 * Space Complexity: O(1)
 */