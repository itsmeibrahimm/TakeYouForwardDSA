package com.ibrahim.dsa.day2;

import java.util.*;

public class RotateMatrix01 {
	static int[][] rotate(int[][] matrix) {
		int n = matrix.length;
		int rotated[][] = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				rotated[j][n - i - 1] = matrix[i][j];
			}
		}
		return rotated;
	}

	public static void main(String args[]) {
		int arr[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int rotated[][] = rotate(arr);
		System.out.println("Rotated Image");
		for (int i = 0; i < rotated.length; i++) {
			for (int j = 0; j < rotated.length; j++) {
				System.out.print(rotated[i][j] + " ");
			}
			System.out.println();
		}

	}
}
/*
 * Output:
 * 
 * Rotated Image 7 4 1 8 5 2 9 6 3
 * 
 * Time Complexity: O(N*N) to linearly iterate and put it into some other
 * matrix.
 * 
 * Space Complexity: O(N*N) to copy it into some other matrix.
 */