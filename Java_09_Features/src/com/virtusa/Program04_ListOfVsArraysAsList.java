package com.virtusa;

import java.util.Arrays;
import java.util.List;

public class Program04_ListOfVsArraysAsList {

	public static void main(String[] args) {
		
		 // Arrays.asList()
        List<String> list1 = Arrays.asList("Java", "Spring", "Hibernate");
        
     // List.of()
        List<String> list2 = List.of("Java", "Spring", "Hibernate");

        System.out.println("Arrays.asList() : " + list1);
        System.out.println("List.of()       : " + list2);
        
       // list1.add("ajay");//mutable 
        //list2.add("vijay");//immutable
        
       // list1.add(null);
        list1.set(0, "Sai");
        System.out.println("Arrays.asList() : " + list1);
	}
}
