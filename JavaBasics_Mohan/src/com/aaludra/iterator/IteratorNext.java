package com.aaludra.iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorNext {

	public static void main(String[] args) {
		ArrayList<String> cityNames = new ArrayList<String>();

		cityNames.add("Chennai");
		cityNames.add("Mumbai");
		cityNames.add("Kolkata");
		cityNames.add("Coimbatore");
		cityNames.add("Mumbai");

		Iterator<String> it = cityNames.iterator();
		System.out.println("CityName : ");

		System.out.println(it.next());

	}

}
