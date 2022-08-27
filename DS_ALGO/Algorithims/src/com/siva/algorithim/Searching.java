package com.siva.algorithim;

public class Searching {
	int arr[], element, arrSize;
	public Searching(int arr[], int element) {
		this.arr = arr;
		arrSize = arr.length;
		this.element = element;
	}
	
	public void linearSearch() {
		boolean flag = false;
		String indexes = "\nElement found at index ";
		for(int i=0; i<arrSize; i++) {
			if(arr[i] == element)
			{
				flag = true;
				indexes += i+" ";
			}
		}
		if(flag)
			System.out.println(indexes);
		else
			System.out.println("Element not present");
	}
	
	public void binarySearch() {
		System.out.println("Entering binarySearch");
		int lowIndex = 0;
		int highIndex = arrSize-1;
		boolean flag = false;
		
		while(lowIndex <= highIndex) {
			int midIndex = (lowIndex+highIndex)/2;
			if(element >arr[midIndex]) {
				lowIndex = midIndex+1;
			}
			else if(element == arr[midIndex]) {
				flag = true;
				System.out.println("Element found at index: " + midIndex);
				break;
			}
			else {
				highIndex = midIndex-1;
			}
		}
		if(! flag)
			System.out.println("Element not present in array");
		
	}
}
