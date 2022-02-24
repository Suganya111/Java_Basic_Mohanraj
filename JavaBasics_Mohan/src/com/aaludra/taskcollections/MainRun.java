package com.aaludra.taskcollections;

import java.util.ArrayList;
import java.util.List;

public class MainRun {
	public static void main(String[] args) {
		List<TestGrades> list = new ArrayList<>();
		list.add(new TestGrades("T2", 70));
		list.add(new TestGrades("T3", 90));
		list.add(new TestGrades("T4", 10));
		TestGrades r = new TestGrades("T5", 40);
		r.setGrade(r.getGrad());
		list.add(r);
		for (TestGrades t : list) {
			t.setGrade(t.getGrad());
		}
		for (TestGrades n : list) {
			System.out.println(n.getSubject() + " " + n.getMark() + " " + n.getGrad());
		}
	}
}
