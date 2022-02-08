package com.aaludra.decision.making;

public class IfElseIf {

	public static void main(String[] args) {
		int marks = 100;

		if (marks < 40) {
			System.out.println("fail");
		} else if (marks == 40) {
			System.out.println("E grade");
		} else if (marks >= 40 && marks < 60) {
			System.out.println("D grade");
		} else if (marks >= 60 && marks < 80) {
			System.out.println("C grade");
		} else if (marks >= 80 && marks < 90) {
			System.out.println("B grade");
		} else if (marks >= 90 && marks < 99) {
			System.out.println("A grade");
		} else {
			System.out.println("S grade");
		}
	}

}
