package com.phanghos.algorithms.sorting;

public class Insertion extends Sort {
	
	/*
	 * 
	 * EXPERIMENTS
	 * 
	 * Insertion sort without exchanges
	 * 
	 * Develop an implementation of insertion sort that moves
	 * larger items to the right one position rather than doing full exchanges.
	 * 
	 */
	
	public static void sort(Comparable[] arr) {
		for (int i = 1; i < arr.length; i++) {
			Comparable aux = arr[i];
			int j = i;
			while (j > 0 && less(aux, arr[j - 1]))
				arr[j] = arr[--j];
			arr[j] = aux;
		}
	}
	
	public static void sort(Comparable[] arr, int lo, int hi) {
		for (int i = lo + 1; i <= hi; i++)
			for (int j = i; j > lo && less(arr[j], arr[j - 1]); j--)
				swap(arr, j, j - 1);
	}

}