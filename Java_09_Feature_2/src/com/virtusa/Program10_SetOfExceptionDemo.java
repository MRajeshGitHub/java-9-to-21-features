package com.virtusa;

import java.util.Set;

public class Program10_SetOfExceptionDemo {

	public static void main(String[] args) {
		
		// 1. UnsupportedOperationException
		try {
			
			Set<String> set1=Set.of("Java","Spring","Hibernate");
			set1.add("Microservices");//throw Exception
			
		} catch (UnsupportedOperationException e) {
			
			//e.printStackTrace();
			System.out.println(e);
			System.out.println("UnsupportedOperationException");
		}
		
		System.out.println("--------------------------------");
		
		//2. IllegalArgumentException
		
		try {
			
			Set<String> set2=Set.of("java","spring","java");
		} catch (IllegalArgumentException e) {
			//e.printStackTrace();
			System.out.println(e);
			System.out.println("IllegalArgumentException");
		}
		System.out.println("--------------------------------");
		
		//3. 3. NullPointerException
		
		try {
			Set<String> set2= Set.of("Rajesh","Ajay",null);
			
		} catch ( NullPointerException e) {
			//e.printStackTrace();
			System.out.println(e);
			System.out.println(" NullPointerException");
		}
		
		
		
		
		
		
	}
}
