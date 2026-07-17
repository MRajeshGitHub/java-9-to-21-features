package com.virtusa;

import java.util.Set;

public class Program08_SetOfEmployee {

	public static void main(String[] args) {
		
		Employee emp1 = new Employee(11, "Ajaya", 30000);
		Employee emp2 = new Employee(12, "Vinod", 40000);
		Employee emp3 = new Employee(13, "Sanjay", 55000);
		Employee emp4 = new Employee(14, "Raju", 70000);
		
		
		Set<Employee> list=Set.of(emp1,emp2,emp3,emp4);
		System.out.println(list);
		
		System.out.println("--------");
		//print using forEach loop
		
		for(Employee em:list) {
			System.out.println(em);
		}
		
		
		//list.add(new Employee(22, "Rajesh", 400000));
		
		
	}
}
