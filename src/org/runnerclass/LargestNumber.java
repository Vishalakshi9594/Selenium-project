package org.runnerclass;

public class LargestNumber {

	public static void main(String[] args) {
		
		int[] arr = {1,2,10,20,100,17,59};
		int largest = arr[0];
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i]> largest) {
				largest = arr[i];
				
			}
		}
		System.out.println("Largest number: " + largest);
}
}
