package com.phanghos.algorithms.sorting;

public class Insertion2 extends Sort {
	
	/*
	 * 
	 * EXPERIMENTS
	 * 
	 * Insertion sort with sentinel
	 * 
	 * Develop an implementation InsertionX.java of insertion sort that eliminates the j > 0 test
	 * in the inner loop by first putting the smallest item into position.
	 * 
	 * Note: it is often possible to avoid an index-out-of-bounds test in this way—the item that enables
	 * the test to be eliminated is known as a sentinel.
	 * 
	 */
	
	public static void sort(Comparable[] arr) {
		for (int i = arr.length - 1; i > 0; i--)
			if (less(arr[i], arr[i - 1])) swap(arr, i, i - 1);
		for (int i = 2; i < arr.length; i++) {
			Comparable aux = arr[i];
			int j = i;
			while (less(aux, arr[j - 1]))
				arr[j] = arr[--j];
			arr[j] = aux;
		}
	}
	
}