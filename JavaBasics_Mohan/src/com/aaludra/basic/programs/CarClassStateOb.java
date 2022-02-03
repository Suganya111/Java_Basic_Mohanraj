package com.aaludra.basic.programs;

public class CarClassStateOb { // CarClassStateOb is template 
	int speed; // instance variable
	
	void run() { // Run Method
		
		System.out.println("car is Best");
	}


		public class CarClassStateObrun {

			public static void main(String[] args) {

				CarClassStateOb audi = new CarClassStateOb(); // Instances
				CarClassStateOb bmw = new CarClassStateOb();

				audi.run(); // Behavior
				bmw.run();
				
				audi.speed = 100;
				bmw.speed = 120;
				System.out.println(audi.speed);
				System.out.println(bmw.speed);
	}
}
	}