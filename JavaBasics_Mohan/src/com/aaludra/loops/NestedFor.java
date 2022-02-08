package com.aaludra.loops;

public class NestedFor {

	public static void main(String[] args) {
		for (int i = 10; i >= 1; i--) {
			for (int j = 10; j >= i; j--) {
				System.out.print(i);
			}
			System.out.println("");
		}
		int i = 10;
		while (i > 0) {
			int j = 0;
			while (j < (11 - i)) {
				System.out.print(i);
				j++;
			}
			i--;
			System.out.println("");
		}
		int k = 10;
		do {
			int j = 0;
			do {
				System.out.print(k);
				j++;
			} while (j < (11 - k));

			System.out.println("");
			k--;
		} while (k > 0);
	}
}