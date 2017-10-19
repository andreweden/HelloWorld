package com.andreweden;

public class HelloWorld {

	public static void main(String[] args) {
		Ball ball = new Ball();
		System.out.println("Ball bouncing?" + ball.isBouncing());
		ball.bounce();
		System.out.println("Ball bouncing?" + ball.isBouncing());
	}

}
