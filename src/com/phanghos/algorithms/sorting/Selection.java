package com.phanghos.algorithms.sorting;

public class Selection extends Sort {
	
	public static void sort(Comparable[] arr) {
		for (int i = 0; i < arr.length; i++) {
			int min = i;
			for (int j = i + 1; j < arr.length; j++)
				if (less(arr[j], arr[min])) min = j;
			swap(arr, i, min);
		}
	}

}