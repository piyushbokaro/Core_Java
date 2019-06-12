package com.piyush;

public class ShowColors {
	public static void main(String[] args) {
		Colors[] color=Colors.values();
		for(Colors colo:color) {
			System.out.println("Colors are :"+colo);
		}
		int x=4;
		System.out.println(x>>1);
	}
}
