package com.aaludra.functional.programming;

import java.util.List;
import java.util.function.Predicate;

public class TerminalBasic {

	public static void main(String[] args) {

		Predicate<? super Integer> evenPredicate = evenExtracted();
		Integer optional = List.of(23, 17, 22, 9).stream().filter(evenPredicate).max((n1, n2) -> Integer.compare(n1, n2)).get();
		System.out.println(optional);
	}

	private static Predicate<? super Integer> evenExtracted() {
		return n -> n % 2 == 1;
	}
}