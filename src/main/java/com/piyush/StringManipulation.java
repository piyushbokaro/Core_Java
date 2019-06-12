package com.piyush;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class StringManipulation {
	public static void main(String[] args) {
		String str1 = "A";
		String str2 = "A";
		if(str1 == str2){
			System.out.println("equal");
		}
		String[] colors={"Red","Blue","Green","Yellow","White"};
		System.out.println("Different Colors used are");
		for(String color:colors){
			System.out.println(color);
		}
		String str=new String();
		System.out.println("Enter any Word");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		try {
			str=br.readLine();
			System.out.println(str.concat(" is great"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
