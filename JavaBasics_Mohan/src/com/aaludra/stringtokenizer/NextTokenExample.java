package com.aaludra.stringtokenizer;

import java.util.StringTokenizer;

public class NextTokenExample {
	public static void main(String[] args) {
		StringTokenizer st = new StringTokenizer("India is,our,country");

		System.out.println("Next token is : " + st.nextToken(","));
	}
}
