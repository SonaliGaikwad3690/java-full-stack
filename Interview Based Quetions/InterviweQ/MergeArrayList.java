package com.InterviweQ;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class MergeArrayList {

    public static void main(String[] args) {

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(3);
        list2.add(4);
        list2.add(5);
        list2.add(6);

        // Merge both lists and remove duplicates
        LinkedHashSet<Integer> set = new LinkedHashSet<>();

        set.addAll(list1);
        set.addAll(list2);

        // Convert set back to ArrayList
        ArrayList<Integer> result = new ArrayList<>(set);

        System.out.println("Merged List : " + result);
    }
}