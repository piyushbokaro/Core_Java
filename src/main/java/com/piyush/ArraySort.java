package com.piyush;

import java.util.Arrays;

public class ArraySort {
	public static void main(String[] args) {
		String s1="Piyush";
		String s2="KumarPiyushKumarPiyush";
		s2=s2+s1;
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s2.length());
		//	int x=Integer.parseInt("s");
		//	System.out.println(x);
		Object [] myObjects = {
				new Integer(12),
				new Integer(1),
				new Integer(5)
			//	new Boolean(true)
		};
		Arrays.sort(myObjects);
		for(int i=0; i<myObjects.length; i++) {
			System.out.print(myObjects[i].toString());
			System.out.print(" ");
		}
	}
}
