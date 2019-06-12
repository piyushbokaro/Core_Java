package com.test.design.pattern;

import java.util.Random;

public class TestFlyweightPattern {

	private static final String colors[] = { "","Red", "Green", "Blue", "White",
			"Black" };
	public static int a = 0;

	public static void main(String[] args) {

		for (int i = 0; i < 6; ++i) {
			Circle circle = (Circle) ShapeFactory.getCircle(getRandomColor());
			circle.setX(getRandomX());
			circle.setY(getRandomY());
			circle.setRadius(100);
			circle.draw();
		}
	}

	private static String getRandomColor() {
		System.out.print(Math.random());
		a++;
		Random rn = new Random();
		int max = 5;
		int min = 0;
		int randomNumber = rn.nextInt((max - min)) + min;
		System.out.print("Random Number:"+randomNumber);
		System.out.println("\t Color:" + colors[randomNumber]);
		return colors[randomNumber];
	}

	private static int getRandomX() {
		return (int) (Math.random() * 100);
	}

	private static int getRandomY() {
		return (int) (Math.random() * 100);
	}
}