package com.inheritence;

class SuperClass {
	int c=5,d=5, e=9;
	static int f = 10;
	public SuperClass() {
		System.out.println("Default Constructor: SuperClass");
	}
	public SuperClass(int a, int b){
		this.c=a;
		this.d=b;
		System.out.println("2-Argument Contructor: SuperClass");
	}
	static{
		System.out.println("Static Block Super Class");
	}
	{
		System.out.println("Instance Block : SuperClass");
	}
	private int add(){
		System.out.println("Add Method No Arg: SuperClass");
		return c+d;
	}
	public int add(int a, int b){
		System.out.println("Add Method Two Arg: SuperClass");
		return a+b;
	}
	public static void multiply(int a, int b){
		System.out.println("SuperClass a*b :"+(a*b));
	}
}
class SubClass extends SuperClass{
	int a=10,b=10;
	public SubClass() {
		System.out.println("Default Constructor: SubClass");
	}
	public SubClass(int a, int b){
		this.a=a;
		this.b=b;
		System.out.println("2-Argument Contructor: SubClass");
	}
	
	static{
		System.out.println("Static Block Sub Class");
	}
	{
		System.out.println("Instance Block : SubClass");
	}
	public int add(){
		System.out.println("Add Method No Arg: SubClass");
		return a+b+c;
	}
	public int add(int a, int b){
		System.out.println("Add Method Two Arg: SubClass");
		c=11;
		return a+b;
	}
	public static void multiply(int a, int b){
		System.out.println("SubClass a*b :"+(a*b));
	}
}
public class InheritenceConcept {
	public static void main(String[] args) {
		SuperClass sp = new SubClass();
	//	sp.add();
		System.out.println("a = "+sp.c);
		SuperClass sp1 = new SubClass(7, 8);
		SubClass sb = new SubClass();
		System.out.println("kdhsjdhjsh" + sb.add(6, sb.f));
		System.out.println(sb.add());
	}

}
