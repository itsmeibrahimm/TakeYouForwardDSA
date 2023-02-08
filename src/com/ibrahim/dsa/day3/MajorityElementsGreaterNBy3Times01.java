package com.ibrahim.dsa.day3;

import java.util.*;

public class MajorityElementsGreaterNBy3Times01 {
  static ArrayList < Integer > majorityElement(int arr[], int n) {
    ArrayList < Integer > ans = new ArrayList < > ();
    for (int i = 0; i < n; i++) {
      int cnt = 1;
      for (int j = i + 1; j < n; j++) {
        if (arr[j] == arr[i])
          cnt++;
      }

      if (cnt > (n / 3))
        ans.add(arr[i]);
    }

    return ans;
  }
  public static void main(String args[]) {
    int arr[] = {1, 2, 2, 3, 2};
    ArrayList < Integer > majority = majorityElement(arr, 5);
    System.out.print("The majority element is: ");
    HashSet < Integer > s = new HashSet < > (majority);
    for (int it: s) {
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
 * Time Complexity: O(n^2)
 * 
 * Space Complexity: O(1)
 */