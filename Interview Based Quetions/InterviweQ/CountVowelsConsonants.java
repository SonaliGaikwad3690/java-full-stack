package com.InterviweQ;

public class CountVowelsConsonants {

    public static void main(String[] args) {

        String str = "SonalGaikwad";
        int vowels = 0;
        int consonants = 0;
        
        String str1 = str.toLowerCase();
        
        for (int i = 0; i < str1.length(); i++) {

            char ch = str1.charAt(i);

            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                   // || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {

                vowels ++;
            }else {
            	consonants++;
            }
        }

        System.out.println("Vowels : " + vowels);
        System.out.println("Consonants : " + consonants);
    }
}