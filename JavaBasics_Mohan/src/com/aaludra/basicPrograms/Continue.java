package com.aaludra.basicPrograms;

public class Continue {

	public static void main(String[] args) {
		int i = 1;
		while (i <= 10) {
			if (i == 6) {
				i++;
				continue;
			}
			System.out.println(i);
			i++;
		}
	}

}
