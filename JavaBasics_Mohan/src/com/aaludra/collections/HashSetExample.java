package com.aaludra.collections;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {

	public static void main(String[] args) {
		HashSet<String> place = new HashSet<String>();
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
