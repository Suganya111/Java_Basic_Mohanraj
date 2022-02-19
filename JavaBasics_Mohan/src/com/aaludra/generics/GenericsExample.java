package com.aaludra.generics;

public class GenericsExample {

	public static void main(String[] args) {
		GenericsEx<String> list = new GenericsEx<>();
		list.addElements("Element1");
		list.addElements("Element2");
		list.addElements("Element3");
		list.removeElements("Element2");
		// String value = list.get(0);
		System.out.println(list);

		GenericsEx<Integer> list2 = new GenericsEx<>();
		list2.addElements(Integer.valueOf(2));
		list2.addElements(Integer.valueOf(32));
		Integer value1 = list2.get(0);
		System.out.println(value1);

		GenericsEx<Double> list3 = new GenericsEx<>();
		list3.addElements(Double.valueOf(2.25));
		list3.addElements(Double.valueOf(32.1));
		Double value2 = list3.get(0);
		System.out.println(list3);

	}

}
