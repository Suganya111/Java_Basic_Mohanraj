package com.aaludra.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionClassEx {
		public static void main(String[] args ) {
			List<String> list = new ArrayList<String>();
			list.add("Basic");
			list.add("Java");
			list.add("Programs");
			System.out.println("Basic Program:" + list);
			Collections.addAll(list, "Advanced", "Latest");
			System.out.println("After adding elements collection value:" + list);
			String[] str = { "Loops", "Statement" };
			Collections.addAll(list, str);
			System.out.println("After adding array collection value:" + list);
		}
	}
