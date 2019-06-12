package com.inheritence;

public class Testing{
	public static  void add(short a){
		System.out.println("Testing Add ::"+a);
	}
	public static  void add(short... a){
		System.out.println("Testing Add.... ::"+a);
	}
	public static void main(String[] args) {
		int a = 10;
		add((short)a);
		try{
			System.out.println("Inside Try");	
			System.out.println(7/0);
		}catch (Exception e) {
			System.out.println("Inside Catch");
		}finally{
			System.out.println("Inside Finally");
		}
	}

}
