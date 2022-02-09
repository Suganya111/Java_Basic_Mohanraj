package com.aaludra.collections;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {
		TreeSet<String> place = new TreeSet<String>();
		place.add("Salem");
		place.add("Coimbatore");
		place.add("Coimbatore");
		place.add("Chennai");
		Iterator<String> itr = place.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
