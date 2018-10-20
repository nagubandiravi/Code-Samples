package com.src;

public class BinarySearch {
	
	public void binarySearch(int[] input, int left, int right, int element) {
		int middle = left+(right-1)/2;
		if (input[middle] > element) {
			binarySearch(input, left, middle-1, element);
		} else if (input[middle] < element){
			binarySearch(input, middle+1, right, element);			
		} else {
			System.out.println(input[middle]);
		}
	}

	public static void main(String[] args) {
		BinarySearch obj = new BinarySearch();
		int[] input = new int[]{1,3,5,7,8,9};
		obj.binarySearch(input, 0, input.length-1, 3);
	}
	
}
