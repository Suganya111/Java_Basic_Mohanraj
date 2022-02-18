package com.aaludra.collections;

import java.util.ArrayList;
import java.util.List;

public class TestRun { 

	public static void main(String[] args) {
		List<Test> list = new ArrayList<>();

		list.add(new Test("T1", 55));
		list.add(new Test("T2", 45));
		list.add(new Test("T3", 55));
		list.add(new Test("T4", 45));
		list.add(new Test("T5", 55));
		list.add(new Test("T6", 45));

		int sum = 0;
		int avg = 0;
		for (int i = 0; i < list.size(); i++) {
			sum = sum + list.get(i).getMark();
		}
		avg = sum / list.size();
		System.out.println("Average: " + avg);
		

	}
}
