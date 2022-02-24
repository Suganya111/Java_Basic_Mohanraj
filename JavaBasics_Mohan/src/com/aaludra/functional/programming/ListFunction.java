package com.aaludra.functional.programming;

import java.util.List;

public class ListFunction {

	public static void main(String[] args) {
		List<String> name = List.of("Coimbatore", "Chennai", "Salem", "Madurai");

		extracted1Filter(name);
	}

	/*
	 * private static void extracted(List<String> name) { for (String names : name)
	 * { System.out.println(names); } } private static void
	 * extractedFilter(List<String> name) { for (String names : name) {
	 * if(names.endsWith("i")) System.out.println(names); } }
	 * 
	 * private static void extracted1(List<String> name1) {
	 * name1.stream().forEach(element -> System.out.println(element)); }
	 */

	private static void extracted1Filter(List<String> name1) {
		name1.stream().filter(element -> element.endsWith("i")).forEach(element -> System.out.println(element));
	}
}
