package com.aaludra.stringtokenizer;

import java.util.StringTokenizer;

public class StringTokenizerExample {

	public static void main(String args[]) {
		StringTokenizer st = new StringTokenizer("India is my Country", " ");
		while (st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
	}

}
