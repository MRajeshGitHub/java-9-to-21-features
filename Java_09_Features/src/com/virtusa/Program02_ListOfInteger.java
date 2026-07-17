package com.virtusa;

import java.util.List;

public class Program02_ListOfInteger {
	
	public static void main(String[] args) {
		
		List<Integer> nums= List.of(1,2,3,4,5,6,7,8,9);
		System.out.println("Num form list is : "+nums);
		nums.add(20);
		
	}

}
