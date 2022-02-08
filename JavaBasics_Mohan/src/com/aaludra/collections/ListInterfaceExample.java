package com.aaludra.collections;

import java.util.Iterator;
import java.util.LinkedList;

public class ListInterfaceExample {

	public static void main(String[] args) {
		LinkedList<String> place = new LinkedList<>();
		place.add("Coimbatore");
		place.add("Chennai");
		place.add("Coimbatore");
		place.add("Erode");
		Iterator<String> itr = place.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());

		}
	}
}
