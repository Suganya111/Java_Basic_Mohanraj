package com.aaludra.stringbuffer;

public class StringBufferExample {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("Java Basic");
		sb.replace(1,8, "Program");
		System.out.println(sb);

	}

}
