package com.aaludra.generics;

import java.util.ArrayList;
import java.util.List;

public class GenericsEx<T> {
	List<T> list = new ArrayList<>();

	public void addElements(T elements) {
		list.add(elements);
	}

	public void removeElements(T elements) {
		list.remove(elements);
	}

	public String toString() {
		return list.toString();

	}

	public T get(int i) {
		return list.get(i);
	}
}
