package com.aaludra.collections;

import java.util.TreeMap;

public class TreeMapExample {

	public static void main(String[] args) {
		TreeMap<Integer, String> map = new TreeMap<Integer, String>();
		map.put(10, "Raja");
		map.put(12, "Kamal");
		map.put(11, "Vijay");
		map.put(13, "Karthi");
		System.out.println("headMap: " + map.headMap(11));
		System.out.println("tailMap: " + map.tailMap(12));
		System.out.println("subMap: " + map.subMap(10, 12));
	}
}