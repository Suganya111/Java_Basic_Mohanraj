package com.aaludra.collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample {

	public static void main(String[] args) {

		ArrayList<String> place = new ArrayList<String>();
		place.add("Chenai");
		place.add("Erode");
		place.add("Chennai");
		place.add("Erode");
		Iterator itr = place.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
