package com.siva.algorithim.sorting;



public abstract class Sorting{
	
	protected int[] array;
	
	public Sorting(int array[]){
		this.array = array;
	}

	abstract int[] sort();
	
	@Override
	public String toString() {
		
		StringBuilder sb = new StringBuilder("SortedArray [array= ");
		for(int i =0; i<array.length-1; i++) {
			sb.append(array[i]+", ");
		}
		sb.append(array[array.length-1]+"]");
		return sb.toString();
	}
	
} 
