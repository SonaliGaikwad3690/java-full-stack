package com.InterviweQ;

public class ReverseEachWords {

	public static void main(String[] args) {
		
		String str = "Java is Powerfull";
		
		String result="";
		
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i) !=' ') {
				result +=str.charAt(i);
			}else {
				for(int j=result.length()-1;j>=0;j--) {
					System.out.print(result.charAt(j));
				}
				System.out.print(" ");
				result="";
			}
			
		}
		for(int k=result.length()-1;k>=0;k--) {
			System.out.print(result.charAt(k));
		}
	}
}
