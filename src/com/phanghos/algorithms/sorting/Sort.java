package com.phanghos.algorithms.sorting;

public abstract class Sort {
	
	protected static boolean less(Comparable u, Comparable v) {
		return u.compareTo(v) < 0;
	}
	
	protected static void swap(Comparable[] arr, int i, int j) {
		Comparable aux = arr[i];
		arr[i] = arr[j];
		arr[j] = aux;
	}
	
	public static boolean isSorted(Comparable[] arr) {
		for (int i = 1; i < arr.length; i++)
			if (less(arr[i], arr[i - 1])) return false;
		return true;
	}
	
	public static void show(Comparable[] arr) {
		for (int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + " ");
		System.out.println();
	}

}