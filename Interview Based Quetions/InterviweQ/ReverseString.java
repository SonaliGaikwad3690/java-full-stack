package com.InterviweQ;

public class ReverseString {


	public static void main(String[] args) {
		String str = "Java is Language";
		char [] ch = str.toCharArray();
		
		for(int i=ch.length-1;i>=0;i--) {
			System.out.print(ch[i]);
		}
	}
}
