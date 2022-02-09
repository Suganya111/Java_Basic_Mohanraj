package com.aaludra.iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorExample {

	public static void main(String[] args) {
		ArrayList<String> cityNames = new ArrayList<String>();

		cityNames.add("Chennai");
		cityNames.add("Mumbai");
		cityNames.add("Kolkata");
		cityNames.add("Coimbatore");
		cityNames.add("Mumbai");

		Iterator<String> iterator = cityNames.iterator();
		System.out.println("CityNames elements : ");

		while (iterator.hasNext())
			System.out.print(iterator.next() + " ");
		}
}
