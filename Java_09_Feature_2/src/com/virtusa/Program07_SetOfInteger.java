package com.virtusa;

import java.util.Set;

public class Program07_SetOfInteger {

	public static void main(String[] args) {
		
		Set<Integer> nums= Set.of(1,2,3,4,5,6,7,8,9);
		System.out.println("Numbers are : "+nums);
		
		//nums.add(22);//Immutable Set can,t be change throw UnsupportedOperationException
	}
}
