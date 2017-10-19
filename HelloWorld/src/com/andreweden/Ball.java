package com.andreweden;

public class Ball {
	private boolean bouncing = false;
	
	public void bounce() {
		bouncing = true;
	}

	public boolean isBouncing() {
		return bouncing;
	}
}