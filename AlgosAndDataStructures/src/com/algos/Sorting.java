package com.algos;

public class Sorting {
	
	
	public static void swap(int[] Array, int i, int j) {
		int temp;
		temp = Array[i];
		Array[i] = Array[j];
		Array[j] = temp;
	}
	
	
	public static void bubbleSort(int[] Array) {
		
		for(int lastUnsortedIndex = Array.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
			 for(int i = 0; i < lastUnsortedIndex; i++) {
				 if(Array[i] > Array[i + 1]) {
					 swap(Array, i, i + 1);
				 }
				 
			 }
		}
	}
	
	
	public static void selectionSort(int[] Array) {
		
		for(int lastUnsortedIndex = Array.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
			
			int elementIndex = 0;
			
			for(int i = 1; i <= lastUnsortedIndex; i++) {
				if(Array[i] > Array[elementIndex]) {
					elementIndex = i;
				}
			}
			swap(Array, elementIndex, lastUnsortedIndex);
		}
	}
	
	
	public static void insertionSort(int[] Array) {
		
		for(int firstUnsortedIndex = 1; firstUnsortedIndex < Array.length; firstUnsortedIndex++) {
			
			int element = Array[firstUnsortedIndex];
			int i;
			
			for(i= firstUnsortedIndex; i > 0 && element < Array[i - 1]; i--) {
				Array[i] = Array[i - 1];
			}
			Array[i] = element;
		}
	}
	
	
	public static void shellSort(int[] Array) {
		
		int gap = Array.length / 2;
		
		for(int firstUnsortedIndex = gap; firstUnsortedIndex > 0; firstUnsortedIndex  /= 2) {
			
			
			for(int i = firstUnsortedIndex; i < Array.length; i++ ) {
				
				int element = Array[i];
				int j = i;
				
				while(j >= firstUnsortedIndex && Array[j - firstUnsortedIndex] > element) {
					
					Array[j] = Array[j - firstUnsortedIndex];
					j -= firstUnsortedIndex;
				}
				Array[j] = element;
			}
		}
	}
	
	
	public static void main(String[] args) {
		
		int [] Array = {3, 6, 10, 22, -17, 35, -12, 15};
		
		shellSort(Array);
		
		
		
		for(int i = 0; i < Array.length; i++) {
			System.out.println(Array[i]);
		}
		
	}

}
