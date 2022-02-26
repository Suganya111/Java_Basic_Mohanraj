package com.aaludra.thread;

public class ThreadRun {

	public static void main(String[] args) {
		Thread t = new Thread("Java Learning");

		t.start();
		// getting the thread name by invoking the getName() method
		String str = t.getName();
		System.out.println(str);
	}

}
