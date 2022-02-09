package com.aaludra.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapExample {

	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<Integer, String>();// Creating HashMap
		map.put(1, "India");
		map.put(3, "Japan");
		map.put(2, "China");
		map.put(4, "America");
	System.out.println(map);
	System.out.println("Iterating Hashmap...");
		for (Entry<Integer, String> maps : map.entrySet()) {
		System.out.println(maps.getKey() + " " + maps.getValue());
		}
	}

}
