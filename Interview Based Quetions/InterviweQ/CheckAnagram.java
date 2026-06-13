package com.InterviweQ;
import java.util.ArrayList;
import java.util.Collections;

public class CheckAnagram {

    public static void main(String[] args) {

        String str1 = "care";
        String str2 = "race";

        ArrayList<Character> list1 = new ArrayList<>();
        ArrayList<Character> list2 = new ArrayList<>();

        for(char ch : str1.toCharArray()) {
            list1.add(ch);
        }

        for(char ch : str2.toCharArray()) {
            list2.add(ch);
        }

        Collections.sort(list1);
        Collections.sort(list2);

        if(list1.equals(list2)) {

            System.out.println("Anagram");
        }
        else {

            System.out.println("Not Anagram");
        }
    }
}