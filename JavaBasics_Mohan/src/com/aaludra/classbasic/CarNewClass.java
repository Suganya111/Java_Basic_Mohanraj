package com.aaludra.classbasic;

public class CarNewClass {
	public void run() { // Run Method
		System.out.println("car is Best");
	}

	public static void main(String[] args) {
		CarNewClass audi = new CarNewClass(); // Instances
		CarNewClass bmw = new CarNewClass();

		audi.run(); // Behavior
	    bmw.run();
	}
}
