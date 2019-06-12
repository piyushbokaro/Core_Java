package com.test.core;

 enum SingletonEnum {
	 INSTANCE;
	 public void doStuff(){
	     System.out.println("Singleton using Enum");
	 }
	}

public class TestSingleton{
	public static void main(String[] args) {
		System.out.println(SingletonEnum.INSTANCE.hashCode());
		System.out.println(SingletonEnum.INSTANCE.hashCode());
		
		SingletonEnum enu = SingletonEnum.INSTANCE;
		enu.doStuff();
	    }
}
