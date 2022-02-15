package com.aaludra.collections;

import java.util.Map;
import java.util.TreeMap;

public abstract class TreeMapEx {
	public static void main(String args[]) {
		TreeMap<Integer, String> map = new TreeMap<Integer, String>();
		map.put(100, "Raja");
		map.put(102, "Ravi");
		map.put(101, "Karthi");
		map.put(103, "Kishore");
		System.out.println("Before invoking remove() method");
		for (Map.Entry m : map.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}
		map.remove(102);
		System.out.println("After invoking remove() method");
		for (Map.Entry m : map.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}
	}

}
