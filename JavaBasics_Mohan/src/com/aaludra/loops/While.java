package com.aaludra.loops;
import java.util.Scanner;
public class While {
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	int n = s.nextInt();

		int i = n;
		while (i >= 1) {
			int j = 10;
			while (j >= i) {
				System.out.print(i);
				j--;
			}
			System.out.println("");
			i--;
		}
}
}