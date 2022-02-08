package com.aaludra.collections;

import java.util.Iterator;
import java.util.Vector;

public class VectorExample {

	public static void main(String[] args) {
		Vector<String> v = new Vector<String>();
		v.add("Chennai");
		v.add("Tirupur");
		v.add("Erode");
		v.add("Salem");
		Iterator<String> itr = v.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

	}
}