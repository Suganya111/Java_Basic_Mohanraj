package com.aaludra.classbasic;

public class CarNewClass {
	void run() { // Run Method
		System.out.println("car is Best");
	}

	public static void main(String[] args) {
		CarNewClass audi = new CarNewClass(); // Instances
		CarNewClass bmw = new CarNewClass();

		audi.run(); // Behavior
		bmw.run();
	}
}
