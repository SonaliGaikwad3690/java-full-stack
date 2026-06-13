package com.InterviweQ;

public class ReverseEachWord {

	public static void main(String[] args) {

		String str = "Java is Easy";

		String word = "";
//		String result = "";
//
//		// Convert string into character array
//
//		char[] arr = str.toCharArray();
//
//		// Read each character
//
//		for (char ch : arr) {
//			if (ch != ' ') {
//				word = ch + word; // reverse wor directly
//
//			} else {
//				result = result + word + " ";
//				word = "";
//			}
//
//		}
//	
//
//		System.out.println("Original String : " + str);
//		System.out.println("Result String : " + result);
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) != ' ') {
				word = word + str.charAt(i);

			} else {
				for (int j = word.length() - 1; j >= 0; j--) {
					System.out.print(word.charAt(j));

				}
				System.out.print(" ");
				word = "";

			}

		}
		for (int k = word.length() - 1; k >= 0; k--) {
			System.out.print(word.charAt(k));

		}
	}
}