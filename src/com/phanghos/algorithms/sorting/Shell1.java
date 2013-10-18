package com.phanghos.algorithms.sorting;

public class Shell1 extends Sort {
	
	public static void sort(Comparable[] arr) {
		int h = 1;
		while (h < arr.length / 3) {
			h = (3 * h) + 1; // Knuth's increment sequence
		}
		while (h >= 1) {
			for (int i = h; i < arr.length; i++) {
				Comparable aux = arr[i];
				for (int j = i; j >= h && less(aux, arr[j - h]); j -= h)
					swap(arr, j, j - h);
			}
			h /= 3;
		}
	}

}