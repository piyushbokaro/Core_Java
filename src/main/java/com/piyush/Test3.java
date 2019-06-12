package com.piyush;

class Arith {
	byte b1=10;
	byte b2=20;
	byte b3=(byte) (b1+b2);
	short s1=30;
	short s2=29;
	short s3=(short) (s1+s2);
	//System.out.println(b3);
	{
		System.out.println(s3);
		float f1=10.5f;
		float f2=10.5f;
		float f3=f1+f2;
		System.out.println(f3);
		double d1=10.0;
		double d2=20.1;
		float f4=(float)(d1+d2);
		System.out.println(f4);
		int x=0/10;
		System.out.println(x);
		double y=0.0/10;
		System.out.println(y);
		double p=10/0.0;
		System.out.println(p);
		int s=100;
		s+=10;
		System.out.println(s);
	}
}
public class Test3 {
	public static void main(String arg[]) {
		Integer i1 = 128;
		Integer i2 = 128;
		if(i1==i2){
			System.out.println("true");
		}
		if(i1.equals(i2)){
			System.out.println("Equals True");
		}
		
		Arith a=new Arith();
		System.out.println(a.getClass());
	}
}