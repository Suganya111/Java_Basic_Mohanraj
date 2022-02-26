package com.aaludra.interfaces;

import java.util.Scanner;

public class InterfaceTaskRun {

	public static void main(String[] args) {
		System.out.println("Enter Number");
		Scanner s = new Scanner(System.in);
		
		int input = s.nextInt();

		InterfaceTask1 loop = new InterfaceTask1();
		loop.whileLoop(input);
		System.out.println();
		loop.doWhileLoop(input);
		System.out.println("");
		loop.forLoop(input);
		System.out.println("");

	}

}
