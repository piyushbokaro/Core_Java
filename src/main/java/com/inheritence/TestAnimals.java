package com.inheritence;

class Animal {
	static int A = 10;	
	{
		System.out.println("Animal : Instance Block");
	}
	static {
		System.out.println("Animal : Static Block");
	}
	Animal(){
		System.out.println("Animal : Default Cons");
	}
	public void eat(){
		System.out.println("Animal is Eating");
	}
	public int add(int x, int y){
		System.out.println("Animal");
		return x+y;
	}
	public static int sub(int x, int y){
		System.out.println("Animal");
		return x-y;
	}
}
class Horse extends Animal{
	static int A = 20;
	{
		System.out.println("Horse : Instance Block");
	}
	static {
		System.out.println("Horse : Static Block");
	}
	Horse(){
		System.out.println("Horse : Default Cons");
	}
	public int add(int x, int y){
		System.out.println("Horse");
		return x+y;
	}
	public static int sub(int x, int y){
		System.out.println("Animal");
		return x-y;
	}
	void makeNoise(){
		
	}
}
public class TestAnimals {
	public static void main(String[] args) {
		Horse h = new Horse();
		h.eat();
		System.out.println(Horse.A);
		System.out.println(h.add(4, 6));
		Animal a = new Horse();
		System.out.println(Animal.A);
		System.out.println(a.add(5, 3));
		if(a instanceof Horse){
			System.out.println("True");
			((Horse) a).makeNoise();
		}
	}
}
