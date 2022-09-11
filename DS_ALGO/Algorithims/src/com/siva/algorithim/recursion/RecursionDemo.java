package com.siva.algorithim.recursion;
import java.util.ArrayList;

public class RecursionDemo {

	public static void main(String[] args) {
//		System.out.println(factorialOfNumberRecursive(-5));
		
//		System.out.println(fibbinocciIterative(5));
//		System.out.println(fibbinocciRecursive(5));
		System.out.println(fibbRecursive(5));
		
		

	}
	private static int fibbRecursive(int n) {
		if(n<2) {
			return n;
		}
		
		return fibbRecursive(n-1) + fibbRecursive(n-2);
	}
	//Finding a factorial of a number using Recursion.
	public static int  factorialOfNumberRecursive(int number){
		
		  if(number <=1){
		    return 1;
		  }
		  return number * factorialOfNumberRecursive(number-1);
		}
	// Finding the fibbinocci number of a particular index using recursion.
	// Long approach (Not advisable) 
	public static int fibbinocciRecursive(int index) {
		
		if(index == 1 || index == 0)
			return index;
		
		return findFibbinocciNumber(0,1,index);
		
		
	}
	public static int findFibbinocciNumber(int previousNumber, int currentNumber, int counter) {
		
		if(counter <2) {
			return currentNumber;
		}
		int temp = currentNumber;
		currentNumber = currentNumber+ previousNumber;
		previousNumber = temp;
		counter--;
		return findFibbinocciNumber(previousNumber, currentNumber, counter);
		
		
	}
	
	public static int fibbinocciIterative(int n) {
		if(n ==1 || n == 0)
			return n;
		ArrayList<Integer> list = new ArrayList<>();
		list.add(0);
		list.add(1);
		
		while(n>1) {
			list.add(list.get(list.size()-1)+list.get(list.size()-2));
			n--;
		}
		return list.get(list.size()-1);
		
		
	}
		
}
