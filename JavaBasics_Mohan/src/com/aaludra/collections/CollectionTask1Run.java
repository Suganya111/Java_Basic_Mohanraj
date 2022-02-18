package com.aaludra.collections;

import java.util.Scanner;

public class CollectionTask1Run {

	public static void main(String[] args) {
		CollectionTask1 mark = new CollectionTask1();
		System.out.println("Enter number of Subject");
		Scanner sc = new Scanner(System.in);
		int in = sc.nextInt();
		mark.setTotalSubject(in);
		mark.setMark(45, 0);
		mark.setMark(60, 1);
		mark.setMark(45, 2);
		mark.setMark(50, 3);

		System.out.println("Average: " + mark.returnAvg());

	}
}