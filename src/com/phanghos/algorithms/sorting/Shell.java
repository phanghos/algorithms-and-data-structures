package com.phanghos.algorithms.sorting;

public class Shell extends Sort {
	
	// Shellsort without exchanges
	
	public static void sort(Comparable[] arr) {
		int h = 1;
		while (h < arr.length / 3) {
			h = (3 * h) + 1; // Knuth's increment sequence
		}
		while (h >= 1) {
			for (int i = h; i < arr.length; i++) {
				Comparable aux = arr[i];
				int j = i;
				while (j >= h && less(aux, arr[j - h])) {
					arr[j] = arr[j - h];
					j -= h;
				}
				arr[j] = aux;
			}
			h /= 3;
		}
	}

}