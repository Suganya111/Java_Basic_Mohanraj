package com.aaludra.exception.handling;

public class NestedTryEx {
	public static void main(String args[]) {
		String str = "Science Easy";
		int[] x = { 0, 1, 2, 3, 4 };
		try {
			int slength = str.length();
			System.out.println("String length: " + slength);
			try {
				int y = 7;
				System.out.println(x[y]);
			} catch (ArrayIndexOutOfBoundsException aie) {
				System.out.println("Exception is thrown");
				System.out.println(aie.toString());
			}
		} catch (NullPointerException npe) {
			System.out.println("Exception is thrown ");
			System.out.println(npe.toString());
		}
	}
}
