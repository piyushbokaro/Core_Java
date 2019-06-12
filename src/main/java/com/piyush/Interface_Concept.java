/**
 * Interface can extend only Interface not Classes
 * Interface can neither Implement Interface nor Classes
 * Interface can not be Instantiated
 * We can create a reference variable of Interface 
 */
package com.piyush;

interface I1 {
	public static final int a1=10;
	public static final String str="No";
}
interface I2 {
	public static final String str="Yes";
}
interface I3 extends I1,I2 {
	String concat=I2.str+I1.str;
}

public class Interface_Concept implements I3 {
	public static void main(String[] args) {
		System.out.println(I3.a1);
		System.out.println(I1.str);
		System.out.println(I3.concat);

	}

}
