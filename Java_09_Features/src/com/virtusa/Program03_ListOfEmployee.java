package com.virtusa;

import java.util.List;

public class Program03_ListOfEmployee {

	public static void main(String[] args) {
		
		Employee e1 = new Employee(1, "Rajesh", 20000);
		Employee e2 = new Employee(1, "Rajesh", 20000);
		Employee e3 = new Employee(1, "Rajesh", 20000);
		
		List<Employee> list= List.of(e2,e3,e2);
		
		System.out.println(list);
	}
}
