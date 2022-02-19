package com.aaludra.generics;

import java.util.ArrayList;
import java.util.List;

public class GenericsNum<T extends Number>{
	List<T> list = new ArrayList<>();

	public void addElements(T elements1) {
		list.add(elements1);
	}

	public void removeElements(T elements1) {
		list.remove(elements1);
	}
	public String toString() {
		return list.toString();

	}

	public T get(int i) {
		return list.get(i);
	}
}
