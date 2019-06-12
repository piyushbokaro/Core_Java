package com.test.core;


 class AbstractTest1{
	
	public AbstractTest1() {
		System.out.println("AbstractTest1");
	}
}

class Hi extends AbstractTest1{
	
	public Hi() {
	System.out.println("Hi");
	}
}
public class AbstractTest {
	
	public static void main(String[] args) {
		System.out.println("Hi");
		AbstractTest1 hi= new Hi();
		
	}
}
