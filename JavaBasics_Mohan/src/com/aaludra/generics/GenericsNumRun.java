package com.aaludra.generics;

import java.util.ArrayList;
import java.util.List;

public class GenericsNumRun {

	static <X> X doubleValue(X value) {
		return value;
	}

	static <X extends List> void duplicate(X list) {
		list.addAll(list);
	}

	public static void main(String[] args) {
		/*
		 * Integer number = doubleValue (Integer.valueOf(2)); String value = doubleValue
		 * (new String()); ArrayList value1 = doubleValue (new ArrayList());
		 * System.out.println(value1);
		 */
		ArrayList<Integer> numbers = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6));
		duplicate(numbers);
		System.out.println(numbers); // duplicateValue

		GenericsNum<Integer> list = new GenericsNum<>();
		list.addElements(Integer.valueOf(30));
		list.addElements(Integer.valueOf(50));
		list.addElements(Integer.valueOf(60));
		list.removeElements(Integer.valueOf(30));
		System.out.println(list);

		GenericsNum<Integer> list2 = new GenericsNum<>();
		list2.addElements(Integer.valueOf(2));
		list2.addElements(Integer.valueOf(32));
		System.out.println(list2);

	}

}
