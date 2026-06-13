package com.InterviweQ;

public class SecondLargestNum {

	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8 };

		int largest = arr[0];
		int secondLargest =arr[0];
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				if(arr[i] > largest) {
					secondLargest = largest;
					largest = arr[i];
				}else if(arr[i] > secondLargest && arr[i] !=largest) {
					secondLargest = arr[i];
				}
			}
		}
		System.out.println("Largest : " + largest);
		System.out.println("SecondLargest : " + secondLargest);
	}
}
