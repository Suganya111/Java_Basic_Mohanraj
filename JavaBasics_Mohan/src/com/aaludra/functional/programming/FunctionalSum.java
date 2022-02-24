package com.aaludra.functional.programming;

import java.util.List;

public class FunctionalSum {

	public static void main(String[] args) {
		List<Integer> num = List.of(7,9,8,6);
//	int sum =	extracted1(num);
	/*private static int extracted(List<Integer> name) {
		int sum = 0;
		for (int names:name) {
			sum = sum+names;
		}
		return sum;
	}


	private static int extracted1(List<Integer> name) {
	int sum= num.stream().reduce(0, (num1, num2)-> num1+num2);
	System.out.println(sum);

	}*/
	extracted1(num);

		
	}

	private static void extracted1(List<Integer> num) {
		int sum = num.stream().filter(nums -> nums%2==0).reduce(0, (num1, num2)->{
			System.out.println(num1+"  "+num2);
		return num1+num2;
		});
		System.out.println(sum);
	}}
