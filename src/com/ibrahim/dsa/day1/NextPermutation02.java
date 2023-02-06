package com.ibrahim.dsa.day1;

public class NextPermutation02 {

    public void nextPermutation(int[] A) {
        if(A == null || A.length <= 1) return;
        int i = A.length - 2;
        while(i >= 0 && A[i] >= A[i + 1]) i--; 
        if(i >= 0) {                           
            int j = A.length - 1;              
            while(A[j] <= A[i]) j--;      
            swap(A, i, j);                     
        }
        reverse(A, i + 1, A.length - 1);      
}

public void swap(int[] A, int i, int j) {
    int tmp = A[i];
    A[i] = A[j];
    A[j] = tmp;
}

public void reverse(int[] A, int i, int j) {
    while(i < j) swap(A, i++, j--);
}
}
/*
 * Time Complexity: For the first iteration backward, the second interaction
 * backward and reversal at the end takes O(N) for each, where N is the number
 * of elements in the input array. This sums up to 3*O(N) which is approximately
 * O(N).
 * 
 * Space Complexity: Since no extra storage is required. Thus, its complexity is
 * O(1).
 */

