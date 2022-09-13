package com.siva.algorithim;

public class Main {

	public static void main(String[] args) {
		int arr[] = new int[] { 4, 17, 2, 20, 11 };
		Sorting sort = new Sorting(arr);
		// sort.bubbleSort();
		sort.printSortedArray();
		sort.insertionSort();
		sort.printSortedArray();

		// Searching search = new Searching(sort.getSortedArray(), 50);
		// search.binarySearch();

	}

}
