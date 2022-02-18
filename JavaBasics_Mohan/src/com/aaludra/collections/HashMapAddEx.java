package com.aaludra.collections;


import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapAddEx {

	public static void main(String[] args) {
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		System.out.println("Initial list of elements: " + hm);
		hm.put(10, "Raja");
		hm.put(11, "Vimal");
		hm.put(12, "Karthi");
		System.out.println(hm);
		System.out.println("After invoking put() method: ");
		for (Map.Entry m : hm.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}

		hm.putIfAbsent(13, "Virat");
		System.out.println("After invoking putIfAbsent() method: ");
		for (Map.Entry m : hm.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}
		HashMap<Integer, String> map = new HashMap<>();
		map.put(14, "Dhoni");
		map.putAll(hm);
		System.out.println("After invoking putAll() method: ");
		for (Entry<Integer, String> m : map.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}
	}

}
