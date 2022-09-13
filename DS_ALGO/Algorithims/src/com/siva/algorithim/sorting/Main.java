package com.siva.algorithim.sorting;



public class Main {
	public static void main(String[] args) {
		
		Sorting mSort = new MergeSort( new int[] {1,23,4,15,89,12});
		mSort.sort();
		
		
		System.out.println(mSort);
	}
}
