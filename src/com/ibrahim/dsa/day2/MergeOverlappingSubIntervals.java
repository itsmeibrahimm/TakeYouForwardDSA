package com.ibrahim.dsa.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MergeOverlappingSubIntervals {

    static ArrayList < List < Integer >> merge(ArrayList < List < Integer >> intervals) {

    	System.out.println("Sorting is based on first element of the array");
    	System.out.println("Before Sorting");
    	
    	for (List < Integer > it: intervals) {
            System.out.print("["+it.get(0) + "," + it.get(1) + "] ");
        }
        System.out.println();
        
        Collections.sort(intervals, (a,b)->a.get(0)-b.get(0));
        
        System.out.println("After Sorting : ");
        
        for (List < Integer > it: intervals) {
            System.out.print("["+it.get(0) + "," + it.get(1) + "] ");
        }
        System.out.println();
        
        ArrayList < List < Integer >> merged = new ArrayList < > ();

        for (int i = 0; i < intervals.size(); i++) {
            if (merged.isEmpty() || merged.get(merged.size() - 1).get(1) < intervals.get(i).get(0)) {
                ArrayList < Integer > v = new ArrayList < > ();
                v.add(intervals.get(i).get(0));
                v.add(intervals.get(i).get(1));
                merged.add(v);
                System.out.println("New comer : "+ merged.get(merged.size()-1));
            } else {
            	System.out.println("Existing Merged Size: "+merged.size());
                merged.get(merged.size() - 1).set(1, Math.max(merged.get(merged.size() - 1).get(1), intervals.get(i).get(1)));
                System.out.println("Element to be updated : "+Math.max(merged.get(merged.size() - 1).get(1), intervals.get(i).get(1)));
            }
        }

        return merged;
    }

    public static void main(String args[]) {
        ArrayList < List < Integer >> arr = new ArrayList < > ();
        arr.add(Arrays.asList(new Integer[]{9,11}));
        arr.add(Arrays.asList(new Integer[]{15,18}));
        arr.add(Arrays.asList(new Integer[]{16,17}));
        arr.add(Arrays.asList(new Integer[]{1,3}));
        arr.add(Arrays.asList(new Integer[]{2,4}));
        arr.add(Arrays.asList(new Integer[]{2,6}));
        arr.add(Arrays.asList(new Integer[]{8,9}));
        arr.add(Arrays.asList(new Integer[]{8,10}));
        
        ArrayList < List < Integer >> ans = merge(arr);
        System.out.println("Merged Overlapping Intervals are ");
        for (List < Integer > it: ans) {
        	System.out.print("["+it.get(0) + "," + it.get(1) + "] ");
        }
        
        System.out.println("Merged Size: "+ans.size());
    }
}