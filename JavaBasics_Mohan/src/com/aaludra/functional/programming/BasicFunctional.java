package com.aaludra.functional.programming;

import java.util.List;
import java.util.stream.IntStream;

public class BasicFunctional {
	public static void main(String[] args) {
		
	List<Integer> num = List.of(2, 4, 6, 8, 10, 12, 14, 16);
	num.stream().map(e -> e * e).forEach(p -> System.out.println(p));
	System.out.println("-----------------");

	List.of("Apple", "Orange", "Grape").stream().map(e -> e.toLowerCase()).forEach(p -> System.out.println(p));
	System.out.println("------------------");

	List.of("Apple", "Orange", "Grape").stream().map(e -> e.length()).forEach(p -> System.out.println(p));
	System.out.println("----------------");

	List.of(9, 3, 5, 2, 6, 10, 1, 7, 4, 8).stream().sorted().forEach(p -> System.out.println(p));

}}
