package com.aaludra.basicPrograms;

public class CarNewClass {
	void Run() { // Run Method
		System.out.println("car is Best");
	}

	public static void main(String[] args) {
		CarNewClass Audi = new CarNewClass(); // Instances
		CarNewClass Bmw = new CarNewClass();

		Audi.Run(); // behaviour
		Bmw.Run();
	}
}
