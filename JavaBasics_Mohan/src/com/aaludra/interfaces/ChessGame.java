package com.aaludra.interfaces;

public class ChessGame implements InterfaceGaming {

	@Override
	public void up() {
		System.out.println("Move UP");

	}

	@Override
	public void down() {
		System.out.println("Move Down");
		
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
