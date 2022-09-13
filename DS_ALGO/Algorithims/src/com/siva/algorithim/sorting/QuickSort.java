package com.siva.algorithim.sorting;


public class QuickSort extends Sorting {

	
	public QuickSort(int array[]) {
		super(array);
	}
	@Override
	public int[] sort() {
		return quickSort();
	}
	
	public int[] sort(int arr[]) {
		this.array = arr;
		return sort();
	}
	
	private int[] quickSort() {
		
		return null;
	}
	
	
	

}
