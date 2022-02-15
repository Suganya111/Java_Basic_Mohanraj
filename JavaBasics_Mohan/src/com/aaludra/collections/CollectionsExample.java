package com.aaludra.collections;

import java.util.HashSet;
import java.util.Iterator;

public class CollectionsExample {
	public static void main(String args[]) {
		HashSet<String> set = new HashSet<String>();
		set.add("Kishore");
		set.add("Kamal");
		set.add("Vimal");
		set.add("Ram");
		Iterator<String> itr = set.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
