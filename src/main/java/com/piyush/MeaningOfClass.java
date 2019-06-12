/**
 * 
 */
package com.piyush;

class Hello {
	int x,y;
	static int a,b;
	static {
		System.out.println("Static Block");
	}
	{
		System.out.println("Instance Block");
	}
	Hello(){
		System.out.println("Inside Default Constructor");
	}
	public Hello(int x, int y, int a, int b) {
		this.x = x;
		this.y = y;
		Hello.a=a;
	//	this.b=b;
		Hello.b=b;
		System.out.println("Inside Parametrised Constructor");
	}
	public void add() {
		System.out.println("Sum :"+(x+y));
		multiply();
	}
	public static void sub() {
		System.out.println("Sub :"+(a-b));
	}
	private void multiply() {
		System.out.println("Multiply :"+(a*b));
	}
}
public class MeaningOfClass {
	public static void main(String[] args) {
	//	Hello h = null;
	//	System.out.println("Before Object Creation");
		Hello h1 = new Hello(1,2,3,4);
		h1.add();
		Hello.sub();
		System.out.println(h1);
		System.out.println(h1.toString());
	}
}
