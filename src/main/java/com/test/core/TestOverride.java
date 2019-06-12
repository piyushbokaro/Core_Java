package com.test.core;

public class TestOverride {

	
public static void main(String[] args) {
	Box demo=new Box();
	Demo demo2=(Demo)demo;
	demo2.add();
}
	

}

class Demo {
	public  void add()throws ArrayIndexOutOfBoundsException{
		System.out.println("Demo Add");
	}
}
class Box extends Demo{
	
	public  void add() throws ArrayIndexOutOfBoundsException{
		System.out.println("Box Add");
	}
}

