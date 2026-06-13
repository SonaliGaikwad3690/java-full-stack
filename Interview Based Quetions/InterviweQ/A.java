package com.InterviweQ;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.stream.Stream;

public class A {
    
	public static void main(String[] args) {
		
	
	ArrayList<Integer>list = new ArrayList<Integer>();
	list.add(12);
	list.add(18);
	list.add(14);
	list.add(15);
	list.add(16);
	
	HashSet<Integer> set = new HashSet<>(list);

	// Convert to list
	ArrayList<Integer> sortedList = new ArrayList<>(set);

	// Sort descending
	sortedList.sort(Comparator.reverseOrder());

	// Print
	sortedList.forEach(System.out::println);
	
//	for(Integer itr : list){
//		if(itr%2==0) {
//			System.out.println("Even Number" + itr);
//		}else {
//			System.out.println("Odd Number" + itr);
//		}
//	  }
	
//	      list.stream().filter(null);
//	      ReferencePipeline
//	      IntPipeline
	
//	list.stream().filter(i-> i%2==0).forEach(System.out::println);
//	list.stream().filter(i-> i%2==0).forEach(i -> System.out.println(i));
//	list.stream().map(i -> i*i).forEach(i -> System.out.println(i));
//	list.sort((a , b )-> a-b).forEach(i -> System.out.println(i));
//	Collections.sort(list).list.forEach(System.out::println);
	
//	list.sort(Integer::compareTo);
////	list.forEach(System.out::println);
//	list.sort((a, b) -> b - a);
//	list.forEach(i -> System.out.println(i));
	
	
	}
	
}
