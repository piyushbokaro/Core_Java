package com.piyush;

import java.io.IOException;

class A {
	public void process() throws IOException { 
		System.out.print("A,"); 
	}
}
class B extends A {
	static String o = "";
	public void process() throws IOException {
		super.process();
		System.out.print("B,");
		throw new IOException();
	}
	public static void main(String[] args) {
		try { 
			z:
				for(int x = 2; x < 7; x++) {
					if(x==3) continue;
					if(x==5) break z;
					o = o + x;
				}
			System.out.println(o);
			String str = "null";
			if (str.equalsIgnoreCase("null")) {
				System.out.println("null");
			} else if(str.length() == 0) {
				System.out.println("zero");
			} else {
				System.out.println("some");
			}
	
			new B().process();
		}
		catch (IOException e) { System.out.println("Exception"); }
	}
}