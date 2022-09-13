package com.siva.algorithim.sorting;


public class MergeSort extends Sorting {
	

	public MergeSort(int array[]) {
		super(array);
	}
	
	
	@Override
	public int[] sort(){
		
		if(array == null || array.length == 1)
			return array;
		
		array = performMergeSort(0,array.length-1);
		return array;
	}
	
	//Recursive operation is performed till we find the single element pairs.
	//Then we are merging it with sorted order.
	//Then we return the sorted array. 
	private int[] performMergeSort(int i, int j) {
		while(i<j) {
			int midIndex = (i+j)/2;
			
			
			int array[] = merge(
					performMergeSort(i, midIndex), 
					performMergeSort(midIndex+1, j)
					);
			//Enable to check the flow
			for (int k : array) {
				System.out.print(k+" ");
			}
			System.out.println();
			
			
			return array;
		}
		
		return new int[] {array[i]};
	}

	public int[] merge(int arr1[], int arr2[]) {
		int mergedArrLength = arr1.length+arr2.length;
		int mergedArr[] = new int[mergedArrLength];
		int k = 0;
		int i = 0, j =0;
		while(k<mergedArrLength) {
			if(i>=arr1.length) {
				mergedArr[k++] = arr2[j++];
				continue;
			}
			if(j>=arr2.length) {
				mergedArr[k++] = arr1[i++];
				continue;
			}
			if(arr1[i]<arr2[j]) {
				mergedArr[k++] = arr1[i++];
			}
			else {
				mergedArr[k++] = arr2[j++];
			}
		}
		
		return mergedArr;
	}
	
	

	
}
