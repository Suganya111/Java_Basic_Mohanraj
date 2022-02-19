package com.aaludra.collections;

import java.util.ArrayList;
import java.util.List;

public class Basic {

	public static void main(String[] args) {
		List<BasicNew> list = new ArrayList<>();
		list.add(new BasicNew(10, "T1"));
		list.add(new BasicNew(10, "T2"));
		list.add(new BasicNew(23, "T3"));
		double avg=0;
		double sum = 0;
	for (int i=0;i<list.size();i++) {
		sum= sum + list.get(i).getMark();
		avg = sum/list.size();
	}
	
	System.out.println(avg);
	}

}
