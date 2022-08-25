package com.siva.algorithim;

public class Sorting {
	int arr[];
	int arrSize;
	public Sorting(int arr[]) {
		this.arr = arr;
		this.arrSize = arr.length;
	}

	public void bubbleSort() {
		
		for(int i = arrSize-1; i > 0 ; i--) {
			for(int j=0; j< i; j++) {
				if(arr[j] > arr[j+1])
					swap(j,j+1);
			}
		}
	}

	private void swap(int j, int i) {
		int temp = arr[j];
		arr[j] = arr[i];
		arr[i] = temp;
	}
	
	public void printSortedArray() {
		for (int i : arr) {
			System.out.print(i+" ");
		}
	}
}
