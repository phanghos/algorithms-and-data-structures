package com.phanghos.algorithms.sorting;

public class Insertion1 extends Sort {
	
	public static void sort(Comparable[] arr) {
		for (int i = 1; i < arr.length; i++) {
			for (int j = i; j > 0 && less(arr[j], arr[j - 1]); j--)
				swap(arr, j, j - 1);
		}
	}

}