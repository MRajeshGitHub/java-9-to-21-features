package com.virtusa;

import java.util.HashSet;
import java.util.Set;

public class Program09_SetOfVsHashSet {

	public static void main(String[] args) {
		
		//immutable set
		
		Set<String> set1=Set.of("Ajay","Vijay","Ravi");
		
		//mutable set
		
		Set<String> set2=new HashSet<>();
		set2.add("Rohit");
		set2.add("Rana");
		set2.add("Arun");
		
		System.out.println(set1);
		System.out.println(set2);
		set1.add("Raja");//set will throw unsupportedOpetationException
		
		set2.add("Rajesh");
		//set2.add("Rana");//duplicate ignored in HashSet
		//set2.add(null);//
		System.out.println(set2);//possible to add elements in HashSet
	}
}
