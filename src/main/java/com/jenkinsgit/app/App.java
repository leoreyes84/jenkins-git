package com.jenkinsgit.app;

public class App {

//	public static void main(String[] args) {
//		System.out.println(" Hello world ");
//	}

	public int multiply(int x, int y) {
		// the following is just an example
		if (x > 999) {
			throw new IllegalArgumentException("X should be less than 1000");
		}
		return x * y;
	}

}
