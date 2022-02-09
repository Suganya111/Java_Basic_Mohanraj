package com.aaludra.collections;
import java.util.Vector;
import java.util.Iterator;
public class VectorExample {

	public static void main(String[] args) {
		Vector<String> place = new Vector<>();
		place.add("Chennai");
		place.add("Tirupur");
		place.add("Erode");
		place.add("Salem");
		Iterator<String> itr = place.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

	}
}