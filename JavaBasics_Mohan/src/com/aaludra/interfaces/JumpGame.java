package com.aaludra.interfaces;

public class JumpGame implements InterfaceGaming {

	@Override
	public void up() {
		System.out.println("jump");

	}

	@Override
	public void down() {
		System.out.println("Bend Down");

	}

	@Override
	public void left() {
		System.out.println("Move Left");

	}

	@Override
	public void right() {
		System.out.println("Move Right");

	}

}
