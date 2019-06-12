package com.piyush;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Prime {
	public static void main(String[] args) {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.print("Enter any Number ::: ");
			int n=Integer.parseInt(br.readLine());
			int i=0,count=0;
			for(i=2;i<n/2;i++) {
				if(n%i==0) {
					count++;
					break;
				}else
					continue;
			}
			if(count!=0) 
				System.out.println(n+" is not Prime no");
			else 
				System.out.println(n+" is Prime no");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
