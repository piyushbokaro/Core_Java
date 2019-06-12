package com.piyush;

class SuperCalc {
	protected static int multiply(int a, int b) {
		System.out.println("SuperCalc");	
		return a * b;
	}
}

class SubCalc extends SuperCalc{
	public static int multiply(int a, int b) {
		System.out.println("SubCalc");
		int c = SuperCalc.multiply(a, b);
		return c;
	}
}

public class Test1 {
	public static void main(String[] args) {
		System.out.println(""+SubCalc.multiply(3,4));
		System.out.println(""+SubCalc.multiply(2,2));

	}

}
