package com.virtusa;

import java.util.List;

public class Program05_ListOfExceptionDemo {

	public static void main(String[] args) {

        // UnsupportedOperationException

        try {

            List<String> list =
                    List.of("Java", "Spring", "Hibernate");

            list.add("Microservices");

        } catch (UnsupportedOperationException e) {

            System.out.println("Exception : " + e);

        }

        // NullPointerException

        try {

            List<String> list =
                    List.of("Java", null, "Spring");

        } catch (NullPointerException e) {

            System.out.println("Exception : " + e);

        }

	}
}
