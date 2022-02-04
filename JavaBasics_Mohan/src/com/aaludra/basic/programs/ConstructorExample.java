package com.aaludra.basic.programs;

public class ConstructorExample {
	private int speed; // instance variable

	ConstructorExample(int speed) {
		this.speed = speed;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		if (speed > 0)
			this.speed = speed;
		// System.out.println(speed);
		// System.out.println(this.speed);
	}

	public void increaseSpeed(int howMuch) {
		this.speed = this.speed + howMuch;
	}

	void run() { // Run Method

		System.out.println("car is Best");

	}

}
