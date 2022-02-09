package com.aaludra.collections;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedSetExample {

	public static void main(String[] args) {
		LinkedHashSet<String> place = new LinkedHashSet<String>();
		place.add("Chennai");
		place.add("Coimbatore");
		place.add("Coimbatore");
		place.add("Salem");
		Iterator<String> itr = place.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
