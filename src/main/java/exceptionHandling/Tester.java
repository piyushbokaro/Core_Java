package exceptionHandling;

import java.util.Scanner;

class A {
	void foo() throws Exception  { 
		System.out.println("A");
	//	throw new Exception();
	}
}
class SubB2 extends A {
	void foo() throws Exception{
		System.out.println("B "); 
	}
}
public class Tester {
	public static void main(String[] args) {
		String csv = "Sue,5,true,3";
		Scanner scanner = new Scanner( csv );
		scanner.useDelimiter(",");
		 int age = scanner.nextInt();
		 System.out.println(age);
			try {
				new SubB2().foo();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
}