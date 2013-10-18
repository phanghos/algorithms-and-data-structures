package com.phanghos.algorithms.sorting;

public class Stooge extends Sort {
	
	/*
	 * 
	 * WEB EXERCISES
	 * 
	 * Stoogesort
	 * 
	 * If the leftmost item is larger than the rightmost item, swap them.
	 * If there are 2 or more items in the current subarray:
	 *    (i) sort the initial two-thirds of the array recursively
	 *    (ii) sort the final two-thirds of the array
	 *    (iii) sort the initial two-thirds of the array again
	 * 
	 */
	
	public static void sort(Comparable[] arr) {
		sort(arr, 0, arr.length - 1);
	}
	
	private static void sort(Comparable[] arr, int lo, int hi) {
		if (less(arr[hi], arr[lo])) swap(arr, lo, hi);
		if (hi - lo > 1) {
			int len = (hi - lo + 1) / 3;
			sort(arr, lo, hi - len);
			sort(arr, lo + len, hi);
			sort(arr, lo, hi - len);
		}
	}
	
}