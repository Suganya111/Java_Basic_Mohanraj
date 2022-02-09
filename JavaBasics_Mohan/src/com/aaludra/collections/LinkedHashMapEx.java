package com.aaludra.collections;

import java.util.LinkedHashMap;

public class LinkedHashMapEx {

	public static void main(String[] args) {
		LinkedHashMap<Integer, String> map = new LinkedHashMap<Integer, String>();
		map.put(10, "VIJAY");
		map.put(11, "RAJA");
		map.put(12, "KARTHI");
		System.out.println("Keys: " + map.keySet());
		System.out.println("Values: " + map.values());
		System.out.println("Key-Value pairs: " + map.entrySet());
	}
}
